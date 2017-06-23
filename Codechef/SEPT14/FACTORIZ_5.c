/*
You are given an integer N, you need to find M positive integers A1, A2, A3, ..., AM, so that A1*A2*A3*...*AM would be equal to N. You should maximize the number M.
Input

The first line of the input contains the integer T, denoting the number of the test cases.

Then T lines follow, each one is describing a single test case and contains a single positive integer N.
Output

For each test case, output the integer M on the first line of the testcases' output. Then, output M lines, where the i-th should contain the number Ai. Ai should be a positive integer, greater than 1.
Scoring

For each individual file, your score will be calculated as the sum of M2 over all the test cases in this file. Your score for the problem is the average of individual testcases' files scores. The number of points you'll get in the ranklist will be equal to YourScore/BestScore, where YourScore is naturally your score and BestScore is the best score, gained so far in this problem.

Please note that the score you get during the competition is the score on the 20% of the test data. The score on the complete test data will be available after the contest.
Constraints
1 ≤ T ≤ 100
1 ≤ N ≤ 101000
Each of 10 official test cases will have T = 100. Inside each test file, the cases will be divided in the following 4 groups:
2 ≤ N ≤ 1018, N is picked randomly and uniformly - 10% of all test data
2 ≤ N ≤ 1018, N is picked not randomly - 15% of all test data
2 ≤ N ≤ 101000, the length of N is chosen randomly. All the digits are generated randomly - 50% of all test data.
2 ≤ N ≤ 101000, all the prime divisors of N don't exceed 1018 - 25% of the test data.
Example

Input:
4
100
111
1000
48598496894

Output:
2
10
10
2
37
3
2
10
100
1
48598496894
Time Limit: 	3 sec
*/

#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#define max 1010


unsigned long long int temp[500]={0};

void primeFactors(unsigned long long int n)
{
	
	int k=0;
	//printf("\n\nReceived no. is: %llu\n",n);
    // Print the number of 2s that divide n

    while (n%2 == 0)
    {
	//printf("\n\nReceived no. is: %d\n",k);
        temp[k]=2;
	k++;
        n = n/2;
    }
 	unsigned long long int i;
    
	// n must be odd at this point.  So we can skip one element (Note i = i +2)
	//printf("\n\nReceived no. is: %llu\n",n);
    for ( i = 3; i <= sqrt(n); i = i+2)
    {
        // While i divides n, print i and divide n
        while (n%i == 0)
        {
            temp[k]=i;
	    k++; 	
            n = n/i;
        }
    }
 
    // This condition is to handle the case whien n is a prime number
    // greater than 2

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
	int len;

	while(t--)
	{
		scanf("%s",s);
		//printf("\nYou have entered: %s\n",s);
		len=strlen(s);	
		int i=0,q=0,r=0,k=0;
		
		if(len>=16 && len<=700)			
		{
			if((s[len-1]-48)%2==1)
			printf("1\n%s\n",s);

			else
			{
				printf("2\n2\n");
				q=s[0]-48;

				if((q)==1)
				r=1;
				
				else
				{
					printf("%d",q/2);
					r=q%2;
				}

				for(i=1;s[i]!='\0';i++)
				{
					q=r*10+(s[i]-48);		
					r=q%2;
					printf("%d",q/2);
				}
				printf("\n");	
			}
		}


		else if(len>=701 )			
		printf("1\n%s\n",s);

		else
		{
			unsigned long long int n=0;			
			for(i=0;s[i]!='\0';i++)
			n=n*10+(s[i]-48);
		//	printf("\n\nYou have entered : %llu\n\n",n);
			primeFactors(n);				
			
		}
	}
 return 0;

}