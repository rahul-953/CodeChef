//TO FIND THE LENGTH OF SHORTEST PATH OF 2 GIVEN NODES IN A COMPLETE BST OF THE FORM 2N AND 2N+1....i.e. IN THEIR PARENT-CHILD NOTATION.


#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	int n,i,j,ci=0,li,lj;
	scanf("%d",&n);

	while(n--)	
	{
		ci=0;
		scanf("%d %d",&i,&j);
	
		if(i<j)
		i = (i+j)-(j=i);	//=> Now "I" has the largest no. and "J" has smallest no.
	
		
		while( (i/2) >= j )
		{
			i=i/2;
			ci++;
		}
	
		if(i==j)
		printf("%d\n",ci);
	
		else 
		{
			li=floor(log2(i));		
			lj=floor(log2(j));		
	
			if(li==lj)
			{
				do
				{
					i/=2;
					j/=2;
					ci+=2;
				} while( (i) != (j) );

				//if(i/2==j/2)
				//ci+=2;
			}
	
			else
			{
				i/=2;
				ci++;
		
				do
				{
					i/=2;
					j/=2;
					ci+=2;
				} while( (i) != (j) );
			}
		  printf("%d\n",ci);		
		}
	}

  return 0;
}


