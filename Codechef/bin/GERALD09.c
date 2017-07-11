#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
	srand(time(NULL));
	int t,n,m,k;
	scanf("%d",&t);
	char a[]={'G','C','A','T','\n'};
	char b[]={'T','A','C','G','\n'};
	
	while(t--)
	{
		scanf("%d %d %d",&n,&m,&k);
		int i,j,mod;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				int ran=random();
				if(i%2==0)
				printf("%c",a[ran%4]);
				
				else
				printf("%c",b[ran%4]);
			}
			printf("\n");
		}
	}
	
	
return 0;
}