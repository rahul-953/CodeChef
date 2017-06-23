#include<stdio.h>

int main()
{
	int n,m;
	scanf("%d %d",&n,&m);
	int i,a,b,c;
	
	for(i=0;i<m;i++)
	scanf("%d %d %d",&a,&b,&c);
	
	for(i=0;i<n/2;i++)
	printf("%d ",i);
	printf("\b\n");

return 0;
}