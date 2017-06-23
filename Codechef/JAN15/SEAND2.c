#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int compare(const void *,const void * );

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
	
		qsort(a, strlen(a), 1, compare);
		
		//int i;
		for(i=strlen(a)-1;i>=0;i--)			
		printf("%c",a[i]);
		printf("\n");
	}
	
return 0;
}

int compare(const void *a, const void *b)
{
    return *(const char *)a - *(const char *)b;
}


