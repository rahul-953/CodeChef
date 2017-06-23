#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	
	int t,i=0;
	char *s;
	unsigned long long int div=1000000007,c=1,level=1,ll;	
	//printf("%d",sizeof( unsigned long long int));
	scanf("%d",&t);

	while(t--)		
	{
		s=(char*)malloc(sizeof(char)*100001);
		scanf("%s",s);
		i=0;
		c=1;
		level=1;

		for(i=0;s[i]!='\0';i++)
		{
			if(s[i]=='l'|| s[i]=='L')	
			{	
				if(level%2==0)
				c=2*c-1;

				else
				c=2*c;
			}

			else if(s[i]=='r' || s[i]=='R')	
			{
				if(level %2 ==0)
				c=2*c+1;
			
				else
				c=2*c+2;
			}

		    level++;			
		    c=c%div;	
		}		

	   printf("%llu \n",(c%div));	
	   free(s);
	}	

  return 0;
}