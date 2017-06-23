    #include<stdio.h>
    #include<stdlib.h>
    int main()
    {
    int t,n,k,i,key,count=0;
    scanf("%d",&t);
    int *a;
    
    while(t--)
    {
    count=0;
    scanf("%d%d",&n,&k);
    a=(int*)malloc(sizeof(int)*n);
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    for(i=0;i<n;i++)	
    {
    if(a[i]%2==0)
    count++;
    }
    if(count>=k && k!=0 )
    printf("YES\n");
    else if(k==0 && count!=n)
    printf("YES\n");
    else
    printf("NO\n");
    free(a);
    }
    return 0;
    } 