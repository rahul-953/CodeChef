#include<stdio.h>
#include<math.h>

int main()
{
	long long int n;
	scanf("%lld",&n);
	int i;
	long long int a[31],sum=0;	
	
	for(i=0;i<=30;i++)
	{
		a[i]=pow(2,i);
		if(a[i]>n)
		break;
	}

	i--;
	sum=a[i];
	int j=i;
	
	for(;j>0;j--)
	{
		//printf("a[j] before is: %lld  \n",a[j]);
		//n=n-sum;
		if((n-a[j])>=0 )
		n-=a[j];
		
		else
		a[j]=-1;
		//printf("a[j] afters is:  %lld  \n",a[j]);
	}
	
	for(j=1;j<=i;j++)
	if(a[j]!=-1)
	printf("%lld ",a[j]);
	//printf("\b\n");
		
return 0;
}