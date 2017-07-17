import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class EXPTREE {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		final long MOD1 = 1000000000L + 7L;
		final long MOD2 = 1000000000L + 9L;

		int testCases = Integer.parseInt(br.readLine());
		long N;
		while (testCases-- > 0) {
			N = Long.parseLong(br.readLine()) - 1;
			long a1 = N, a2 = N + 1, b = (4 * N - 2);

			if (N == 0) {
				pw.println("0 0");
				continue;
			}

			long gcd1 = gcd(a1, b);
			a1 /= gcd1;
			b /= gcd1;
			gcd1 = gcd(a2, b);
			a2 /= gcd1;
			b /= gcd1;

			long a = ((a1 % MOD1) * (a2 % MOD1)) % MOD1;
			long inverse = pow(b % MOD1, MOD1 - 2, MOD1) % MOD1;

			pw.print((a * inverse) % MOD1 + " ");

			a = ((a1 % MOD2) * (a2 % MOD2)) % MOD2;
			inverse = pow(b % MOD2, MOD2 - 2, MOD2) % MOD2;

			pw.println((a * inverse) % MOD2 + " ");
		}

		br.close();
		pw.close();
	}

	public static long gcd(long a, long b) {

		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static long pow(long base, long exponent, long mod) {

		if (exponent == 0)
			return 1L;

		long half = pow(base, exponent / 2, mod) % mod;
		half = (half * half) % mod;

		return exponent % 2 == 0 ? half : (half * base) % mod;
	}
}