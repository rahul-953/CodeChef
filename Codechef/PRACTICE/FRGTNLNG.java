import java.io.*;
import java.util.*;

class FRGTNLNG
{
	public static void main( String  arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int i,j;
		int t = Integer.parseInt(br.readLine());
		int n,k;
		String input[];
		
		while(t-->0)
		{
			Set<String> MODERN = new HashSet<String>();
			input = (br.readLine().split(" "));
			n = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			
			String FORGOTTEN[] = br.readLine().split(" ");
			//Arrays.sort(FORGOTTEN);
			
			for(i=0;i<k;i++)
			{
				input = br.readLine().split(" ");
				int l = Integer.parseInt(input[0]);
				for(j=0;j<l;j++)
					MODERN.add(input[j+1]);
			}
			
			for(i=0;i<n;i++)
			{
				if(MODERN.contains(FORGOTTEN[i]))
					pw.print("YES ");
				else
					pw.print("NO ");
			}
			pw.println();
		}
		
		pw.close();
	}
}