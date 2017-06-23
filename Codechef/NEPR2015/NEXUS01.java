import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class NEXUS01
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		int n,i;
		int max;
		String ai[];
		long add=0;
		
		while(t-->0)
		{
			n  = Integer.parseInt(br.readLine());
			ai = br.readLine().split(" ");
			
			int a[] = new int[n]; 
			max = 0;
			add = 0;
			for(i=0;i<n;i++)
			{
				a[i] = Integer.parseInt(ai[i]); 	
				if(a[i]>max)
				max = a[i];
			}
			
			for(i=0;i<n;i++)
			{
				if(a[i]<max)
				add += (max-a[i]);	
			}
			pw.println(add);
		}
		
		pw.close();
	}
}