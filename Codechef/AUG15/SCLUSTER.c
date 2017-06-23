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
		int arr[n][n];
		for(j=0;j<n;j++)
		{
			for(i=0;i<n;i++)
			{
				if(temp<=k)
				{
					arr[i][j] = temp;
					temp++;
				}
				else
				arr[i][j]=0;
			}
		}
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				printf("%d ",arr[i][j]);
			}
			printf("\n");
		}
	}
	
	
return 0;
}