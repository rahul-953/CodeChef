/// Idea
/**		
*		Store for all possible n before only
*
*/

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class ADTRI_3
{
	// A function to print all prime factors of a given number n
	public static boolean primeFactors(int n)
	{
		boolean status = false;
		
		
		// Print the number of 2s that divide n
		while (n%2 == 0)
		n = n>>1;
		
		int sqrt = (int)Math.sqrt(n);
		// n must be odd at this point.  So we can skip one element (Note i = i +2)
		for (int i = 3; (i<=sqrt)&& (!status); i = i+2)
		{
			// While i divides n, print i and divide n
			while (n%i == 0)
			{
				if(i%4==1)
				{
					status = true;	
					break;
				}
				n = n/i;
			}
			sqrt = (int)Math.sqrt(n);
		}
	 
		// This condition is to handle the case when n is a prime number greater than 2
		if (n > 2 && n%4==1)
		status = true;
	
		return status;
	}
	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		int n;
		int N = 5*1000000;
		boolean dp[] = new boolean[N];
			
		while(t-->0)
		{
			n = Integer.parseInt(br.readLine());
			
			if(n%5==0)
			pw.println("YES");
			
			else if(primeFactors(n))
			pw.println("YES");
			
			else
			pw.println("NO");
		}
		pw.close();
	}
}