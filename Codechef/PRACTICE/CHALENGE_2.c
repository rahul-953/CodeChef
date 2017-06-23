     #include<stdio.h>
    #include<stdlib.h>
    int main()
    {
    int t,n,h,score,i;
    char stringg[27]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','\n'};
    scanf("%d %d %d",&t,&n,&h);
    while(t--)
    {
    for(i=0;i<n;i++)
    {
    int j;
    // printf("aeiouponcbvt\n");
    for(j=0;j<12;j++)
    {
    int ran=random();
    printf("%c",stringg[ran%26]);
    
    }
    printf("\n");
    }
    fflush(stdout);
    scanf("%d",&score);
    }
    return 0;
    } 