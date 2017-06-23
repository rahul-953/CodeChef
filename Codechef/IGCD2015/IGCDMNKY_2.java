import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class IGCDMNKY_2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String hnm[] = br.readLine().split(" ");
			int h = Integer.parseInt(hnm[0]);
			int n = Integer.parseInt(hnm[1]);
			int m = Integer.parseInt(hnm[2]);
			double count = 0.000;
			int curr = 0,next = 0;
			
			while(curr!=h)
			{
				curr += n;
				if(curr==h)
				{
					count++;
					break;
				}
				else if(curr<h)
				{
					curr -=m;
					count++;
				}
				else
				{
					curr -= n ;
					count += (double)((double)(h-curr)/(double)n);
					break;
				}
			}
			pw.format(Locale.UK,"%.2f \n",count);	
			
		}
		
		pw.close();
	}
}