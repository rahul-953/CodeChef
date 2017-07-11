#include<stdio.h>
#include<stdlib.h>

int gcd(int,int);

int n;
int *a;


int main()
{
	int t,q,l,r;
	scanf("%d",&t);	

	while(t--)
	{
		scanf("%d %d",&n,&q);
				
		a = (int *)malloc(n * sizeof(int ));
		int *gc,*gcrev;	        
	        
	        gc = (int *)malloc(n * sizeof(int ));
	        gcrev = (int *)malloc(n * sizeof(int ));
	        
	        
		int i;
		
		for(i=0;i<n;i++)
		scanf("%d",&a[i]);
		
		gc[0]=a[0];
		gcrev[n-1]=a[n-1];
		
		int j=1;
		
		for(i=0;i<n-1;i++,j++)
		gc[j]=gcd(gc[i],a[j]);
		
		j=n-2;
		for(i=n-1;i>=0;i--,j--)
		gcrev[j]=gcd(gcrev[i],a[j]);
		
		
		for(i=0;i<q;i++)
		{
			scanf("%d %d",&l,&r);
		
			int temp1=0,temp2=0,temp3;
			
			if(l!=1)	
			temp1=gc[l-2];			
			else
			temp1=gcrev[r];
			
			if(r!=n)
			temp2=gcrev[r];	
			else
			temp2=gc[l-2];
			
			//if(temp1!=0 && temp2!=0 )
			temp3=gcd(temp1,temp2);	
				
			printf("%d\n",temp3);
		}	
		//free(a);
		//free(gc);
		//free(gcrev);
	}
	return 0;
}


int gcd(int a, int b)
{
    if(b == 0) 
    {
            return a;
    }
    else 
    {
        return gcd(b, a % b);
    }
}

