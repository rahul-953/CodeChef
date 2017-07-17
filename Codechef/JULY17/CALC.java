import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class CALC {

	public static void main(String[] args) throws IOException {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		long N, B;

		while (testCases-- > 0) {
			N = sc.nextLong();
			B = sc.nextLong();
			long Ynum2 = 0L, Ynum1 = 0L;

			long num1 = (N / B) / 2;
			long num2 = num1 + 1;

			Ynum1 = (N - num1 * B) * num1;
			Ynum2 = (N - num2 * B) * num2;
			long Ynum = (long) Math.max(Ynum1, Ynum2);

			pw.println(Ynum);
		}

		pw.close();
		sc.close();
	}
}