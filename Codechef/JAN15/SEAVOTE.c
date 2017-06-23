#include<stdio.h>
#include<stdlib.h>

int main()
{
	int t,n;
	long long int total=0;
	
	scanf("%d",&t);	
	
	while(t--)
	{
		total=0;
		scanf("%d",&n);
		int *a=(int *)malloc(sizeof(int)*n);		
		int i,count=0,key=0;
		
		for(i=0;i<n;i++)		
		{
			scanf("%d",&a[i]);
			total+=a[i];

			if(a[i]>100)
			count=1;
			
			if(a[i]==0)
			key++;
		}	

		long long int sum;
		
		sum=100+(n-key-1);
		
		if(total>=100 && total<=sum && count==0)
		printf("YES\n");
		
		else
				printf("NO\n");
	}
}	