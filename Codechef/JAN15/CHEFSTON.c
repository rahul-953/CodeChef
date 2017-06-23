/*
Chef is playing a game. Currently in the game, he is at a field full of stones. There are total N kinds of
stones. There is unlimited supply of each kind of stone.

Chef knows that one stone of kind i needs Ai minutes to pick it from the ground and it will give Chef a profit of
Bi Rs.

Chef has K minutes of free time. During this free time, Chef want to pick stones so as to maximize his profit.
But he can not pick stones of different kinds, he has to pick stones of a single kind.

Please help Chef to find the maximal possible profit.
Input

    First line contains single integer T denoting the number of test cases.
    First line of each test case contains two integers N and K.
    Next line contains N integers Ai denoting the time needed to pick one stone of kind i.
    Next line contains N integers Bi denoting the profit due to picking ithth stone.

Output

    For each test case, print a single line containing maximal possible profit.

Constraints

    1 ≤ T ≤ 5
    1 ≤ N ≤ 105
    1 ≤ K ≤ 109
    1 ≤ Ai, Bi ≤ 109

Subtasks

    Subtask N ≤ 5, T ≤ 2 Points: 30
    Subtask N ≤ 105, T ≤ 5 Points: 70

Example

Input:
1
3 10
3 4 5
4 4 5

Output:
12

Explanation

If Chef picks stones of first kind he can pick 3 stones, he will get a profit of 3*4 = 12 Rs.
If Chef picks stones of second kind he can pick 2 stones, he will get a profit of 2*4 = 8 Rs.
If Chef picks stones of third kind he can pick 2 stones, he will get a profit of 2*5 = 10 Rs.

So the maximum possible profit is 12

*/


#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
	int t;
	long long int n,k;
	scanf("%d ",&t);	

	while(t--)
	{
		scanf("%lld %lld ",&n,&k);
		long long int *a,*b;
		a=(long long int *)malloc(sizeof(long long int)*n);
		b=(long long int *)malloc(sizeof(long long int)*n);

		int i;
	
		for(i=0;i<n;i++)
		scanf("%lld",&a[i]);


		for(i=0;i<n;i++)
		scanf("%lld",&b[i]);

		long long int max=0,temp=0;

		for(i=0;i<n;i++)	
		{
			temp=(k/a[i])*b[i];

			if(temp>max)
			max=temp;
		}

		printf("%lld\n",max);

		free(a);
		free(b);
	}

 return 0;

}
