/*
The first line of the input contains a single integer T denoting the number of test cases. 
This will be followed by T test cases. 
The first line of each test case contains a single integer N denoting the number of apple trees in Chef's garden. 
The neat line of each test case contains N space separated integers denoting the number of apples on each tree.
*/
#include<stdio.h>
#include<stdlib.h>

void quicksort(int *,int ,int );

int main()
{
	int t,n,i;
	scanf("%d",&t);
	
	while(t--)		
	{
		scanf("%d",&n);	
		int *x;
		x=(int *)malloc(sizeof(int)*n);
		
		for(i=0;i<n;i++)	
		scanf("%d",&x[i]);
		
		quicksort(x,0,n-1);	
		
		int count=0,index=n-1;
		
		for(i=n-1;i>0;i--)
		{
			if(x[i]==x[i-1])
			continue;
			
			else
			{	
				x[i]=x[i-1];
				count++;
			}	
		}
		count++;
		
		printf("%d\n",count);
		
	}
	
	return 0;
}

void quicksort(int *x,int first,int last)
{
    int pivot,j,temp,i;

     if(first<last)
     {
         pivot=first;
         i=first;
         j=last;

         while(i<j)
         {
             while(x[i]<=x[pivot]&&i<last)
                 i++;
             while(x[j]>x[pivot])
                 j--;
             
             if(i<j)
             {
                 temp=x[i];
                  x[i]=x[j];
                  x[j]=temp;
             }
         }

         temp=x[pivot];
         x[pivot]=x[j];
         x[j]=temp;
         quicksort(x,first,j-1);
         quicksort(x,j+1,last);

    }
}