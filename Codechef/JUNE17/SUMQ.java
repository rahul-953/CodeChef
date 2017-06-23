import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

 class SUMQ {

	public static final long MOD = 1000000007;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int testCases = Integer.parseInt(br.readLine());
		String input[];
		int p, q, r;
		while (testCases-- > 0) {
			input = br.readLine().split(" ");
			p = Integer.parseInt(input[0]);
			q = Integer.parseInt(input[1]);
			r = Integer.parseInt(input[2]);
			long A[], B[], C[];
			A = new long[p];
			B = new long[q];
			C = new long[r];
			long a_sum = 0l, b_sum = 0l, c_sum = 0l;
			input = br.readLine().split(" ");
			for (int i = 0; i < p; i++) {
				A[i] = Long.parseLong(input[i]);
				a_sum = (a_sum + A[i]);
			}
			input = br.readLine().split(" ");
			for (int i = 0; i < q; i++) {
				B[i] = Long.parseLong(input[i]);
				b_sum = (b_sum + B[i]);
			}
			input = br.readLine().split(" ");
			for (int i = 0; i < r; i++) {
				C[i] = Long.parseLong(input[i]);
				c_sum = (c_sum + C[i]);
			}

			Arrays.sort(A);
			Arrays.sort(B);
			Arrays.sort(C);

			int b_index = q - 1, c_index = r - 1, a_index = p - 1;

			long lastIndex_C[] = new long[q];
			while (b_index >= 0 && c_index >= 0) {

				if (B[b_index] >= C[c_index]) {
					lastIndex_C[b_index] = (((c_index + 1) * B[b_index]) % MOD + c_sum)
							% MOD;
					b_index--;

				} else {
					c_sum -= C[c_index];
					c_index--;
				}
			}

			if (c_index < 0) {
				while (b_index >= 0) {
					lastIndex_C[b_index--] = 0;
				}
			}

			b_index = q - 1;
			c_index = r - 1;
			a_index = p - 1;
			long lastIndex_A[] = new long[q];
			long lastIndex_B[] = new long[q];

			while (b_index >= 0 && a_index >= 0) {

				if (B[b_index] >= A[a_index]) {
					lastIndex_B[b_index] = ((((a_index + 1) * B[b_index]) % MOD + a_sum)
							% MOD * (lastIndex_C[b_index]))
							% MOD;
					b_index--;

				} else {
					a_sum -= A[a_index];
					a_index--;
				}
			}

			if (a_index < 0) {
				while (b_index >= 0) {
					lastIndex_B[b_index--] = 0;
				}
			}

			long sum = 0L;
			for (int i = 0; i < q; i++) {
				sum = (sum + lastIndex_B[i]) % MOD;
			}

			pw.println(sum);
		}

		br.close();
		pw.close();

	}
}