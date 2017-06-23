import java.util.*;

class CSEQ_4
{
	public static void main(String aarg[])
	{
		int t,n,l,r;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			n=sc.nextInt();
			l=sc.nextInt();
			r=sc.nextInt();
			l=r-l+1;
			
			long ans=0;
			int mod=1000003;//+3;
			int i;
			long temp=1;
			long fact=1;
			
			for(i=1; i<=l && (fact%(mod-2))!=0 && (n%mod)!=0 && (temp%mod)!=0 &&(fact*mod)!=0;i++)
			{
				fact=(InverseEuler(i,mod))%mod;
				temp=((temp*n)*fact)%mod;
				ans=(ans+temp)%mod;
				n++;
			}
			
			System.out.println(ans);
		}
	}
	
	public static long pow(int a, int b, int MOD)
	{
		long x=1,y=a; 
		while(b > 0)
		{
			if(b%2 == 1)
			{
				x=(x*y);
				if(x>=MOD) x%=MOD;
			}
		
			y = (y*y);
			if(y>=MOD) y%=MOD; 
			b /= 2;
		}

		return x;
	}

	public static long InverseEuler(int n, int MOD)
	{
		return pow(n,MOD-2,MOD);
	}
}