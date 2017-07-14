import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class CALC {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int testCases = Integer.parseInt(br.readLine());

		long N, B;
		String input[];

		while (testCases-- > 0) {
			input = br.readLine().split(" ");
			N = Long.parseLong(input[0]);
			B = L   ong.parseLong(input[1]);
			long num = N * N;
			long den = 4L * B;
			long ans = num / den;

			if (N >= 2 && N >= 2 * B) {
				pw.println(ans);
			} else {
				pw.println("0");
			}

		}

		pw.close();
		br.close();
	}
}