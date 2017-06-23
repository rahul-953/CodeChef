import java.io.*;
import java.util.Arrays;

class RESCALC_2 {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		String input[];

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			int i, j;
			int type[][] = new int[n][6];
			int ans[] = new int[n];

			for (i = 0; i < n; i++) {
				input = br.readLine().split(" ");
				int len = input.length - 1;

				ans[i] = len;
				for (j = 0; j < len; j++) {
					type[i][Integer.parseInt(input[j + 1]) - 1]++;
				}
			}

//			System.out.println("Scores before ");
//			for (i = 0; i < n; i++)
//				System.out.print(ans[i] + " ");
//			System.out.println();

			for (i = 0; i < n; i++) {
				Arrays.sort(type[i]);

//				System.out.println("Array after sorting ");
//				for (j = 0; j < 6; j++) {
//					System.out.print(type[i][j]);
//				}
//				System.out.println();

				for (j = 0; j < 3; j++) {
					switch (j) {
					case 0:
						if (type[i][j] != 0) {
							ans[i] += (4 * type[i][j]);
							for (int k = 1; k < 6; k++)
								type[i][j] -= type[i][0];
							type[i][0] = 0;
						}
						break;
					case 1:
						if (type[i][j] != 0) {
							ans[i] += (2 * type[i][j]);
							for (int k = 2; k < 6; k++)
								type[i][k] -= type[i][1];
							type[i][1] = 0;
						}
						break;
					case 2:
						if (type[i][j] != 0) {
							ans[i] += (1 * type[i][j]);
							for (int k = 3; k < 6; k++)
								type[i][j] -= type[i][2];
							type[i][2] = 0;
						}
						break;
					}
				}
			}

//			System.out.println("Scores..");
//			for (i = 0; i < n; i++)
//				System.out.print(ans[i] + " ");
//			System.out.println();

			int largest = ans[0];
			int index = 0;
			int tie = -1;
			for (i = 1; i < n; i++) {
				if (ans[i] > largest) {
					largest = ans[i];
					index = i;
					tie = 0;
				} else if (ans[i] == largest) {
					// System.out.println("tie");
					// break;
					tie = 1;
					index = i;
				}

			}

			if (tie == 1)
				System.out.println("tie");
			else if (index != 0)
				System.out.println(index+1);
			else
				System.out.println("chef");
		}
	}
}