import java.io.*;
import java.util.*;

class MANYLIST
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		String nm[] = (br.readLine().split(" "));
		int n = Integer.parseInt(nm[0]),m = Integer.parseInt(nm[1]);
		
		String quer[];
		Set<Integer>[] status = new Set[n];
		
		for(int i=0; i<n; i++) 
		status[i] = new HashSet<Integer>();
        	
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
					if(!status[i].contains(x))
					{
						status[i].add(x);
					}
					i++;
				}
			}
			
			else
			pw.println(status[Integer.parseInt(quer[1])-1].size());			
		}
		
		pw.close();
	}
}