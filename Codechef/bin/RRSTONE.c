    #include<stdio.h>
    #include<stdlib.h>

    int main()
    {
	    long long max,tot,k;
	    int i,n;
	    scanf("%d %lld",&n,&k);
	
	    long long *a,*a1,*a2;
	    a= (long long *)malloc(sizeof(long long)*n);
	    a1=(long long *)malloc(sizeof(long long)*n);
	    a2=(long long *)malloc(sizeof(long long)*n);

	    for(i=0;i<n;i++)
	    {
		    scanf("%lld",&a[i]);
		   
		    if(i==0)
		    max=a[i];
		    else if(a[i]>max)
		    max=a[i];
	    }
	    
	    for(i=0;i<n;i++)
	    {
		    a1[i]=max-a[i];
		    if(i==0)
		    tot=a1[0];
		    else if(a1[i]>tot)
		    tot=a1[i];
	    }
	
	    max=0;

	    for(i=0;i<n;i++)
	    {
		    a2[i]=tot-a1[i];
		    if(i==0)
		    max=a2[0];
		    else if(a2[i]>max)
		    max=a2[i];
	    }

	    if(k%2==1)
	    {
		    for(i=0;i<n;i++)
		    printf("%lld ",a1[i]);
	    }
     
     	    if(k==0)
	    {  
		    for(i=0;i<n;i++)
		    printf("%lld ",a[i]);     
	    }
         
	   else if(k%2==0)
	   {
		    for(i=0;i<n;i++)
		    printf("%lld ",a2[i]);
	    }
	
	    printf("\n");
	    return 0;
    }	