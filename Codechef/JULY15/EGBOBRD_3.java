import java.util.*;
import java.io.*;
class EGBOBRD_3
{
	public static void main(String arg[]) 
	{
		int t=0;
		Scanner sc=new Scanner(System.in);
		t = sc.nextInt();	
		int n,k;
		
		while(t-->0)
		{
			n=sc.nextInt();
			k=sc.nextInt();

			int A[]	= new int[n];
			int i,left = k,want,packetNum = 1;
			
			for(i=0;i<n;i++)
			{
				A[i] = sc.nextInt();
			}
	
			for(i=0;i<n;i++)
			{
				want = A[i];
				
				if(want<=left)
					left = left - want;
				else
				{
					int more = (int)Math.ceil((want-left)/(double)k);
					left = more*k+left - want ;
					packetNum += more;
				}
	
				if(left>0)
				left--;			
			}
			
			System.out.println(packetNum);
		}
	}
}
