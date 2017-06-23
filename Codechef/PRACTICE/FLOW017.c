#include<stdio.h>

int main()
{
    int t=0,i=0,j=0;
    long int a[3]={0},temp=0;

    scanf("%d",&t);

    while(t--)
    {
        scanf("%ld%ld%ld",&a[0],&a[1],&a[2]);
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        printf("%d\n",a[1]);
    }
    return 0;
}