import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class SUBINC_2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		String arr[];
		int n;
		
		while(t-->0)
		{
			n = Integer.parseInt(br.readLine());
			arr = br.readLine().split(" ");
			int i;
			int a[] = new int[n];
			long j=1,ans=0;
			
			for(i=0;i<n;i++)
			a[i] = Integer.parseInt(arr[i]);	
		
			for(i=1;i<n;i++)
			{
				if(a[i]>=a[i-1])
				j++;
			
				else
				{
					ans = ans + (j*(j+1))/2;
					j=1;
				}
			}
			
			ans = ans + (j*(j+1))/2;	
			
			pw.println(ans);
		}
		pw.close();
	}
}