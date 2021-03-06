import java.io.*;
import java.util.Arrays;
import java.util.*;

class DEVGOSTR_6 {

	static long ans = 0L;
	static long MOD = 1000000000 + 7;
	static LinkedList<String> twenty[] = new LinkedList[7];

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		twenty[0] = new LinkedList<String>();
		twenty[1] = new LinkedList<String>();
		twenty[2] = new LinkedList<String>();
		twenty[3] = new LinkedList<String>();
		twenty[4] = new LinkedList<String>();
		twenty[5] = new LinkedList<String>();
		twenty[6] = new LinkedList<String>();

		// for(int l = 27;l<=27;l++){
		// long start = System.nanoTime();
		AllPermutationString(0, 3, 27, "", 28, "abcdefghijklmnopqrtsuvwxyzza");
		// long end = System.nanoTime();
		// System.out.println("Time for len = "+l+" =
		// "+(double)((double)((end-start))/(1000000000L)));
		// }

		int t = Integer.parseInt(br.readLine());
		int A, K;
		int i;
		String text[];
		//
		while (t-- > 0) {

			ans = 0L;
			text = br.readLine().split(" ");
			A = Integer.parseInt(text[0]);
			K = Integer.parseInt(text[1]);
			text = br.readLine().split(" ");

			String temp = text[0];
			int len = temp.length();

			if (len >= 3 && A == 1) {
				pw.println("0");
			} else if (len < 3 && A == 1) {
				pw.println("1");
			} else if (len >= 27 && len <= 50 && A == 3) {
				pw.println("0");
			} else if (len >= 20 && len <= 26 && A == 3) {
				int dem = len % 10;
				for (String saved : twenty[dem]) {
					if (isHamming(temp, K, saved))
						ans++;
				}
				pw.println(ans);
			} else {
				String str = "";
				AllPermutationString(0, A, len, str, K, temp);
				pw.println(ans);
			}
		}
		// long end = System.nanoTime();
		// System.out.println("Time =
		// "+(long)((long)((end-start))/(1000000000L)));
		pw.close();
	}

	public static boolean isHamming(String str, int K, String temp) {
		int i;
		int len = str.length();
		int mismatch = 0;

		for (i = 0; i < len; i++) {
			if (str.charAt(i) != temp.charAt(i))
				mismatch++;
			if (mismatch > K) {
				return false;
			}
		}

		return true;
	}

	public static boolean isGood(String temp, int K, String original) {
		int len = temp.length();
		int i, j, diff;
		long count = 0L;
		boolean isGood = true;
		boolean isHamming = true;

		if (len > K) {
			isHamming = isHamming(temp, K, original);
		}

		if (!isHamming)
			return false;

		for (j = 0; j < len - 2 && isGood; j++) {
			for (diff = 1; diff <= (len - 1) / 2; diff++) {
				if ((j + 2 * diff) >= len)
					break;
				if (temp.charAt(j) == temp.charAt(j + diff) && temp.charAt(j) == temp.charAt(j + 2 * diff)) {
					isGood = false;
					break;
				}
			}
		}
		if (isGood)
			return true;
		return false;
	}

	public static void AllPermutationString(int depth, int A, int len, String str, int K, String original) {

		if (depth == len) {
			ans = (ans + 1);
			return;
		} else if (depth == 20) {
			twenty[0].add(str);
		} else if (depth == 21) {
			twenty[1].add(str);
		} else if (depth == 22) {
			twenty[2].add(str);
		} else if (depth == 23) {
			twenty[3].add(str);
		} else if (depth == 24) {
			twenty[4].add(str);
		} else if (depth == 25) {
			twenty[5].add(str);
		} else if (depth == 26) {
			twenty[6].add(str);
		}

		if (isGood(str + 'a', K, original))
			AllPermutationString(depth + 1, A, len, str + 'a', K, original);
		if (isGood(str + 'b', K, original))
			AllPermutationString(depth + 1, A, len, str + 'b', K, original);

		if (A == 3) {
			if (isGood(str + 'c', K, original))
				AllPermutationString(depth + 1, A, len, str + 'c', K, original);
		}

		return;
	}
}