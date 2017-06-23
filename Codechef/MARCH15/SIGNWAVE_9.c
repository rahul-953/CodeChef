#include<stdio.h>
#include<math.h>

int main()
{
	int t,s,c,k;
	scanf("%d ",&t);
	
	while(t--)
	{
		scanf("%d %d %d",&s,&c,&k);
		c=0;
		
		if(s==0 || k>s)
		printf("0\n");
		
		else
		{
			printf("%lld\n",(long long int)( (pow(2,s-k+1)) +1) );			
		}
	}
	
return 0;	
}