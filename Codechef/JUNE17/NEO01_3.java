import java.util.Arrays;
import java.util.Scanner;
class NEO01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		int n;
		while (testCases-- > 0) {
			n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
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
