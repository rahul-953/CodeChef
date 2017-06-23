import java.io.*;
import java.util.Arrays;

class DONUTS_21
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n,m;
		String nm[];
		
		while(t-->0)
		{
			String chain[];
			nm = br.readLine().split(" ");
			n = Integer.parseInt(nm[0]);	
			m = Integer.parseInt(nm[1]);	
			chain = br.readLine().split(" ");	
			
			int ser[] = new int[m];
			int i,j;
			
			for(i=0;i<m;i++)
			ser[i] = Integer.parseInt(chain[i]);
			
			Arrays.sort(ser);
			int count = 0 ;
			j=0;
			
			if(m==1)
			count = 0;

			else if(m==2)
			count = 1;
		
			else if(m==3)
			{
				if(ser[0]==1)
				count = 1;
			
				else
				count = 2;
			}	
			
			else
			{
				i = m-1;
				j=0;
				for(;i>j;)
				{
					if(ser[j]==1)
					{
						count++;
						j++;
						i--;
					}
					else
					{
						count++;
						i--;
					}
					
				}			
			}
			
			System.out.println(count);
		}
	}
}