#include<stdio.h>
 
int main(){
	double side,velocity;
	int t;
	scanf("%d",&t);
	while(t--){
		scanf("%lf %lf",&side,&velocity);
		printf("%lf\n",(2.0*side)/(3.0*velocity));
	}
	return 0;
}