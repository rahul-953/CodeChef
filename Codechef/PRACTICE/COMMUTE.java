import java.io.*;

class COMMUTE {
	public static void main(String arg[] )throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		int testCase = Integer.parseInt(br.readLine());	
		int n;
		int x,l,f;
		int i;
		int t=0;
		String input[];
		
		while(testCase-->0){
			t = 0;
			n = Integer.parseInt(br.readLine());
			
			while(n-->0){
				input = br.readLine().split(" ");
				x =  Integer.parseInt(input[0]);
				l =  Integer.parseInt(input[1]);
				f =  Integer.parseInt(input[2]);
				if(t<=x){
					t += (l+x-t);
				}else if(t>x){
					i = (int)Math.ceil((t-x)/(double)f) +1;
					t += (x+(i-1)*f)-t+l;
				}
			}
			pw.println(t);
		}
		pw.close();
	}
}
