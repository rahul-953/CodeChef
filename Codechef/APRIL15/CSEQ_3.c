#include<stdio.h>

long long int power(long long int a, long long int b, long long int  MOD)
{
		long long int x=1,y=a; 
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
long long int InverseEuler(long long int  n, long long int  MOD)
{
		return power(n,MOD-2,MOD);
}

int main()
{
	long long int t,n,l,r;
	scanf("%lld",&t);
	
		while(t-->0)
		{
			scanf("%lld %lld %lld",&n,&l,&r);
			l=r-l+1;
			
			long long int ans=0;
			long long int mod=1000003;//+3;
			long long int i;
			long long int temp=1;
			long long int fact=1;
			
			for(i=1 ; i<=l && ((temp*n)%mod)!=0 && (i%mod)!=0 && (fact%(mod-2))!=0 && (n%mod)!=0 && (temp%mod)!=0 &&(fact%mod)!=0;i++)
			{
				fact=(InverseEuler(i,mod))%mod;
				temp=((temp*n)*fact)%mod;
				ans=(ans+temp)%mod;
				n++;
			}
			
			printf("%lld\n",ans);
		}
		
		return 0;
}