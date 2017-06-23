#include<stdlib.h>
#include<stdio.h>
int comp(const void *a ,const void *b)
{
	return ( *(int*)a-*(int*)b );
}
int main()
{
	int t;
	scanf("%d",&t);
	
	while(t--)
	{
		int n ;
		scanf("%d",&n);
		int a[n];
		int i;
		
		for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		
		int count=0;
		qsort(a,n,sizeof(int),comp);
		
		for(i=n-1;i>=0;)
		{
			count+=a[i];
			i--;
			if(i>=0)
			count+=a[i];
			i-=3;
		}
		printf("%d\n",count);
	}
	
return 0;
}