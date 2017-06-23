

import java.util.*;
import java.io.*;

/**
 * 
 * 111100111101 111110011110 111101111100
 * 
 * 111111111100
 * 
 **/

class CHEFSUBA {

	private static int arr[], karr[];
	private static int n, k, p;
	private static int start, end;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		p = Integer.parseInt(input[2]);
		PrintWriter pw = new PrintWriter(System.out);
		if (k > n)
			k = n;
		// int p = sc.nextInt();
		int i = 0;
		arr = new int[2 * n];
		int LR[] = new int[2 * n];
		int RL[] = new int[2 * n];
		int max[] = new int[2 * n];

		start = 0;
		end = n - 1;

		input = br.readLine().split(" ");
		for (i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			arr[i + n] = arr[i];
		}

		for (i = 0; i < n; i++) { // for maximum Left to Right
			if (i % k == 0) // that means START of a block
				LR[i] = arr[i];
			else
				LR[i] = (LR[i - 1] + arr[i]);
		}

		for (i = n - 1; i >= 0; i--) { // for maximum Right to Left
			if (i == n - 1) // Maybe the last block is not of size 'W'.
				RL[i] = arr[i];
			else if (i % k == 0) // that means END of a block
				RL[i] = arr[i];
			else
				RL[i] = (RL[i + 1] + arr[i]);
		}

		for (i = 0; i < k; i++) // maximum
			max[i] = (int) Math.max(RL[i], LR[i + k - 1]);

		String line = br.readLine();

		for (i = 0; i < p; i++) {
			if (line.charAt(i) == '?')
				pw.println(maxOnes());
			else
				start = (start + n - 1) % n;
		}
		
		pw.close();
	}

	public static String printArray() {

		String array = "";
		for (int i = 0; i < 2 * n; i++) {
			array += karr[i];
		}
		return array;
	}

	public static void shift() {
		start = (start + n - 1) % n;
		end = (end + n - 1) % n;
	}

	public static int maxOnes() {

		int count = 0;
		int max = 0;

		for (int i = 0; i < k; i++)
			if (arr[(i + start) % n] == 1)
				count++;
		max = count;
		int temp_start = start;
		for (int i = (k + start) % n; i != start; i = (i + 1) % n) {
			count = count - arr[temp_start] + arr[i];
			max = (int) Math.max(count, max);
			temp_start = (temp_start + 1) % n;
		}

		return max;
	}

	public static void fill_K_Array() {

		int count = 0;

		for (int i = 0; i < k; i++)
			count += arr[i];

		karr[0] = count;
		// System.out.println("karr[0] = "+karr[0]);
		int prevIndex = 0;

		for (int i = 1; i < 2 * n - k + 1; i++) {
			count = count - arr[prevIndex] + arr[i + k - 1];
			karr[i] = count;
			prevIndex = i;
			// System.out.println("karr["+i+"] = "+karr[i]);
		}

		count = 0;
		for (int i = 2 * n - 1; i >= 2 * n - k + 1; i--) {
			count += arr[i];
			karr[i] = count;
			// System.out.println("karr["+i+"] = "+karr[i]);
		}
	}
}

class SegmentTree {
	static int st[];
	static int max_size;

	public String printArray() {

		String array = "";
		for (int i = 0; i < max_size; i++) {
			array += st[i];
		}
		return array;
	}

	SegmentTree(int arr[], int n) {
		int x = (int) (Math.ceil(Math.log(n) / Math.log(2)));

		max_size = 2 * (int) Math.pow(2, x) - 1;

		st = new int[max_size];

		constructSTUtil(arr, 0, n - 1, 0);
	}

	int getMid(int s, int e) {
		return s + (e - s) / 2;
	}

	int getMaxUtil(int ss, int se, int qs, int qe, int si) {
		if (qs <= ss && qe >= se)
			return st[si];
		if (se < qs || ss > qe)
			return 0;
		int mid = getMid(ss, se);
		return (int) Math.max(getMaxUtil(ss, mid, qs, qe, 2 * si + 1), getMaxUtil(mid + 1, se, qs, qe, 2 * si + 2));
	}

	int getMax(int n, int qs, int qe) {

		/**
		 * if (qs < 0 || qe > n - 1 || qs > qe) { System.out.println("Invalid
		 * Input"); return -1; }
		 **/

		return getMaxUtil(0, n - 1, qs, qe, 0);
	}

	int constructSTUtil(int arr[], int ss, int se, int si) {
		if (ss == se) {
			st[si] = arr[ss];
			return arr[ss];
		}

		int mid = getMid(ss, se);
		st[si] = (int) Math.max(constructSTUtil(arr, ss, mid, si * 2 + 1),
				constructSTUtil(arr, mid + 1, se, si * 2 + 2));
		return st[si];
	}
}