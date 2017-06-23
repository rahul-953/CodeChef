import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class UNIONSET_6 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int testCases = Integer.parseInt(br.readLine());
		int n, k, len;
		String input[];
		while (testCases-- > 0) {

			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			int count = 0;
			int arr[][] = new int[n][];

			for (int i = 0; i < n; i++) {
				input = br.readLine().split(" ");
				len = Integer.parseInt(input[0]);
				arr[i] = new int[len];
				for (int j = 0; j < len; j++) {
					arr[i][j] = Integer.parseInt(input[j + 1]);
				}
			}

			for (int i = 0; i < n; i++) {
				len = arr[i].length;
				for (int j = i + 1; j < n; j++) {
					if (add(arr[i], arr[j]) == k) {
						count++;
					}
				}
			}

			pw.println(count);
		}

		br.close();
		pw.close();
	}

	public static int add(int a[], int b[]) {
		Set<Integer> set = new HashSet<Integer>();

		for (Integer ai : a) {
			set.add(ai);
		}
		for (Integer bi : b) {
			set.add(bi);
		}

		return set.size();
	}

	public static int union(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set = new HashSet<Integer>();

		set.addAll(list1);
		set.addAll(list2);

		return set.size();
	}
}