#include<stdio.h>
int main(){
    int t,i,n;
    float ans,n_tmp;
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        ans=0;
        n_tmp=n;
        for(i=1;i<=n;i++){
            ans=ans+n_tmp/i;
        }
        printf("%.1f\n",ans);
    }
    return 0;
}