#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	int t;
	int n;
	long long int a,b;
	scanf("%d",&t);
	
	while(t--)
	{	
		scanf("%d %lld %lld",&n,&a,&b);
		int aa[n],bb[n];
		int i,j=0,temp;	
		int count1_a=0,count1_b=0;
		long long int ans=0;
		
		for(i=0;i<n;i++)
		bb[i]=aa[i]=0;


		while(a>0)
		{
			if(a%2==1)
			count1_a++;
			
			a/=2;
		}	
		
		while(b>0)
		{
			if(b%2==1)
			count1_b++;
			
			b/=2;
		}
		
		if(count1_a<count1_b)
		count1_a=(count1_a + count1_b) - (count1_b=count1_a);	
		
		//for(i=0;i<count1_a;i++)
		//aa[i]=1;
		
		//for(i=n-1;count1_b--;i--)
		//bb[i]=1;

	
		temp=count1_a<n-count1_b?count1_a:n-count1_b;
		
		j=count1_b<n-count1_a?count1_b:n-count1_a;
		temp+=j;
		//for(i=0;i<n;i++)
		//printf("%d",aa[i]);//	aa[i]=1;
		
		//printf("\n");
		//for(i=0;i<n;i++)
		//printf("%d",bb[i]);
		//printf("\n");

		//System("pause");

		//j=n-1;
		for(i=0;i<temp;i++)
		{
			aa[i]=1;
		}
		
		//j=n-1;
		for(i=n-1;i>=0;i--)
		{
			ans+=( aa[i]*(long long int)pow(2,n-1-i) ) ;
	

			//ans+=temp;				
		}
		printf("%lld\n",ans);
	}
	
	
return 0;
}