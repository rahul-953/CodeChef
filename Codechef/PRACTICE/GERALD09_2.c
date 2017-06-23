#include<stdio.h>
int main()
{
	int t,n,m,k;
	scanf("%d",&t);
	char a[]={'G','C','A','T','\n'};
	char b[]={'T','A','C','G','\n'};
	
	while(t--)
	{
		scanf("%d %d %d",&n,&m,&k);
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(i%2==0)
				printf("%c",a[j%4]);
				
				else
				printf("%c",b[j%4]);
			}
			printf("\n");
		}
	}
	
	
return 0;
}