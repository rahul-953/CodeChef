#include<stdio.h>
int main(){
	
	int tc,T;
	scanf("%d",&T);
	for(tc=0;tc<T;tc++){
		int n;
		scanf("%d",&n);
		int notes=0;
		notes+=n/100;
		n%=100;
		notes+=n/50;
		n%=50;
		notes+=n/10;
		n%=10;
		notes+=n/5;
		n%=5;
		notes+=n/2;
		n%=2;
		
		notes+=n;
		
		printf("%d\n",notes);
	}
	return 0;
}