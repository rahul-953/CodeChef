#include <stdio.h>
#include <math.h>
#include <string.h>

int main()
{
	long int t;
	scanf("%ld",&t);
	while (t--) 
	{
		long int a,b,c;
		scanf("%ld%ld%ld",&a,&b,&c);
		if((a+b+c)==180 && a>0 && b>0 && c>0 && a<180 && b<180 && c<180)
		{
			printf("YES\n");
		}
		else
		{
			printf("NO\n");
		}
	}
	return 0;
}