import java.io.*;
import java.util.*;
class RRSUM
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		
		long Q,N,M,i=1L;
		String input[];
		
		input = br.readLine().split(" ");	
		N = Long.parseLong(input[0]);
		M = Long.parseLong(input[1]);
		
		
		while(M-->0){
			Q = Long.parseLong(br.readLine());
			if(Q>=(N+2) && Q<=(3*N)){
				if(Q<=(2*N)){
					pw.println(Q-N-1);
				}else if(Q<=(3*N)){
					pw.println(3*N-Q+1);
				}
			}else
				pw.println("0");
		}
		pw.close();
	}
}