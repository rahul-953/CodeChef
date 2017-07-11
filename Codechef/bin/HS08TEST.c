#include<stdio.h>

int main()
{
      float before,after;
      int draw;      
 
            
            scanf("%d %f",&draw,&before); 
            after=before-.5-draw;
            if( (draw%5==0) && (after>0) )
            printf("%.2f\n",after);
            
            else
            printf("%.2f\n",before);
   	
	return 0;         
}
