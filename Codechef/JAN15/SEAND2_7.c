#include<stdio.h>
#include<stdlib.h>

int main()
{
	int t,n,b;
	scanf("%d",&t);	
	char a[1005];
	while(t--)
	{
		scanf("%s",a);
		scanf("%d",&n);
		int i;
		for(i=0;i<n;i++)
		scanf("%d",&b);
		
		printf("%s\n",a);
	}
	
return 0;
}