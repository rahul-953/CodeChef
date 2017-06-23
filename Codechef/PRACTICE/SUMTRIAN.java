import java.io.*;

class SUMTRIAN
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int i,j;
			String Sarr[];
			int arr[][] = new int[n][n];
			int dp[][] = new int[n][n];
			
			for(i=0;i<n;i++)
			{
				Sarr = br.readLine().split(" ");	
				
				for(j=0;j<i+1;j++)
				{	
					arr[i][j] = Integer.parseInt(Sarr[j]);	
					dp[i][j] = Integer.MIN_VALUE;
				}
			}
			dp[0][0] = arr[0][0];
			
			for(i=1;i<n;i++)
			{
				dp[i][0] = dp[i-1][0] + arr[i][0];
				dp[i][i] = dp[i-1][i-1] + arr[i][i];
				
				for(j=1;j<i;j++)
				{
					dp[i][j] = arr[i][j]+(int)Math.max(dp[i-1][j-1],dp[i-1][j]);
				}
			}
			
			int max = dp[n-1][0];
			for(i=1;i<n;i++)
			{
				if(dp[n-1][i]>max)
				max = dp[n-1][i];	
			}
			
			pw.println(max);
		}
		pw.close();
	}
}