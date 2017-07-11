#include<stdio.h>
#include<math.h>

int main()
{
	int t;
	scanf("%d",&t);
	double p,s,ans,b;
	
	while(t--)
	{
		ans=0;
		scanf("%lf %lf",&p,&s);
		
		b=(p-(sqrt(p*p-24*s)))/12;
		
		ans=b*(s/2- b*(p/4-b ) );	
		printf("%lf\n",ans);
	}
	
return 0;
}