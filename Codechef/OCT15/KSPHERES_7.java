import java.io.*;

class KSPHERES_7
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int MOD = 1000000000+7;
		String nmc[] = (br.readLine().split(" "));
		int n,m,c;
		int i,j=0;
		long dp[][] = new long[2][1000];
		
		n = Integer.parseInt(nmc[0]);
		m = Integer.parseInt(nmc[1]);
		c = Integer.parseInt(nmc[2]);
		
		nmc = br.readLine().split(" ");
		for(i=0;i<n;i++)
		dp[0][Integer.parseInt(nmc[i])-1]++;	
	
		nmc = br.readLine().split(" ");
		for(i=0;i<m;i++)
		dp[1][Integer.parseInt(nmc[i])-1]++;	
		
		j=0;
		for(i=0;i<1000;i++)
		{
			dp[0][i] = (dp[0][i]*dp[1][i]);	
			
			if(dp[0][i]>0)
			j++;
		}
		
		int len = j;
		long arr[] = new long[len];
		long sumTerm[] = new long[len];
		
		j = 0;
		//pw.println("\n\nArray : ");
		for(i=0;i<1000;i++)
		{
			if(dp[0][i]>0)
			{
				arr[j] = dp[0][i];		
				//pw.print(arr[j]+" ");
				j++;
			}
		}
		
		long sum = 0;
		for(i=len-1;i>=0;i--)
		{
			sum += arr[i];
			sumTerm[i] = sum; 
		}
		
		long ans = 0;
		long term[] = new long[len];
		//System.out.println("\n Term is : ");
		for(j=0;j<len-1;j++)
		{
			term[j] = (arr[j]*sumTerm[j+1])%MOD;
			//System.out.print(term[j]+" ");
			ans += term[j]%MOD;
		}
		//System.out.println("\n");
		
		sum = 0;
		//System.out.println("Sum Term is : ");
		for(j=len-1;j>=0;j--)
		{
			sum += term[j];
			sumTerm[j] = sum;
			//System.out.print(sumTerm[j]+" ");
		}
		
		pw.print(ans+" ");
		
		for(i=2;i<=c;i++)
		{
			j=0;
			len--;
			ans = 0;
			sum = sumTerm[0];
			//System.out.println("\nI is : "+i);
			for(int k=0;k<len-1;k++)
			{
				term[k] = (arr[k])*(sumTerm[k+1])%MOD;
				//System.out.print(term[k]+" ");
				ans = (ans+term[k])%MOD;
			}
			pw.print(ans%MOD+" ");
			
			sum = 0;
			//System.out.println("\nSum term is  : ");
			for(j=len-2;j>=0;j--)
			{
				sum += term[j];
				sumTerm[j] = sum;
				//System.out.print(sumTerm[j]+" ");	
			}
		}
		
		pw.println();
		
		pw.close();
	}
}