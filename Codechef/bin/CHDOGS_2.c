#include<stdio.h>
 
int main(){
	float side,velocity;
	int t;
	scanf("%d",&t);
	while(t--){
		scanf("%f %f",&side,&velocity);
		printf("%f\n",(2*side)/(3*velocity));
	}
	return 0;
}