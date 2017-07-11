#include<stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	int max=0,diff;
	int p1,p2,p1tot=0,p2tot=0,key;
	
	while(n--)
	{
		scanf("%d %d",&p1,&p2);
		p1tot+=p1;
		p2tot+=p2;
		
		diff=p1tot-p2tot;
		
		if(diff>max)		
		{
			max=diff;
			key=1;
		}
		
		else if((diff=p2tot-p1tot)>max)
		{
			max=diff;
			key=2;
		}		
	}	
	printf("%d %d\n",key,max);

return 0;
}