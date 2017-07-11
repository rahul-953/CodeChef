# include<stdio.h>
 
int main()
{  int t;
    scanf("%d",&t);
    while(t--)
    {
       long long int n ;
        scanf("%lld",&n);
        if(n%4==1)
            printf("ALICE\n");
            else printf("BOB\n");
    }
    return 0;
}