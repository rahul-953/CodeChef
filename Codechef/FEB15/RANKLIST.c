#include<stdio.h>
int main()
{
int t;
scanf("%d",&t);
while(t--)
{	long long int n,s,tot,dif,count=0;
	scanf("%lld %lld",&n,&s);
	tot=n*(n+1)/2;
	if(s>=tot)
		printf("0\n");
	else
	{
		dif=tot-s;
		n--;
		while(dif>0)
		{
			count++;
			dif-=n;
			n--;
		}
		printf("%lld\n",count);
	}
}

return 0;
}