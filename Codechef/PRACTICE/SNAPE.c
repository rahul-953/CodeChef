#include<stdio.h>
#include<math.h>

int main()
{
	int t,b,ls;
	scanf("%d",&t);
	
	while(t--)
	{
		scanf("%d %d",&b,&ls);
		printf("%f %f\n",sqrt(ls*ls-b*b),sqrt(ls*ls+b*b));
	}

return 0;
}