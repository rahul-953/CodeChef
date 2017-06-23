#include <stdio.h>
#include <math.h>
#include <limits.h>
#include<stdlib.h> 

int minVal(int x, int y) { return (x > y)? x: y; }
 

int getMid(int s, int e) {  return s + (e -s)/2;  }

int RMQUtil(int *st, int ss, int se, int qs, int qe, int index)
{
    if (qs <= ss && qe >= se)
        return st[index];
 

    if (se < qs || ss > qe){
	//printf("CHICK\n");
        return INT_MIN;}
    int mid = getMid(ss, se);
    return minVal(RMQUtil(st, ss, mid, qs, qe, 2*index+1),  RMQUtil(st, mid+1, se, qs, qe, 2*index+2));
}
 
int RMQ(int *st, int n, int qs, int qe)
{

    if (qs < 0 || qe > n-1 || qs > qe)
    {
        //printf("Invalid Input");
        return -1;
    }
 
    return RMQUtil(st, 0, n-1, qs, qe, 0);
}
 
int constructSTUtil(int arr[], int ss, int se, int *st, int si)
{
    if (ss == se)
    {
        st[si] = arr[ss];
        return arr[ss];
    }
 
    int mid = getMid(ss, se);
    st[si] =  minVal(constructSTUtil(arr, ss, mid, st, si*2+1), constructSTUtil(arr, mid+1, se, st, si*2+2));
    return st[si];
}
 
int *constructST(int arr[], int n)
{
    int x = (int)(ceil(log2(n))); //Height of segment tree
    int max_size = 2*(int)pow(2, x) - 1; //Maximum size of segment tree
    int *st =(int *)malloc(max_size*sizeof(int));
 
    constructSTUtil(arr, 0, n-1, st, 0);
 
    return st;
}

int main()
{
	//The first line contains a single integer N, denoting the number of elements in the array.
	//The second line contains N space-separated integers, denoting A0, A1, ..., AN-1.
	//The third line contains three space-separated integers M, x1 and y1.

	int N;
	scanf("%d",&N);	
	int i,m,x1,y1;
	int arr[N];// = {1, 3, 2, 7, 9, 11};
	for(i=0;i<N;i++)
	scanf("%d",&arr[i]);

	int n = sizeof(arr)/sizeof(arr[0]);
 	//printf("Calling constructst\n");
	int *st = constructST(arr, n);
 	//printf("Returning constructst\n");
	 scanf("%d %d %d",&m,&x1,&y1);

	long long int ans=0;

	for(i=0;i<m;i++)
	{
		if(x1<y1)
		ans+=RMQ(st, n, x1, y1);
		else
		ans+=RMQ(st, n, y1, x1);
		//printf("Ans for =%lld\n",ans);
		x1 = (x1 + 7) % (N - 1);
		y1 = (y1 + 11) %N;
	}
	printf("%lld\n",ans);
 	//int qs = 2;  // Starting index of query range
	//int qe = 2;  // Ending index of query range
 
    // Print minimum value in arr[qs..qe]
    //printf("Minimum of values in range [%d, %d] is = %d\n", qs, qe, RMQ(st, n, qs, qe));
 
    return 0;
}