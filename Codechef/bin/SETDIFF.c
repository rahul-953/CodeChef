#include <stdio.h>
#define gc getchar_unlocked
int getn(){
	int ret=0;
	char c;
	c=gc();
	while(c<'0' || c>'9') c=gc();
	while(c>='0' && c<='9'){
		ret=(ret<<3)+(ret<<1)+c-'0';
		c=gc();
		
		
	}
	return ret;
	
	}
void heapify(int *arr,int n,int i){
	int parent=i,child=2*i+1;
	int temp=arr[i];
	while(child<n){
		if(child+1<n && arr[child+1]>arr[child])child++;
		if(temp>=arr[child]) break;
		arr[parent]=arr[child];
		parent=child;
		child=2*parent+1;
	}
	arr[parent]=temp;
}
void heapsort(int *arr,int n){
	int i,t;
	for(i=(n-2)/2;i>=0;i--)
		heapify(arr,n,i);
	for(i=n-1;i>0;i--){
		
		t=arr[0];
		arr[0]=arr[i];
		arr[i]=t;
		heapify(arr,i,0);
	}
}
int main(void) {
	// your code goes here
	int t,n,arr[100001],i,a,b,m=1000000007,c,setdiff,j,d;
	t=getn();
	while(t--){
		n=getn();
		for(i=0;i<n;i++)
			arr[i]=getn();
		heapsort(arr,n);
	
		a=1;
		b=1;
		for(i=0;i<n-1;i++){
			b=(b*2)%m;
		}
		c=500000004;
		setdiff=0;
		for(i=0;i<n;i++){
			setdiff=(setdiff+(a-b)*(long long)arr[i])%m;
			a=(a*2)%m;
			b=((long long)b*c)%m;
		}
		printf("%d\n",setdiff);
	}
	return 0;
}