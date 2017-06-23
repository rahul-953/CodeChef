import java.io.*;
import java.util.*;

class CDVA1502
{
    public static void main(String argp[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int t,i;
		long n,k,temp;
        t=sc.nextInt();
        //k=sc.nextInt();
        
        while(t-->0)    
        {
			n=sc.nextLong();
			k=sc.nextLong();
			long max=0,ans=1;	
			for(i=0;i<k;i++)
			{	
				temp=sc.nextLong();	
				
				if(temp>max)
				max=temp;
			}
			
			for(i=1;i<=n;i++)
				ans=((ans%max)*(i%max))%max;
			System.out.println(ans);
			
		}    
    }
}