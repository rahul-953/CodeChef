#include<stdio.h>
#include<string.h>

int main()
{
     char M[25002], W[25002],str[50004];
     int i=0, j=0,l1,l2;
     int t, flag=0;
     scanf("%d",&t);
     getchar();
     while(t--)
     {
     flag=0;i = 0;j = 0;

     gets(str);
     while(str[i]!=' ')
        M[j++] = str[i++];
     M[j] = '\0';
     i++;
     j = 0;
    while(str[i])
        W[j++] = str[i++];
    W[j] = '\0';
   l1 = strlen(M);
   l2 = strlen(W);
     i = 0;j = 0;
     if(l2>l1){
     while((M[i]!='\0')&&(W[j]!='\0'))
    {
          if(M[i]==W[j])
              {i++; j++;flag+=1;}
          else
             j++;
    }
     if(flag==l1)
         printf("YES\n");
     else
         printf("NO\n");
    }

     else{
        while((M[i]!='\0')&&(W[j]!='\0'))
    {
          if(M[i]==W[j])
              {i++; j++;flag+=1;}
          else
             i++;
    }
     if(flag==l2)
         printf("YES\n");
     else
         printf("NO\n");
    }

     }

    return 0;
}
