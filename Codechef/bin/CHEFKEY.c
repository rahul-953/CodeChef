#include<stdio.h>

int main(){
	int t;
	scanf("%d",&t);
	
	int n,m,c;
	while(t--){
		scanf("%d %d %d",&n,&m,&c);
		n<=m?n=n:(n=n+m-(m=n));
		int count=0;
		int i=0;
		for(i=1;i<=c;i++){
			int mod = c%i;
			int antiMod = c/i;
			
			if(mod==0 && (i<=n  && antiMod<=m )  )
			{
			 		  
			  count++;
			  }
		}
		
		printf("%d\n",count);
	}
	
	return 0;
}
