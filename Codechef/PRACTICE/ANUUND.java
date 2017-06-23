import java.util.*;
import java.util.Arrays;
     
class ANUUND
{
    public static void main(String arg[])
    {
        int t,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
            n=sc.nextInt();
            int a[]=new int[n];
            int i;
            
            for(i=0;i<n;i++)
            a[i]=sc.nextInt();
            
            Arrays.sort(a);
            
            for(i=0;i<n/2;i++)
            {
            	System.out.println(a[i]);
            	System.out.println(a[n-1-i]);
            }
            
            if(n%2==1)	
            System.out.println(a[i]);
            //else
            //System.out.println("\b");

        }
    }
}
