#include<stdio.h>
#include<math.h>
#include<stdlib.h>
 
int main()
{
	int n,x,type;
	scanf("%d",&n);
	long long int *a,*sum;
	long long int y;
	int i,j;
 
	a=(long long int*)malloc(sizeof(long long int)*n) ;
	sum=(long long int*)malloc(sizeof(long long int)*(n+1)) ;
 
	for(i=0;i<n;i++)	
	scanf("%lld",&a[i]);

	int lr[n][2];
	
	for(i=0;i<n;i++)
	scanf("%d %d",&lr[i][0],&lr[i][1]);
 
	sum[n]=0;
	
	for(i=0;i<n;i++)	
	{
		sum[i]=0;
		
		for(j=lr[i][0]-1;j<=lr[i][1]-1;j++)
		sum[i]+=a[j];
	}
	
	int q;
	long long int temp;
	scanf("%d",&q);
 
	for(i=0;i<q;i++)
	{
		scanf("%d %d %lld",&type,&x,&y);
		/* Next Q line follows , each line containing a query of Type 1 or Type 2.
			1 x y : denotes a type 1 query,where x and y are integers
			2 m n : denotes a type 2 query where m and n are integers
	
			Type 1: Change the xth element of the array to y.
			Type 2: Return the sum of all functions from m to n.
		*/	
		
		switch(type)
		{	
			case 1 :
			temp=a[x-1];
			a[x-1]=y;
		
			for(j=0;j<n;j++)
			if( (lr[j][1]>=(x)) && (lr[j][0]<=(x)) )
			sum[j]=sum[j]-temp+y;
				
		
			break;

			case 2 :
				sum[n]=0;
				for(j=x-1;j<=y-1;j++)
				sum[n]+=sum[j];

				printf("%lld\n",sum[n]);
			break;
			default :
			break;
		}
	}	
return 0;
} 