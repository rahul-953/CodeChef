import java.io.*;
import java.util.*;

class PIANO1
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			String s=sc.next();
			int n=sc.nextInt();
			int a,count=1,ini=1,last=12*n,i,ans=0;
			
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='T')
					count+=2;
				else
					count++;
			}
			//System.out.println("Count is : "+count);
			if(last+1-count>0)
			ans+=(last+1-count);// counting single value
			ini=count;
			//a=(last+1-count)/ini;
			while((ini+count-1) <= last)
			{
				ans=ans+(last-(ini+count-1) +1);
				ini+=count-1;
				//a=(last+1-count)/ini;
				
			}
			
			System.out.println(ans);
		}
	}
}
