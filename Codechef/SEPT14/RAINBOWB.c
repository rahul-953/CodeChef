#include<stdio.h>
#include<string.h>
#include<stdlib.h>


int fast_pow(long long base, long long n,long long M)
{
    if(n==0)
       return 1;
    if(n==1)
    return base;
    long long halfn=fast_pow(base,n/2,M);
    if(n%2==0)
        return ( halfn * halfn ) % M;
    else
        return ( ( ( halfn * halfn ) % M ) * base ) % M;
}

int findMMI_fermat(int n,int M)
{
    return fast_pow(n,M-2,M);
}

int main()
{
	int MOD=1000000007;
	int num,i=6;
	
	//printf("\nEnter number:  ");
	scanf("%d",&num);	

	if(num<13)
	printf("0\n");
	
//	else if(num==13 || num==14)
//	printf("1\n");

	
	else
	{
		num=((num-13)/2)+6;
		long long fact[1000001];
		fact[0]=1;
		int i=1;
	    
	    	while(i<=1000001)
	    	{
	        	fact[i]=(fact[i-1]*i)%MOD;
		        i++;
		    }
   
	       // printf("Enter n: ");
	        //scanf(" %d",&n);
	        //p//rintf("Enter r: ");
	        //scanf(" %d",&r);
	
	        long long numerator,denominator,mmi_denominator,ans;
			
	        //I declared these variable as long long so that there is no need to use explicit typecasting
	        numerator=fact[num];
	        denominator=(fact[6]*fact[num-6])%MOD;
	        mmi_denominator=findMMI_fermat(denominator,MOD);
	        ans=(numerator*mmi_denominator)%MOD;
	        printf("%lld\n",ans);
	   
	}		
		

   return 0;

}


