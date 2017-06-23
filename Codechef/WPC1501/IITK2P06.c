/*
    The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.
    For each test case, there will be a single line of input containing two space separated integers e and o. */

#include<stdio.h>
#include<math.h>

int main()
{
	long long int t,e,o,tot;
	scanf("%lld",&t);	
	
	while(t--)
	{
		scanf("%lld %lld",&e,&o);
		
		tot=e+o;
		
		if(tot%5 != 0)
		printf("-1\n");
		
		else
		{
			o=e>(2*tot/5)?e-((2*tot)/5) :((2*tot)/5)-e ;	
			printf("%lld\n",o );
		}			
	}	

return 0;
}