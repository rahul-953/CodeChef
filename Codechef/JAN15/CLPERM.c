/*

    First Line of input contains a single integer T denoting the number of test cases.
    First line of each test case contains two space separated integers N and K denoting the size of
    permutation and number of numbers fall down from the table.
    Next line of each test case contains K space separated integers denoting the values of missing numbers.
*/
#include<stdio.h>
#include<stdlib.h>

int main()
{
	long long int t,n,k;
	scanf("%lld",&t);
	while(t--)
	{
		scanf("%lld %lld",&n,&k);	
		if(((n*(n+1))/2)%2==0)
		printf("Chef\n");
		else
		printf("Mom\n");
	}
	
return 0;
}