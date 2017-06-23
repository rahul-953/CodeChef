
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

class CHMTDV {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input[];
		input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int p = Integer.parseInt(input[1]);
		int i = 0;
		// for (; i < n; i++) {
		// input = br.readLine().split(" ");
		// }

		HashSet<Integer> horizontal = new HashSet<Integer>();
		HashSet<Integer> vertical = new HashSet<Integer>();

		for (i = 1; i < p; i++) {
			int rand = (int) (1 + Math.random() * (n - 2));
			if (horizontal.contains(rand))
				i--;
			else
				horizontal.add(rand);
		}
		for (i = 1; i < p; i++) {
			int rand = (int) (1 + Math.random() * (n - 2));
			if (vertical.contains(rand))
				i--;
			else
				vertical.add(rand);
		}

		int hori[] = new int[p - 1];
		int verti[] = new int[p - 1];
		i = 0;
		for (Integer set : horizontal) {
			hori[i] = set;
			i++;
		}
		// System.out.println();
		i = 0;
		for (Integer set : vertical) {
			verti[i] = set;
			i++;
		}
		Arrays.sort(hori);
		Arrays.sort(verti);
		for (i = 0; i < p - 1; i++)
			System.out.print(hori[i]+" ");
		System.out.println();
		for (i = 0; i < p - 1; i++)
			System.out.print(verti[i]+" ");
	}

}
