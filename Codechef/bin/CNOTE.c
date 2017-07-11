#include<stdio.h>
#include<stdlib.h>

int main()
{
    /*
    Input
    The first line of input contains an integer T, denoting the number of test cases. Then T test cases are follow.
    The first line of each test case contains four space-separated integers X, Y, K and N, described in the statement. 
    The ith line of the next N lines contains two space-separated integers Pi and Ci, denoting the number of pages and price of the 
    ith notebook respectively.
    
    */   
    
    int t,x,y,k,n;
    scanf("%d",&t);
    
    while(t--)
    {
          int key=0,pi,ci;
          scanf("%d %d %d %d",&x,&y,&k,&n);               
          
          while(n--)
          {
            scanf("%d %d",&pi,&ci);
            if(ci<=k && (pi>=(x-y)) )
            key=1;          
          }
          
          if(key==1)
          printf("LuckyChef\n");
          else
          printf("UnluckyChef\n");
    }
    
    return 0;
}
