    #include<stdio.h>
    int cmpfunc (const void * a, const void * b)
    {
    return ( *(int*)a - *(int*)b );
    }
    int main()
    {
    int m;
    scanf("%d",&m);
    int a[m],b[m];
    int i,j;
     
    for(i=0;i<m;i++)
    {
    scanf("%d",&a[i]);
    b[i]=a[i];
    }
     
    qsort(a, m, sizeof(int), cmpfunc);
    //printf("Sorted\n");
    //for(i=0,j=0;i<m/2;i++,j++)
    //{
    //for(j=i+1;j<m;j++)
    //b[j]=a[i];
    //j//++;
    //b[j]=a[m-1-i];
   // }
    //if(m%2==1)	
    //b/[j]=a[m/2];
    
    printf("2\n");
     
    //for(i=0;i<m;i++)
    printf("%d %d ",a[0],a[m-1]);
     
    printf("\n");
    return 0;
    } 