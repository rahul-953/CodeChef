#include<stdio.h>
int main()
{
	int t,n;
	scanf("%d",&t);
	
	while(t--)
	{
		scanf("%d",&n);
		int a[n],j;
		int i=0,countinv=0,countloc=0;
		
		for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				countinv++;
			}
			
			if(a[i]>a[i+1])
			countloc++;
		}
		
		if(countloc==countinv)
		printf("YES\n");
		else
		printf("NO\n");
	}
	
return 0;
}