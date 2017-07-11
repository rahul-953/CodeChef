#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	
	while(t--)
	{
		int n,k,temp,i,j;
		scanf("%d %d",&n,&k);	
		
		for(i=0;i<n;i++)
		for(j=0;j<n;j++)
		scanf("%d",&temp);
		
		for(i=0;i<k;i++)
		scanf("%d",&temp);
		
		temp =1 ;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(temp<=k){
				printf("%d ",temp);
				temp++;}
				else
				printf("0 ");
			}
			printf("\n");
		}
	}
	
	
return 0;
}