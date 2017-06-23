import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class WDTBAM
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		String ws[];
		int n;
		
		while(t-->0)
		{
			n = Integer.parseInt(br.readLine());
			String correct = br.readLine();
			String ChefAns = br.readLine();
			ws = br.readLine().split(" ");
			
			int wi[] = new int[n+1];
			int i;
			
			for(i=0;i<n+1;i++)
			wi[i] = Integer.parseInt(ws[i]);
			
			int maxWin = 0,minLoss = 0;
			int maxMon = 0;
			
			for(i=0;i<n;i++)
			{
				if(correct.charAt(i)== ChefAns.charAt(i))
				maxWin++;	
				else
				minLoss++;	
			}
			
			if(minLoss>=1)
			{
				maxMon = wi[0];	
				for(i=1;i<=maxWin;i++)
				{
					if(wi[i]>=maxMon)
					maxMon = wi[i];	
				}
			}
			
			else
			{
				maxMon = wi[n];
			}
		
			
			pw.println(maxMon);
		}
		pw.close();
	}
}