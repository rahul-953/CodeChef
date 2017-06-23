
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
class FENWITER_2 {

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		String input[];
		String l1, l2, l3;
		int n;
		while (t-- > 0) {
			input = br.readLine().split(" ");
			l1 = input[0];
			l2 = input[1];
			l3 = input[2];
			n = Integer.parseInt(input[3]);

			String l = l1 + new String(new char[n]).replace("\0", l2) + l3;

			int ans = 1;
			BigInteger num = new BigInteger(l, 2);
			BigInteger fDown;
			while (true) {
				BigInteger numPlusOne = num.add(BigInteger.ONE);
				fDown = num.and(numPlusOne);
//				System.out.println("Fdown = "+(BigInteger.ZERO));
//				System.out.println("FDown = "+(fDown.equals(BigInteger.ZERO)));
				if (fDown.equals(BigInteger.ZERO)) {
					break;
				} else {
					num = fDown.subtract(BigInteger.ONE);
//					System.out.println("Num = "+num);
					ans++;
				}
			}
			System.out.println(ans);

		}
	}
}
