    #include<stdio.h>
     
    int main()
    {
    int t,p,c=0;
    scanf("%d",&t);
    while(t--)
    {
    c=0;
    scanf("%d",&p);
    while(p>=2048)
    {
    c +=p/2048;
    p=p-(p/2048)*2048;
    }	
    while(p>=1024)
    {
    c +=p/1024;
    p =p-(p/1024)*1024;
    }	
    while(p>=512)
    {
    c+=p/512;
    p=p-(p/512)*512;
    }
    while(p>=256)
    {
    c+=p/256;
    p=p-(p/256)*256;
    }
    while(p>=128)
    {
    c+=p/128;
    p=p-(p/128)*128;
    }
    while(p>=64)
    {
    c+=p/64;
    p=p-(p/64)*64;
    }
    while(p>=32)
    {
    c+=p/32;
    p=p-(p/32)*32;
    }
    while(p>=16)
    {
    c+=p/16;
    p=p-(p/16)*16;
    }
    while(p>=8)
    {
    c+=p/8;
    p=p-(p/8)*8;
    }
    while(p>=4)
    {
    c+=p/4;
    p=p-(p/4)*4;
    }
    while(p>=2)
    {
    c+=p/2;
    p=p-(p/2)*2;
    }
    while(p>=1)
    {
    c+=p/1;
    p=p-(p/1)*1;
    }
    printf("%d\n",c);
    }
     
    return 0;
    } 