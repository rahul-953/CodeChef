#include<stdio.h>
int main()
{
	int t;
	scanf("%d ",&t);
	int n,a;
	while(t--)
	{
		int count=0;
		scanf("%d",&n);
		int temp[100000]={0};
		while(n--)
		{
			scanf("%d",&a);
			if(temp[a-1]==0)	
			count++;
			temp[a-1]++;
		}
		printf("%d\n",count);
	}

return 0;
}