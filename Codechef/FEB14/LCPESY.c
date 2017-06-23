#include<stdio.h>

int main()
{
	char a[10010],b[10010];
	int a1[125]={0},b1[125]={0};
	int t,cnt=0,la,i;
	scanf("%d",&t);
	
	while(t--)
	{
		
		cnt=0;
	
		for(i=0;i<125;i++)		
		a1[i]=b1[i]=0;
		
		scanf("%s",a);
		scanf("%s",b);


		for(i=0;a[i]!='\0';i++)
		a1[ a[i]%125 ] +=1;
			
		for(i=0;b[i]!='\0';i++)
		b1[ b[i]%125 ] +=1;

		
		

		for(i=0;i<125;i++)
		{	
			if( a1[i]>0 && b1[i] > 0 )
			{
			    la = (a1[i]<b1[i]) ? a1[i]:b1[i] ;	
			    cnt+=la; 	
			}
		}

		printf("%d\n",cnt);	
	}

	return 0 ;
}