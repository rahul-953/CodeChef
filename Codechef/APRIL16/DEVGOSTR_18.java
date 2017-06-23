import java.io.*;
import java.util.Arrays;
import java.util.*;

class DEVGOSTR_18 {

	static int index = 0;
	static ArrayList<String> total;
	static long MOD = 1000000000 + 7;

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int A, K;
		int i;
		String text[];

		while (t-- > 0) {
			index = 0;
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
			} else {
				total = new ArrayList<String>();
				String str = "";
				AllPermutationString(0, A, len, str);

				int ans = 0;
				boolean isUseful = true;

				ArrayList<String> nonGood = total;
				for (String s : nonGood) {
					int mismatch = 0;
					isUseful = true;

					for (i = 0; i < len; i++) {
						if (s.charAt(i) != temp.charAt(i))
							mismatch++;
						if (mismatch > K) {
							isUseful = false;
							break;
						}
					}

					if (isUseful)
						ans++;
				}
				pw.println(ans);
			}
		}
		pw.close();
	}

	public static boolean isGood(String temp) {
		int len = temp.length();
		int i, j, diff;
		long count = 0L;
		boolean isGood = true;

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

	public static void AllPermutationString(int depth, int A, int len, String str) {

		if (depth == len) {
			total.add(str);
			return;
		}

		if (isGood(str + 'a'))
			AllPermutationString(depth + 1, A, len, str + 'a');
		if (isGood(str + 'b'))
			AllPermutationString(depth + 1, A, len, str + 'b');

		if (A == 3) {
			if (isGood(str + 'c'))
				AllPermutationString(depth + 1, A, len, str + 'c');
		}

		return;
	}
}
