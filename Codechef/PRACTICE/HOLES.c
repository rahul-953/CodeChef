#include<stdio.h>
int main()
{
	int t,i,j,count=0;
	scanf("%d",&t);

	
		char a[t][100];
		for(i=0;i<t ;i++)
		{
			scanf("%s",a[i]);	
			count=0;
			for(j=0;a[i][j]!='\0'&&j<100;j++)
			{
				if(a[i][j]=='A'||a[i][j]=='D'||a[i][j]=='O'||a[i][j]=='P'||a[i][j]=='Q'||a[i][j]=='R')
				count++;
				
				else if(a[i][j]=='B')
				count+=2;
			}

		  printf("%d\n",count);	
	
		}

	return 0;
}