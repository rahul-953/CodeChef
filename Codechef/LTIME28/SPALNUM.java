import java.io.*;
import java.util.*;

class SPALNUM
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String lr[] = br.readLine().split(" ");
			int l = Integer.parseInt(lr[0]) ,r = Integer.parseInt(lr[1] );
			int i = l;
			long count = 0;
			
			while(i<=r)
			{
				int rev = 0;
				int temp = i;	
				while(temp>0)
				{
					rev = rev*10+temp%10;
					temp /= 10;
				}
				if(i==rev)
				count += i;
				
				i++;
			}
			
			pw.println(count);
		
		}
		
		pw.close();
	}
}