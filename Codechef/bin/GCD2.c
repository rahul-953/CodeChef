#include<stdio.h>
int GCD(int a,int b)
{
	if(b==0)
	return a;
	return GCD(b,a%b);
}
int main()
{
	int t;
	scanf("%d",&t);
	while(t--)
	{
		int a,rem=0,i,num;
		char arr[250];
		scanf("%d%s",&a,arr);
		if(a==0)
		printf("%s\n",arr);
		else
		{
			for(i=0;arr[i];i++)
		{
			num=rem*10+(arr[i]-'0');
			rem=num%a;
		}
		printf("%d\n",GCD(a,rem));
		}
	}
	return 0;
}