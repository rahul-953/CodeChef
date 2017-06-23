import java.util.*;

class EQUALITY
{
	public static void main(String aarg[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n;
			n=sc.nextInt();
			
			long a[]=new long[n];
			long sum=0;
			for(int i=0;i<n;i++)
			{	
				a[i]=sc.nextLong();
				sum+=a[i];
			}
			
			if(n>1)
			sum/=(n-1);
			
			for(int i=0;i<n;i++)
			{
				System.out.print((sum-a[i])+" ");
			}
		}
	}
}