#include<stdio.h>
int main()
{
	int t,n,c,temp;
	scanf("%d",&t);
	
	while(t--)
	{
		int v=0;
		scanf("%d %d",&n,&c);
		while(n--)
		{
			scanf("%d",&temp);
			v+=temp;
		}
		if(c>=v)
		printf("Yes\n");
		else
		printf("No\n");
		
			
	}

return 0;
}