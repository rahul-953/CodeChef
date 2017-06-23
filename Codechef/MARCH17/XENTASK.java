import java.io.*;
import java.math.*;
import java.util.*;
class XENTASK {
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t;
		int n,i;
		String input[];

		t = Integer.parseInt(br.readLine());
		
		while(t-->0){
			long xennyFirst=0L,zanaFirst=0L;
			n = Integer.parseInt(br.readLine());					
			input = br.readLine().split(" ");
			int xenny[]  = new int[n];
			
			for(i=0;i<n;i++){
				xenny[i] = Integer.parseInt(input[i]);
			}
			int zana[]  = new int[n];
			input = br.readLine().split(" ");
			
			for(i=0;i<n;i++){
				zana[i] = Integer.parseInt(input[i]);
			}
			
			for(i=0;i<n;i+=2){
				xennyFirst += xenny[i] + ((i+1)<n?zana[i+1]:0);
				zanaFirst +=  zana[i]  + ((i+1)<n?xenny[i+1]:0);
			}
			pw.println(Math.min(xennyFirst,zanaFirst));
		}
		pw.close();
	}
}