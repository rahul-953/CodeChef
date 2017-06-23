#include<stdio.h>
#include<stdlib.h>

int cmpfunc (const void * a, const void * b)
{
   return ( *(int*)a - *(int*)b );
}

int main()
{
	int t,n,key,k;
	scanf("%d",&t);
	
	while(t--)
	{
		scanf("%d",&n);
		int a[n],i;
		
		for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		
		scanf("%d",&k);
		key=a[k-1];
		
		qsort(a,n,sizeof(int),cmpfunc);
		for(i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				printf("%d\n",i+1);
				break;
			}
		}
	}
	
return 0;
}
