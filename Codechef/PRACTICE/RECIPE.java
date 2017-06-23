import java.util.*;

class RECIPE
{
	public static void main(String aarg[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n;
			n=sc.nextInt();
			int a[]=new int[n];
			int i,gcd;
			
			for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			
			gcd=GCD(a[0],a[1]);
			
			for(i=2;i<n;i++)
			gcd=GCD(gcd,a[i]);
			
			for(i=0;i<n;i++)
			System.out.print((a[i]/gcd)+" ");
			System.out.println();
		}
	}
	private static int GCD(int a,int b)
	{
		if(b==0)
			return a;
		else
			return GCD(b,a%b);
	}
}