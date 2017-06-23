import java.io.*;
import java.util.*;

class FLOW006 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while (T != 0) {
			char[] c = br.readLine().toCharArray();
			int sum = 0;
			
			for (char b : c) {
				sum += (b - '0');
			}
			
			sb.append((sum) + "\n");
			
			T--;
		}
		System.out.print(sb);
	}
}