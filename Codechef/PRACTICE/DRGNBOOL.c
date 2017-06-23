#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	int n,m;
	
	while(t--)	
	{
		scanf("%d%d",&n,&m);
		int l[100],f[100];
		int i,c,lev,count=0;
		
		for(i=0;i<100;i++)
		{
			l[i]=0;
			f[i]=0;
		}
		
		for(i=0;i<n;i++)
		{
			scanf("%d%d",&c,&lev);
			l[lev-1]+=c;
		}
		
		for(i=0;i<m;i++)
		{
			scanf("%d%d",&c,&lev);
			f[lev-1]+=c;
		}
			
		for(i=0;i<100;i++)
		{
			if(l[i]<f[i])
			count+=f[i]-l[i];
		}
		
		printf("%d\n",count);
	}
	
return 0;
}