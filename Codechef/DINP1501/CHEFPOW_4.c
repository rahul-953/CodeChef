#include<stdio.h>
#include<math.h>
int main(){int n,a[31];scanf("%d",&n);int i=0;while(n>0){a[i]=pow(2,(int)log2(n));n=n-a[i];i++;}for(i--;i>=0;i--)printf("%d ",a[i]);return 0;}