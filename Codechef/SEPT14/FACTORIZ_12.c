#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#define max 1010

unsigned long long int temp[500]={0};

void primeFactors(unsigned long long int n)
{
	int k=0;
	while (n%2 == 0)
	{
		temp[k]=2;
		k++;
		n = n/2;
	}

	unsigned long long int i;
	for ( i = 3; i <= sqrt(n); i = i+2)
	{
		while (n%i == 0)
		{
			temp[k]=i;
			k++;
			n = n/i;
		}
	}
	
	if (n > 2)
	{	
		temp[k]=n;
		k++;
	}	
		
	printf("%d\n",k);
	for(i=0;i<k;i++)	
	printf("%llu\n",temp[i]);
}

int main()
{
	int t;
	scanf("%d",&t);
	char s[max];
	int len,co=0,k=0,c2=0,c5=0;
	while(t--)
	{
		scanf("%s",s);
		len=strlen(s);
		int i=0,q=0,r=0,k=0,j=0;
		co=0;k=0;c2=0;
		if(len>=17 && ( (s[len-1]-48)%2==0 || s[len-1]-48%5==0) )	
		{
			co=c5=0;
			for(j=0;s[j]!='\0'&&(s[len-1]-48)%2==0;)
			{
				k=0;
	//			printf("\n\nhell\n\n");
				q=s[0]-48;
				r=q;
				if(q>1)
				{
					r=q%2;
					q=q/2;
					s[k]=q+48;
					k++;
				}
	
				for(i=1;s[i]!='\0';i++)
				{
					q=r*10+(s[i]-48);
					r=q%2;
					q=q/2;
					s[k]=q+48;
					k++;
		
				}
						
				s[k]='\0';
				co++;
	//			printf("%s\n",s);
				len=strlen(s);
			}
	
		
		
			
			for(j=0;s[j]!='\0'&&(s[len-1]-48)%5==0;)
			{
				k=0;
	//			printf("\n\nhell\n\n");
				q=s[0]-48;
				r=q;
				if(q>4)
				{
					r=q%5;
					q=q/5;
					s[k]=q+48;
					k++;
				}
	
				for(i=1;s[i]!='\0';i++)
				{
					q=r*10+(s[i]-48);
					r=q%5;
					q=q/5;
					s[k]=q+48;
					k++;
		
				}
						
				s[k]='\0';
				c5++;
	//			printf("%s\n",s);
				len=strlen(s);
			}
	
			


			if(strcmp(s,"1")==0)
			{
					
				printf("%d\n",co+c5);
				for(i=1;i<=co;i++)	
				printf("2\n");
				//printf("%s\n",s);
			
				for(i=1;i<=c5;i++)
				printf("5\n");
				//printf("%s\n",s);

			}

			
			else{
				printf("%d\n",co+1+c5);
				for(i=1;i<=co;i++)	
				printf("2\n");
				//printf("%s\n",s);
			
				for(i=1;i<=c5;i++)
				printf("5\n");
				printf("%s\n",s);
			}

			
		}

		else if(len>=17 )	
		printf("1\n%s\n",s);
		else
		{
			unsigned long long int n=0;
			for(i=0;s[i]!='\0';i++)
			n=n*10+(s[i]-48);
			primeFactors(n);
		}
	}
	return 0;
} 