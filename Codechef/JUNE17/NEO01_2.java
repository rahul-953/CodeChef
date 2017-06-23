import java.util.Arrays;
import java.util.Scanner;
 class NEO01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		int n;
		while (testCases-- > 0) {
			n = sc.nextInt();
			long arr[] = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}

			Arrays.sort(arr);

			long happiness = 0L;
			long positiveHappy = 0L;
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i] < 0) {
					happiness += arr[i];

				} else {
					positiveHappy += arr[i];
					count++;
				}

			}

			System.out.println(happiness + (positiveHappy * count));
		}

		sc.close();
	}

}
