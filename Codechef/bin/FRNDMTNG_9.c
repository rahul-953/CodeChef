#include<stdio.h>
#include<math.h>
 
int main()
{
		//Scanner sc=new Scanner(System.in);
		int t;//
		scanf("%d",&t );//.nextInt();
 
		while(t-->0)		
		{
			float T1,T2,t1,t2;
			float ans=0.0;
			scanf("%f %f %f %f ",&T1,&T2,&t1,&t2 );
			
			if(t1==0 && t2==0)
			{
				//ans=((T1*T1)+(T2*T2));
				//ans=(float)sqrt(ans);
				printf("0.000000001\n");
			}
		}
 
}