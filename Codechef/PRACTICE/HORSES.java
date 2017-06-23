import java.io.*;
import java.util.*;
class HORSES
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int  Test_Cases = Integer.parseInt(br.readLine());
		int N_Horses = 1000000007;
		int i;
		String input[];
		long min_diff;
		
		while(Test_Cases-->0){
			N_Horses = Integer.parseInt(br.readLine());
			
			input = br.readLine().split(" ");	
			long skill[] = new long[N_Horses];
			
			for(i=0;i<N_Horses;i++)
				skill[i] = (Long.parseLong(input[i]));
			
			Arrays.sort(skill);
			min_diff = (long)Math.abs(skill[0]-skill[1]);
			for(i=1;i<N_Horses;i++){
				min_diff = (long)Math.min(min_diff,(long)Math.abs(skill[i]-skill[i-1]));
			}
			pw.println(min_diff);
		}
		pw.close();
	}
}