import java.io.*;

class COLOR {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int n;
		int r = 0, g = 0, b = 0;
		String text;

		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			r = 0;
			b = 0;
			g = 0;
			text = br.readLine();
			int i;
			for (i = 0; i < n; i++) {
				if (text.charAt(i) == 'R')
					r++;
				else if (text.charAt(i) == 'G')
					g++;
				else
					b++;
			}

			r = (int) Math.max(Math.max(r, g), b);
			pw.println(n - r);
		}

		pw.close();
	}
}