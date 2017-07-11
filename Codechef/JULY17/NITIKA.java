import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NITIKA {

	public static void main(String[] args) throws IOException {

		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		String input[];
		while (testCases-- > 0) {
			input = br.readLine().split(" ");
			for (int i = 0; i < input.length; i++) {
				input[i] = input[i].toLowerCase();
				String temp = input[i].toUpperCase();
				temp = temp.charAt(0) + input[i].substring(1);
				input[i] = temp;
			}

			int len = input.length;
			switch (len) {

			case 1:
				System.out.println(input[0]);
				break;

			case 2:
				System.out.print(input[0].charAt(0) + ". ");
				System.out.println(input[1]);
				break;

			case 3:
				System.out.print(input[0].charAt(0) + ". " + input[1].charAt(0) + ". ");
				System.out.println(input[2]);
				break;
			}
		}

		br.close();
	}
}
