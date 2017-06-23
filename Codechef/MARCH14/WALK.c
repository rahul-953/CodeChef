#include<stdio.h>
//#include<conio.h>
int main()
{
 int t,n,a,i;
 float temp;
 scanf("%d",&t);
 while(t--)
 {
        scanf("%d",&n);  
        temp=0; 
        for(i=0;i<n;i++)   
        {
         scanf("%d",&a);
         if((a+i)>=temp)
         temp=a+i;  
        }
    printf("%d\n",(int)temp);                        
           
 }
//getch();
return 0;

}
