
/**
 *  I don't want to submit this bad code either but I am forced to do so.
 *  Version - 2.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

public class PRMQ {

	public static boolean isPrime(int n) {

		if (n % 2 == 0)
			return false;

		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static int no_of_Primes_in_XY(int n, int X, int Y) {

		int count = 0;
		while (n % 2 == 0) {
			if (X <= 2 && 2 <= Y)
				count++;
			n /= 2;
		}

		for (int i = 3; i * i <= n; i++) {
			while (n % i == 0) {
				if (X <= i && i <= Y)
					count++;
				n /= i;
			}
		}

		if (n > 2 && X <= n && n <= Y)
			count++;

		return count;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		boolean isPrime[] = new boolean[1000001];
		isPrime[0] = false;
		isPrime[1] = false;
		isPrime[2] = true;

		for (int i = 3; i < 1000001; i++) {
			isPrime[i] = isPrime(i);
		}

		int N = Integer.parseInt(br.readLine());

		String input[] = br.readLine().split(" ");

		int arr[] = new int[N];
		int i = 0;

		while (i < N) {
			arr[i] = Integer.parseInt(input[i]);
			i++;
		}

		// make Segment tree
		// SegmentTree segmentTree = new SegmentTree();
		// Node st[] = segmentTree.createSegmentTree(arr);

		int Q = Integer.parseInt(br.readLine());
		int L, R, X, Y;
		while (Q-- > 0) {
			input = br.readLine().split(" ");
			L = Integer.parseInt(input[0]) - 1;
			R = Integer.parseInt(input[1]) - 1;
			X = Integer.parseInt(input[2]);
			Y = Integer.parseInt(input[3]);
			int result = 0;
			for (int j = L; j <= R; j++) {
				result += no_of_Primes_in_XY(arr[j], X, Y);
			}

			System.out.println(result);
		}

		br.close();
		pw.close();
	}
}