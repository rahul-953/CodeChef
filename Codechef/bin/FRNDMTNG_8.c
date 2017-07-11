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
			else if(t1==0 || t2==0)
			{
				if(t1==0)
				{
					if(t2>=T1)
					ans=T1*T2-(0.5*T2*T2);
					
					else	
					ans=T1*T2-(0.5*T2*T2)-(0.5*(T1-t2)*(T1-t2));		
			
				}
				else
				{
				
					if(t1>=T2)
					ans=T1*T2-(0.5*T1*T1);
					
					else	
					ans=T1*T2-(0.5*T1*T1)-(0.5*(T2-t1)*(T2-t1));		
			
				}
				
				printf("%f\n",ans );
			}
		}
 
}

