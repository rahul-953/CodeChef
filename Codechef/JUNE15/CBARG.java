import java.util.*;
 
class CBARG
{
	public static void main(String arg[] )
	{
		Scanner sc=new Scanner(System.in);	
		int t=sc.nextInt();
			
		while(t-->0)
		{
			int n=sc.nextInt();
			long ans=0;
			long x,curr=0,req=0;
			
			x=sc.nextLong(); 
			ans=x;
			curr=ans;
			
			for(int i=1;i<n;i++)
			{
				x=sc.nextLong();
				req=x;
				
				if(req>=curr)
				{
					ans += req-curr;
					curr=x;
				}
				
				else
				{
					curr = x;
				}
			}
			System.out.println(ans);
		}
	}
}