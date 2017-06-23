import java.util.*;

class CHAPD_5
{
	public static void main(String arg[])
	{
		int i,count=0,j=2,t;
		long a,b,c;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();	
		
		while(t-->0)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			c=primeFactors(b);
			
			if(a%c==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	
	public static long primeFactors(long n)
	{
		long ret=1;
		
		// Print the number of 2s that divide n
		
		if(n%2==0)
		ret*=2;
		while (n%2 == 0)
		{
			//System.out.print(" "+ 2);
			n = n/2;
		}
 
		// n must be odd at this point.  So we can skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(n); i = i+2)
		{
			// While i divides n, print i and divide n
			
			if(n%i==0)
			ret*=i;
			while (n%i == 0)
			{
				//System.out.print(" "+i);
				n = n/i;
			}
		}
	
		// This condition is to handle the case whien n is a prime number greater than 2	
		if (n > 2)
		ret*=n;
	
		return ret;
	}
	
}