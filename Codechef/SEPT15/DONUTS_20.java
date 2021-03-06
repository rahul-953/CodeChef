import java.io.*;
import java.util.Arrays;

class DONUTS_20
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
				int chainRem = m;
				i = m-1;
				j = 0;
				count = 0;
				
				while(ser[j]==1)	
				{
					count++;
					j++;
					i--;
					ser[i-1] = 2;
					chainRem-=2;
				}
				
				if(chainRem>1)
				count += (int)Math.ceil((float)chainRem/2.0);
			}
			
			System.out.println(count);
		}
	}
}