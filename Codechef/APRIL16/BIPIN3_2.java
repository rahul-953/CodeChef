import java.io.*;
import java.util.Arrays;

class BIPIN3_2 {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		long t = Long.parseLong(br.readLine());
		long n, k;
		long MOD = 1000000000 + 7;
		String text[];

		while (t-- > 0) {
			text = br.readLine().split(" ");
			n = Long.parseLong(text[0]);
			k = Long.parseLong(text[1]);

			pw.println(((((long) Math.pow(k - 1, n - 1)) % MOD) * (k % MOD)) % MOD);

		}

		pw.close();
	}
}