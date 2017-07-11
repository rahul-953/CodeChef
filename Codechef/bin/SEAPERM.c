/*
First line of input contain integer T - number of testcases. Next lines contain T testcases. First line of each testcase contain three integers N, k, S. Next line contain N integers - array A'.
*/

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int t,n,k,s,i,j;
	scanf("%d",&t);

	while(t--)	
	{
		//printf("Test case No.: %d\n",t+1);
		scanf("%d %d %d",&n,&k,&s);
		//printf("N is :%d  k is: %d  S is: %d\n",n,k,s);

		//int **a = (int **)malloc(2 * sizeof(int *));

		//for (i=0; i<2; i++)
 	        //a[i] = (int *)malloc(n * sizeof(int));
		//printf("Array declared\n");
		
		int a[2][n];
		
		for(i=0;i<n;i++)
		{
			scanf("%d",&a[0][i]);
			a[1][i]=i+1;
		}

		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[0][i]>a[0][j])	
				{
					int temp=a[0][i];
					a[0][i]=a[0][j];
					a[0][j]=temp;
				}
			}
		}
		
		for(i=0;i<n;i++)
		printf("%d ",a[1][i]);
		printf("\n");
		
		//free(a);
	}
	return 0;
}