    #include<stdio.h>
    #include<stdlib.h>
    int main() {
    int t,t1,t2,t3,t4;
    scanf("%d",&t);
    while(t--) {
    scanf("%d %d %d %d",&t1,&t2,&t3,&t4);
    printf("%lf\n",(double)t1/(t1+t2));
    }
    return 0;
    } 