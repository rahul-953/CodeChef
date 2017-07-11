    #include<stdio.h>
     
    int main(){
    int test,a,b,min;
     
    scanf("%d",&test);
     
    while(test){
    scanf("%d %d",&a,&b);
    if(a>b){
    min=a;
    }else{
    min=b;
    }
    a=a+b;
    printf("%d %d\n",min,a);
    test--;
    }
     
    return 0;
    }
