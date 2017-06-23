import java.util.*;

class BROKPHON {
	public static void main(String arg[]) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		while (t-- > 0) {
			int n;
			n = sc.nextInt();
			long a[] = new long[n];
			int i;

			for (i = 0; i < n; i++)
				a[i] = sc.nextLong();

			int count = 0, prev = -1;

			for (i = 0; i < n - 1; i++) {
				if (a[i] != a[i + 1] && prev != i) {
					count += 2;
					prev = i + 1;
				} else if (a[i] != a[i + 1] && prev == i) {
					count += 1;
					prev = i + 1;
				}
			}
			// printf("%d\n",count);
			System.out.println(count);
		}

	}
}