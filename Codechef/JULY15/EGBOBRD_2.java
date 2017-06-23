import java.util.*;
import java.io.*;
class EGBOBRD_2
{
	public static void main(String arg[]) throws IOException
	{
		int t=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		//Scanner sc=new Scanner(System.in);
		
		line = br.readLine();
		String temp[] = line.split(" ");
		t = Integer.parseInt(temp[0]);	
		int n,k;
		
		while(t-->0)
		{
			line = br.readLine();
			String nk[] = line.split(" ");
			n = Integer.parseInt(nk[0]);	
			k = Integer.parseInt(nk[1]);	
			
			int A[]	= new int[n];
			int i,left = k,want,packetNum = 1;
			
			line = br.readLine();
			String arr[] = line.split(" ");
			
			
			for(i=0;i<n;i++)
			{
				A[i] = Integer.parseInt(arr[i]);	
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
