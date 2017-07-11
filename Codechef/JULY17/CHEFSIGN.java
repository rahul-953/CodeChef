import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  5>4>3>2>1<2<3<4<5
 */

class CHEFSIGN {

	public static void main(String[] args) throws IOException {

		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases-- > 0) {
			String sign = br.readLine();
			sign = sign.replaceAll("=", "");
			int len = sign.length();

			if (len == 0) {
				System.out.println("1");
				continue;
			}

			int max = 1;
			int global_max = 1;
			for (int index = 1; index < len; index++) {
				if (sign.charAt(index) == (sign.charAt(index - 1))) {
					max++;
					global_max = (int) Math.max(max, global_max);

				} else {
					global_max = (int) Math.max(max, global_max);
					max = 0;
				}

				// System.out.println("Max = " + max + " global_max = " + global_max);
			}

			System.out.println(global_max + 1);
		}
		br.close();
	}

}
