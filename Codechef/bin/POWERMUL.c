#include<stdio.h>
#include<math.h>

int main()
{
	int t;
	long long int n,m,q;
	scanf("%d",&t);
	
	while(t--)
	{
		scanf("%lld %lld %lld",&n,&m,&q);
		long long int r,i,j;
		//scanf("%lld",&r);
		
		for(i=0;i<q;i++)
		{
			scanf("%lld",&r);
			long long int ans=0,fr=1,fn=1,fnr=1;
		
			for(j=1;j<=n;j++)
			{
				fn=fn*(long long int)(pow(j,j));
				if(j<=r)
				fr=fn;
				if(j<=(n-r))
				fnr=fn;
			}
		  ans=fn/(fr*fnr);
		  printf("%lld\n",ans%m );
		}
	}	
 
return 0;
}