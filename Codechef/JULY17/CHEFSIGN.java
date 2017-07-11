import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFSIGN {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());

		while (testCases-- > 0) {
			String sign = br.readLine();
			int len = sign.length();
			String updated_sign = "";
			for (int i = 0; i < len; i++) {
				if (sign.charAt(i) != '=') {
					updated_sign += sign.charAt(i);
				}
			}

			len = updated_sign.length();
			int max = 1;
			int global_max = 1;
			for (int index = 1; index < len; index++) {
				if (updated_sign.charAt(index) == updated_sign.charAt(index - 1)) {
					max++;
				} else {
					global_max = (int) Math.max(max, global_max);
					max = 0;
				}
			}

			System.out.println(global_max + 1);
		}
		br.close();
	}

}
