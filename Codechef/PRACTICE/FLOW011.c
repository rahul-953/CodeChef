#include<stdio.h>
int main(){
	int tc,T;
	scanf("%d",&T);
	for(tc=0;tc<T;tc++){
		float n,ans;
		scanf("%f",&n);
		if(n<1500)
			printf("%g\n",n+n/10+(9*n)/10);
		else
			printf("%g\n",n+500+(98*n)/100);
	}
	return 0;
}