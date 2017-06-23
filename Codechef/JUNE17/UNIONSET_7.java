import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class UNIONSET_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		int n, k, len;
		while (testCases-- > 0) {

			n = sc.nextInt();
			k = sc.nextInt();
			int count = 0;
			int arr[][] = new int[n][];

			for (int i = 0; i < n; i++) {
				len = sc.nextInt();
				arr[i] = new int[len];
				for (int j = 0; j < len; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < n; i++) {
				len = arr[i].length;
				for (int j = i + 1; j < n; j++) {
					if (add(arr[i], arr[j]) == k) {
						count++;
					}
				}
			}

			System.out.println(count);
		}

		sc.close();
	}

	public static int add(int a[], int b[]) {
		Set<Integer> set = new HashSet<Integer>();

		for (Integer ai : a) {
			set.add(ai);
		}
		for (Integer bi : b) {
			set.add(bi);
		}

		return set.size();
	}

	public static int union(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set = new HashSet<Integer>();

		set.addAll(list1);
		set.addAll(list2);

		return set.size();
	}
}