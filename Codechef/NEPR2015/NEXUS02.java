import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class NEXUS02
{
	public static boolean isPrime(int n)
	{
		boolean status = true;
		int sqrtN = (int)Math.sqrt(n);
		int i=0;
		
		if(n==1)
		return false;
		
		if(n==2)
		return true;
	
		for(i=2;i<=sqrtN;i++)
		{
			if(n%i==0)	
			{
				status = false
				;break;
			}
		}
		
		return status;
	}
	
	public static int DigSum(int n)
	{
		int s = 0;
		
		while(n>0)
		{
			s = s + n%10;
			n /= 10;	 
		}
		
		return s;
	}
	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		int a,b;
		String ab[];
		
		while(n-->0)
		{
			ab = br.readLine().split(" ");
			
			a = Integer.parseInt(ab[0]);
			b = Integer.parseInt(ab[1]);
			int i=0,sum=0;
			
			for(i=a;i<=b;i++)
			{
				//System.out.println("No. is : "+i);
				if(isPrime(i))
				sum = sum + DigSum(i);	
			}
			
			pw.println(sum);
		}
		
		pw.close();
	}
}