import java.io.*;

class CHNGSS_12 {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter pw = new PrintWriter(System.out);

		String input[];
		int n, m, C;
		int i;

		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		C = Integer.parseInt(input[2]);

		int B[][] = new int[n][m];
		int j, k = 0;
		int avg;

		System.out.println("2 " + (1) + " " + (n) + " " + (1) + " " + (m));
		System.out.flush();
		avg = Integer.parseInt(br.readLine());
		avg = avg / (n * m);

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				B[i][j] = avg;
		}
		i = 3;

		for (j = 0; j < n && i < C; j++) {
			for (k = 0; k < m && i < C; k++) {
				System.out.println("2 " + (j + 1) + " " + (j + 1) + " " + (k + 1) + " " + (k + 1));
				System.out.flush();
				B[j][k] = Integer.parseInt(br.readLine());
				i++;
			}
		}

		if (j < n && k < m && ((j + 1) * (k + 1) > n * m)) {
			System.out.println("2 " + (j + 1) + " " + (n) + " " + (k + 1) + " " + (m));
			System.out.flush();
			avg = Integer.parseInt(br.readLine());
			avg = avg / (n * m - ((j + 1) * (k + 1)));
			int ii, jj;
			for (ii = j; ii < n; ii++) {
				for (jj = k; jj < m; jj++)
					B[ii][jj] = avg;
			}
		}

		System.out.println("3");
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.flush();
		}
		// pw.close();
	}
}