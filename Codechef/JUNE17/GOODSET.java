import java.util.Scanner;

class GOODSET {

	private static int[] goodArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		goodArray = new int[500];
		init();

		int testCases = sc.nextInt();
		int n_size;
		while (testCases-- > 0) {
			n_size = sc.nextInt();
			for (int r = 0; r < n_size; r++) {
				System.out.print(goodArray[r] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

	private static void init() {

		goodArray[0] = 2;
		goodArray[1] = 3;
		goodArray[2] = 4;

		int index = 3;
		int count = 3;

		for (int num = 5; num <= 500 && count <= 100; num++) {
			boolean canAdd = true;

			for (int i = 0; i < index && canAdd; i++) {
				for (int j = i + i; j < index; j++) {
					if (goodArray[i] + goodArray[j] == num) {
						canAdd = false;
						break;
					}
				}
			}

			if (canAdd) {
				goodArray[index++] = num;
				count++;
			}
		}
	}
}
