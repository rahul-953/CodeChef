    #include<stdio.h>
     
    int main()
    {
    int t,count=0,mapping[26];
    scanf("%d",&t);
    char a[100005];
    while(t--)	
    {
    scanf("%s",a);
    int i=0;
    count=0;
    for(i=0;i<26;i++)
    mapping[i]=0;
    for(i=0;a[i]!='\0';i++)
    {
    if( mapping[a[i]-97]==0 )
    {
    count++;
    mapping[a[i]-97]=1;
    }
    }
    printf("%d\n",count);
    }
    return 0;
    }	