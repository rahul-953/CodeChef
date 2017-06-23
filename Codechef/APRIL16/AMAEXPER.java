import java.io.*;
import java.util.Arrays;
import java.util.*;

class AMAEXPER {

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());
		int n, u, v;
		long w;
		int i;
		String text[];

		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			long Adj[][] = new long[n][n];
			long max = 0;

			for (i = 1; i < n; i++) {
				text = br.readLine().split(" ");
				u = Integer.parseInt(text[0]);
				v = Integer.parseInt(text[1]);
				w = Long.parseLong(text[2]);
				Adj[u - 1][v - 1] = w;
				Adj[v - 1][u - 1] = w;
				if (w > max) {
					max = w;
				}
			}

			pw.println(max);
			for (i = 1; i < n; i++) {
				pw.println("0");
			}
		}

		pw.close();
	}
}