import java.util.*;

class CSEQ_11
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
			long f[]=new long[l+1];
			//f[1]=1;
			//f[0]=1;
			//for ( i=2; i<=n;i++)
			//f[i]= (f[i-1]*i) % mod;
		
			f[0]=1;
			if(l>mod)
				l=mod;
			for(i=1;i<=l;i++)
			{
				//ans=(ans+ (f[n]*((InverseEuler(f[i], mod) * InverseEuler(f[n-i], mod)) % mod)) % mod)%mod;
				f[i]=((f[i-1]*n)*InverseEuler(i,mod))%mod;
				//System.out.println("Ans is:  "+ans+"  Temp is:  "+temp+"  N is:  "+n);
				ans=(ans+f[i])%mod;
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