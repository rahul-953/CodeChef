/*Today Chef wants to clean his garden. Chef has N columns of ground. Each column has it's height . Chef can choose any column and increase its height by 1 using 1 cube of ground.

Chef wants to spend exactly M cubes. Can he make this in such way that the heights of all columns will become equal?
Input

    First line of input contains an integer T denoting number of test cases.
    Then for each test case, The first line contains two integers N and M.
    The second line contains N space-separated integers A1, A2, ..., AN denoting the initial heights of the columns".

Output

    If Chef can spend all cubes and make the columns equal print Yes else print No.

Constraints

    1 ≤ T ≤ 10^2
    1 ≤ N ≤ 10^2
    1 ≤ Ai ≤ 10^2
    0 ≤ M ≤ 10^4

Example

Input:
3
5 7
3 3 4 2 1
5 6
3 3 4 2 1
5 8
3 3 4 2 1

Output:
Yes
No
No

Explanation

In the first case we can put cubes on columns in such count: 1, 1, 0, 2, 3. The sum equals M.

In the second case we can't make the columns equal as we will receive something like 44443.

In the third case we can make all columns equal but we will still have one cube extra, By using that cube, our heights of columns will become 44445. 

*/


#include<stdio.h>

int main()
{
	int n,m,i,t,count=0;
	scanf("%d",&t);

	while(t--)
	{
		scanf("%d %d",&n,&m);
		int a[n],max;
		count=0;

		for(i=0;i<n;i++)
		scanf("%d",&a[i]);

		max=a[0];

		for(i=1;i<n;i++)	
		if(a[i]>max)
		max=a[i];

		for(i=0;i<n;i++)
		count=count+(max-a[i]);
		
		if(count==m)
		printf("Yes\n");

		else if( (m-count)%n==0)
		printf("Yes\n");

		else
		printf("No\n");
		
	}

 return 0;
}