#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n,i,key=0,count=0;	
	scanf("%d",&n);
	
	int *a;
	a=(int*)malloc(sizeof(int)*n);

	for(i=0;i<n;i++)			
	{
		scanf("%d",&a[i]);
		
		if(a[i]!=0)
		key++;
		
		else if(a[i]==0)
		{
			if(key>count)
			count=key;

			key = 0;
		}
	}
	if(key<count)
	printf("%d\n",count);

	else
	printf("%d\n",key);
  return 0;
}
