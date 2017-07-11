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
			else 
			{
				if(t2==0)
				{
					if((T1+t1)>T2 )
				 	ans = (2*T2-T1)/(2*T2);
				 	else
				 	ans = t1*T1/(2*T2);
				}
				else
				{
					if((T2+t2)>T1 )
				 	ans = (2*T1-T2)/(2*T1);
				 	else
				 	ans = t2*T2/(2*T1);
				}
				printf("%f\n",ans );
			}
		}
 
}
 

