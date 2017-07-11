#include <stdio.h>

int main()
{
	int t,g,i,n,q;
	scanf("%d",&t);//t=fastread();
	
	while(t--)
	{
		scanf("%d",&g);	//);g=fastread();
		while(g--)
		{
			scanf("%d %d %d ",&i,&n,&q);
			//n=fastread();
			//q=fastread();
			if(n%2==0)
			printf("%d\n",n/2);
			else
			{
				if(i==q)
				printf("%d\n",n/2);
				else
				printf("%d\n",((n/2)+1) );
			}
		}
	}
	return 0;
}  