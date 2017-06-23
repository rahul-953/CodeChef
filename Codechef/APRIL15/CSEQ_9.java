import java.util.*;

class CSEQ_9
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
			//long temp=n;
			int mod=1000003;//+3;
			
			//long a[]=new long[l+1];
			int i;

			if(n>mod-2)
			l=mod;
			
			long temp=1;
			
			if(n%mod!=0)
			{
				for(i=1;i<=l;i++)
				{
					//ans=(ans+ (f[n]*((InverseEuler(f[i], mod) * InverseEuler(f[n-i], mod)) % mod)) % mod)%mod;
					temp=((temp*n)*InverseEuler(i,mod))%mod;
					//System.out.println("Ans is:  "+ans+"  Temp is:  "+temp+"  N is:  "+n);
					ans=(ans+temp)%mod;
					n++;
				}
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
				if(x>MOD) x%=MOD;
			}
		
			y = (y*y);
			if(y>MOD) y%=MOD; 
			b /= 2;
		}

		return x;
	}

	public static long InverseEuler(int n, int MOD)
	{
		return pow(n,MOD-2,MOD);
	}
}