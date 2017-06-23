import java.util.Scanner;

class XENRANK {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		long u, v;
		while (testCases-- > 0) {
			u = sc.nextLong();
			v = sc.nextLong();
			System.out.println(rank(u, v));
		}

		sc.close();
	}

	private static long rank(long u, long v) {
		long n = u + v;
		return (n*(n+1))/2 + (n+1-v);
	}

}
