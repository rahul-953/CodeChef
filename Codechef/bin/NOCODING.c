#include<stdio.h>
int main()
{
	int ap,b,c;
	scanf("%d",&ap);
	while(ap--)
	{
		char a[1002];
		scanf("%s",a);
		int sum=1,i=1;
		while(a[i])
		{
			if(a[i]>a[i-1])
			sum=sum+a[i]-a[i-1];
			else if(a[i]<a[i-1])
			sum=sum+(122-a[i-1]+a[i]-97)+1;
			i++;
		}
		sum=sum+i;
		
		c=11*i;
		if(sum<=c)
		printf("YES\n");
		else
		printf("NO\n");
	}
	return 0;
}	