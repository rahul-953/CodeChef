#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	
	while(t--)
	{
		printf("\n");
		int n,m,s,e,b;
		scanf("%d %d",&n,&m);
		
		int i,st=0,et=0;
		long long int btot=0;
		
		for(i=0;i<m;i++)
		{
			scanf("%d %d %d ",&s,&e,&b);
			st+=s;
			btot+=b;
			et+=e;	
		}
		
		for(i=0;i<n-1;i++)
		printf("%d ",btot/m);
		printf("\n");
		
	}
	
return 0;
}