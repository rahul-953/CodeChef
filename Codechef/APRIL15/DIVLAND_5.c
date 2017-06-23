#include<stdio.h>
#include<stdlib.h>

void sort(int**,int);
void heapify(int**,int);
void maxheap(int**,int ,int);
void swap(int**,int ,int);

void sort(int **deg,int N)
{       
	heapify(deg,N); 
	N--;        
	int i;
        for (i = N; i > 0; i--)
        {
            swap(deg,0, i);
            N = N-1;
            maxheap(deg, 0,N);
        }
}   
void heapify(int **deg,int N)
{
        N--;// = deg.length-1;
        int i;
        for (i = N/2; i >= 0; i--)
        maxheap(deg, i,N);        
}

void maxheap(int **deg, int i,int N)
{ 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;

        if (left <= N && deg[left][0] > deg[i][0])
        max = left;

        if (right <= N && deg[right][0] > deg[max][0])        
        max = right;

        if (max != i)
        {
            swap(deg, i, max);
            maxheap(deg, max,N);
        }
}  
void swap(int **deg, int i, int j)
{
        int tmp = deg[i][0];
        deg[i][0] = deg[j][0];
        deg[j][0] = tmp; 		
        tmp = deg[i][1];
        deg[i][1] = deg[j][1];
        deg[j][1] = tmp; 		
}    


int main()
{
	int n,m,i,a,b,c;
	scanf("%d %d",&n,&m);
	//int deg[n][2];
	int **deg = (int **)malloc(n * sizeof(int *));
    	for (i=0; i<n; i++)
        deg[i] = (int *)malloc(2 * sizeof(int));
 
	for(i=0;i<n;i++)
	deg[i][1]=i;
		
	for(i=0;i<m;i++)
	{
		scanf("%d %d %d",&a,&b,&c);
		deg[a][0]+=c;
		deg[b][0]+=c;
	}
		
	sort(deg,n);
	
	for(i=0;i<n/2;i++)
	printf("%d ",deg[i][1]);
	printf("\n");
	
return 0;
}