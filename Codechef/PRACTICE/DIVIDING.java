import java.util.*;

class DIVIDING
{
     public static void main(String arg[])
     {
           Scanner sc=new Scanner(System.in);
           long n=sc.nextLong();
	   long i=n;
           long sum=0;

	   while(n-->0)
	  {
	      long c=sc.nextLong();
	    sum+=c;
	}
	
	    if((i*(i+1))/2 ==sum)
		System.out.println("YES");
	else
	System.out.println("NO");

     }
}