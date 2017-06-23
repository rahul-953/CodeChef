     #include<stdio.h>
    #include<string.h>
    int main()
    {
    int t,count=0;
    scanf("%d",&t);
    char s[1005];
    while(t--)
    {
    scanf("%s",s);
    int i;
    count=0;
    for(i=0;i<strlen(s);i++)
    count+=s[i]-96;
    printf("%d\n",count);
    }
     
    return 0;
    } 