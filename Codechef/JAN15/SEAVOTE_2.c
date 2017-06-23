#include<stdio.h>
#include<stdlib.h>

int main()
{
	int t,n;
	int total=0;
	
	scanf("%d",&t);	
	
	while(t--)
	{
		total=0;
		scanf("%d",&n);
		int a;
		int i,count=0;
		
		for(i=0;i<n;i++)		
		{
			scanf("%d",&a);
			total+=a;

			if(a>100)
			count+=1;
		}	

		int sum;
		
		sum = 100+(n-1);
		
		if(n<=100)
		{
			if(100%n==0)
			{
				sum=(((100/n)+1)*(n-1))+(100/n);
				
				if(total>=100 && total<=sum && count==0)
				printf("YES\n");
				
				else 
				printf("NO\n");
			}
			
			else
			{
				sum=100+(n-1);	
							
				if(total>=100 && total<=sum && count==0)
				printf("YES\n");
				
				else 
				printf("NO\n");
			}
		}
		
		else if(total>=100 && total<=sum && count==0) 
		printf("YES\n");
		
		else 
	 	printf("NO\n");
	}
}	