#include<stdio.h>
 
int main()
{
long long int t ,n,m;
scanf("%lld",&t);
while(t--)
{
scanf("%lld %lld",&n,&m);
if((n*m)==1)
printf("0/1\n");
 
else if((n*m)%2==0)
printf("1/2\n");
else if((n*m)%2==1)
printf("%lld/%lld\n",n*m/2,n*m);
 
}
 
return 0;
}
 