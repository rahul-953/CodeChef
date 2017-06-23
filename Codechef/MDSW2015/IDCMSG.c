#include<stdio.h>
int main()
{
	int t;
	scanf("%d",&t);
	char a[10005];
	
	while(t--)
	{
		int k;
		scanf("%d",&k);
		scanf("%s",a);	
		int i;
		
		for(i=0;i<strlen(a);i++)
		{
			if( (a[i]+k)>122 )
			printf("%c",(96+(a[i]-(122-k ) ) ));
			
			else
			printf("%c",(a[i]+k));
		}
		printf("\n");
	}
	
return 0;
}