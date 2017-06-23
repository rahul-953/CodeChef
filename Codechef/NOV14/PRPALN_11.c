#include<stdio.h>
#include<string.h>
     
int main()
{	
  	int t,i,j;
	scanf("%d",&t);
	char a[100005];
   
	 while(t--)
	 {
	    int count=0;
	    scanf("%s",a);
	    j=strlen(a)-1;
	
	    for(i=0;i<=j;i++)
	    {
		    if(a[i]==a[j])
		    j--;	

		    else if(a[i]!=a[j-1])
		    {
			    //j-=2;
			    //i--;
			    count++;
		    }
		    
		    else
		    {
			j--;i--;count++;
		    }
		
		    if(count>=2)
		    break;
	    }
	
	    if(count>=2)
	    printf("NO\n");
	    else
	    printf("YES\n");
   	 }	
    return 0;
    } 