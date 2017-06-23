import java.util.*;
import java.io.*;

class  MSTEP
{
	public static void  main(String ar[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int i,j;
			String []line;
			int jump[][] = new int[2][n*n];
	
			for(i=1;i<=n;i++)
			{
				line = br.readLine().split(" ");
				int val;
				
				for(j=1;j<=n;j++)
				{
					val = Integer.parseInt(line[j-1]);
					jump[0][val-1] = i;
					jump[1][val-1] = j;
				}
			}
			
			int count = 0;
			for(i=1;i<n*n;i++)
			{
				count += (int)Math.abs( jump[0][i]-jump[0][i-1]) + (int)Math.abs(jump[1][i]-jump[1][i-1]);
			}
			System.out.println(count);
		}
	}
}