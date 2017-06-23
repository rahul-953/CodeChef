import java.util.*;

class CHAPD
{
	public static void main(String arg[])
	{
		int i,count=0,j=2,t;
		long a,b,c,d;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();	
		
		while(t-->0)
		{
			a=sc.nextLong();
			b=sc.nextLong();
			//c=primeFactors(b);
			
			//if(b>a)
			//a=a+b-(b=a);	
			
			do
			{
				c=gCd(a,b);
				d=b/c;
				a=c;
				b=d;
				
			}while(c!=1);
			
			if(d>1)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
	
	public static long gCd(long x, long y) 
	{
		if(y == 0) 
		{
			return x;
		}
		return gCd(y, x%y);
	}	
}