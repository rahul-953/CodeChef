#include<stdio.h>

int cmpfunc (const void * a, const void * b)
{
   return ( *(int*)a - *(int*)b );
}

int main()
{
	int n,m;
	scanf("%d %d",&n,&m);
	int i,a[n],b,c,temp1,temp2;
	
	for(i=0;i<m;i++)
	{
		scanf("%d %d %d",&temp1,&temp2,&c);
		a[temp1]++;
		a[temp2]++;
	}
	
	qsort(a, n, sizeof(int), cmpfunc);
	
	for(i=0;i<n;i+=2)
	printf("%d ",i);
	printf("\b\n");

return 0;
}