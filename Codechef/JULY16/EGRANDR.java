import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EGRANDR {
	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		int min, max, tot, curr;

		int i;
		String input[];
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");
			curr = Integer.parseInt(input[0]);
			min = max = tot = curr;

			for (i = 1; i < n; i++) {
				curr = Integer.parseInt(input[i]);
				if (curr < min)
					min = curr;
				if (curr > max)
					max = curr;

				tot += curr;
			}
			if (min > 2 && max == 5 && (float) ((float) tot / (float) n) >= 4.0) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}
	}
}