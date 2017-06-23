    #include<stdio.h>
    #include<stdlib.h>
     
    int main()
    {
    int t,n,k,i,key,count=0;
    scanf("%d",&t);
    int a[50];
    char s1[]="YES";
    char s2[]="NO";
     
    while(t--)
    {
    count=0;
    scanf("%d%d",&n,&k);
    //a=(int*)malloc(sizeof(int)*n);
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
     
    for(i=0;i<n;i++)	
    {
    if(a[i]%2==0)
    count++;
    }
     
    if(count>=k && k!=0 )
    printf("%s\n",s1);
     
    else if(k==0 && count!=n)
    printf("%s\n",s1);
    
    else
    printf("%s\n",s2);
     
    //free(a);
    }
     
    return 0;
    } 