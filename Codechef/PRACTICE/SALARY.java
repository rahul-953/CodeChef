    import java.util.*;
    class SALARY
    {
    public static void main(String arg[])
    {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int z=0;z<t;z++)
    {
    	int ar[]=new int[10000];
    	int n=sc.nextInt();
    	int min=100000; int sum=0;
    	for(int i=0;i<n;i++)
    	{  ar[i]=sc.nextInt();
               sum=sum+ar[i];
      if(ar[i]<min)
    min=ar[i];
    }     
       
    System.out.println(sum-n*min);
     
    	 }
    }
    } 