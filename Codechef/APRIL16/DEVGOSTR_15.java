import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class AllPermute extends Thread {

	static long MOD = 1000000000 + 7;
	/// 0,A,len,str,K,temp
	int depth, len, A, K;
	String original, str;

	public AllPermute(int depth, int A, int len, String str, int K, String original) {
		this.depth = depth;
		this.A = A;
		this.len = len;
		this.K = K;
		this.str = str;
		this.original = original;
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
		int j, diff;

		boolean isGood = true;
		boolean isHamming = true;

		if (len > K) {
			isHamming = isHamming(temp, K, original);
		}

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
		if (isGood && isHamming)
			return true;
		return false;
	}

	public void run() {

		if (depth == len) {
			DEVGOSTR_15.ans = (DEVGOSTR_15.ans + 1) % MOD;
			return;
		}

		try {
			if (isGood(str + 'a', K, original)) {
				AllPermute p2 = new AllPermute(depth + 1, A, len, str + 'a', K, original);
				p2.start();
				p2.join();
				// AllPermutationString(depth+1,A,len,str+'a',K,original);
			}

			if (isGood(str + 'b', K, original)) {
				AllPermute p3 = new AllPermute(depth + 1, A, len, str + 'b', K, original);
				p3.start();
				p3.join();
				// AllPermutationString(depth+1,A,len,str+'b',K,original);
			}

			if (A == 3) {
				if (isGood(str + 'c', K, original)) {
					AllPermute p4 = new AllPermute(depth + 1, A, len, str + 'c', K, original);
					p4.start();
					p4.join();
					// AllPermutationString(depth+1,A,len,str+'c',K,original);
				}
			}
		} catch (Exception e) {
			System.out.println("In run");
		}

		return;
	}
}

public class DEVGOSTR_15 {
	public static long ans = 0L;

	public static void main(String arg[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int A, K;
		String text[];

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
			} else {

				try {
					// total = new ArrayList<String>();
					String str = "";
					String original = temp;
					AllPermute p1 = new AllPermute(0, A, len, str, K, original);
					p1.start();
					p1.join();
					// p1.AllPermutationString();
					System.out.println(ans);
				} catch (Exception e) {
					System.out.println("In main");
				}
			}
		}
		pw.close();
	}
}