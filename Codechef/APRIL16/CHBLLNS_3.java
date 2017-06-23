import java.io.*;
import java.util.Arrays;

class CHBLLNS_3 {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int r[] = new int[3], k;
		String text[];

		while (t-- > 0) {
			text = br.readLine().split(" ");
			r[0] = Integer.parseInt(text[0]);
			r[1] = Integer.parseInt(text[1]);
			r[2] = Integer.parseInt(text[2]);
			k = Integer.parseInt(br.readLine());

			Arrays.sort(r);

			if (k <= (r[0] + 1)) {
				pw.println(1 + (k - 1) * 3);
			} else if (k <= (r[1] + 1)) {
				pw.println(1 + (r[0]) * 3 + (k - r[0] - 1) * 2);
			} else {
				pw.println(1 + (r[0]) * 3 + (r[1] - r[0]) * 2 + (k - r[1] - 1));
			}
		}

		pw.close();
	}
}