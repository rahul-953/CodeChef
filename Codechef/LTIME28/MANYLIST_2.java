import java.io.*;
import java.util.*;

class MANYLIST_2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		String nm[] = (br.readLine().split(" "));
		int n = Integer.parseInt(nm[0]),m = Integer.parseInt(nm[1]);
		
		String quer[];
		int status[][] = new int[n][n+1];
		
		while(m-->0)
		{
			quer = br.readLine().split(" ");
			
			if(quer.length>2 )
			{
				int i = Integer.parseInt(quer[1])-1;
				int r = Integer.parseInt(quer[2])-1;
				int x = Integer.parseInt(quer[3]);
				
				while(i<=r)
				{
					if(status[i][x]!=1)
					{
						status[i][x]=1;
						status[i][0]++;
					}
					i++;
				}
			}
			
			else
			pw.println(status[Integer.parseInt(quer[1])-1][0]);			
		}
		
		pw.close();
	}
}