import java.io.*;
import java.util.Arrays;
import java.util.*;

class DEVGOSTR_19 {

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
			// System.out.println(text[0]);
			if (temp.length() >= 3 && A == 1) {
				pw.println("0");
			} else if (temp.length() < 3 && A == 1) {
				pw.println("1");
			} else {
				total = new ArrayList<String>();
				String str = "";
				AllPermutationString(0, A, temp.length(), str);

				/**
				 * for(i=0;i<total.length;i++) System.out.println(total[i]);
				 */

				// ArrayList<String> nonGood =
				// Count_Number_Of_Not_Good_Strings(total);
				// pw.println();
				int ans = 0;
				boolean isUseful = true;
				int len = temp.length();

				ArrayList<String> nonGood = total;
				for (String s : nonGood) {
					int mismatch = 0;
					isUseful = true;
					// System.out.print("Not Good String = "+s);
					for (i = 0; i < len; i++) {

						/// System.out.println("Comparing s = "+s.charAt(i) +"
						/// with temp = "+temp.charAt(i));

						if (s.charAt(i) != temp.charAt(i))
							mismatch++;
						if (mismatch > K) {
							isUseful = false;
							break;
						}
					}

					if (isUseful)
						ans++;

					// System.out.println(" ans = "+ans);
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

		// System.out.print("Checking "+temp);
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

	public static ArrayList<String> Count_Number_Of_Not_Good_Strings(ArrayList<String> total) {

		int len = total.get(0).length();
		ArrayList<String> notGood = new ArrayList<String>();
		int tot = total.size();
		int i, j, diff;
		long count = 0L;
		boolean isGood = true;

		for (i = 0; i < tot; i++) {
			isGood = true;
			String temp = total.get(i);
			// System.out.print("Checking "+temp);
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
				notGood.add(temp);

			// System.out.println(" Count = "+count);
		}

		return notGood;
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
