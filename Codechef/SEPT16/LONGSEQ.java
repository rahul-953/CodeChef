import java.io.*;
class LONGSEQ {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String input;
		
		while(t-->0){
			input = br.readLine();
			int len = input.length();
			int zero = 0;
			int ones = 0;
			
			for(int i=0;i<len;i++){
				if(input.charAt(i)=='1')
					ones++;
				else zero++;
			}
			
			if(ones==1 || zero==1){
				System.out.println("Yes");
			}else System.out.println("No");
		}
	}
}