#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
	int t;
	scanf("%d",&t);
	char *d;
	long long count=0;

	while(t--)
	{
		count=0;
		int n,i;
		scanf("%d",&n);	
		n++;
		d=(char*)malloc(n*(sizeof(char)));

		scanf("%s",d);

		for(i=0;d[i]!='\0';i++)
		{
		    if(d[i]=='1')
		    {
			count++;	
                    }
		}
		
		if(count!=0)	
		printf("%llu\n",count+(count*(count-1))/2);

		else
		printf("%d\n",0);
		free(d);
	}
  return 0;
}