import java.io.*;
import java.util.Arrays;
import java.util.*;

class DEVGOSTR_23 {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int A, K;
		int i;
		String text[];

		while (t-- > 0) {
			text = br.readLine().split(" ");
			A = Integer.parseInt(text[0]);
			K = Integer.parseInt(text[1]);
			text = br.readLine().split(" ");
			// System.out.println(text[0]);
			if (text[0].length() >= 3 && A == 1) {
				pw.println("0");
			} else if (text[0].length() < 3 && A == 1) {
				pw.println("1");
			}
		}

		pw.close();
	}
}
