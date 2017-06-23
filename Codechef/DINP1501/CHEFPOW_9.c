#include<stdio.h>
#include<math.h>
int main(){int n,a[31],i=0;scanf("%d",&n);while(n>0)n-=(a[i++]=pow(2,(int)log2(n)));while(--i>=0)printf("%d ",a[i]);return 0;} 

