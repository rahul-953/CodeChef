import java.io.*;
import java.util.*;
class NUKES
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		
		long A,N,K,i=1L;
		String input[];
		
		input = br.readLine().split(" ");	
		A = Long.parseLong(input[0]);
		N = Long.parseLong(input[1]);
		K = Long.parseLong(input[2]);
		
		Long M = N+1;
		System.out.print(A%M);
		while(i++<K){
			
			pw.print(" "+((A/M)%(N+1)));
			M *= (N+1);
		}
		pw.println();
		pw.close();
	}
}