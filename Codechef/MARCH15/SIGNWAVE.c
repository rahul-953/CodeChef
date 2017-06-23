#include<stdio.h>
#include<math.h>

int main()
{
	int t,s,c,k;
	scanf("%d ",&t);
	
	while(t--)
	{
		scanf("%d %d %d",&s,&c,&k);
		
		
		if(k==1)
		{
			if(c==0)
			{
				if(s==0 || k>s)
				printf("0\n");
				
				else	
				printf("%lld\n",(long long int)( (pow(2,s-k+1)) +1) );			
			}
		
			else if(s!=0)	
			{
				if(s>c)
				printf("%lld\n",(long long int) ( (pow(2,s) )+1) );
				
				else if(s==c)
				printf("%lld\n",(long long int) ( ((pow(2,s) )+1) + (pow(2,c) ) )  );
				
				else
				{
				  long long int sum=(long long int)( pow(2,s)*(pow(2,c-s+1)-1) ) ;	
				  printf("%lld\n",(long long int) ( sum+ ((pow(2,s) )+1) ) );	
				}
			}
			
			else
			printf("%lld\n",(long long int) ( (pow(2,c+1) )-2 )  );
		}
		
		
		else if(c==0)
		{
			if(s==0 || k>s)
			printf("0\n");
			
			else	
			printf("%lld\n",(long long int)( (pow(2,s-k+1)) +1) );			
		}
		
		else
		{
			if(k<=s)
			{
				if(s>=c)
				{
					int i=s-k+1;
					long long int abc;
					
					if(c>=i)
					{
					  abc=(long long )(pow(2,i));
					  printf("%lld\n",(long long int)( ((pow(2,s-k+1)) +1) + abc )  );			
					}
					
					else
				 	printf("%lld\n",(long long int)( ((pow(2,s-k+1)) +1)  )  );			
				}
				
				else
				printf("%lld\n",(long long int)( ((pow(2,s-k+1)) +1)+ pow(2,s-k+1)  )  );			
				
			}
			
			else
			printf("0\n");
		}
	}
	
return 0;	
}