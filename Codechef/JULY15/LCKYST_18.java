import java.util.*;
import java.io.*;
class LCKYST_18
{
	public static void main(String arg[]) throws IOException
	{
		int n=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		//Scanner sc=new Scanner(System.in);
		
		line = br.readLine();
		String temp[] = line.split(" ");
		n = Integer.parseInt(temp[0]);	
		
		
		String nk[] = line.split(" ");
		int i;
		long A[]	= new long[n];
	
		line = br.readLine();
		String arr[] = line.split(" ");
		
		
		for(i=0;i<n;i++)
		{
			A[i] = Long.parseLong(arr[i]);	
		}
	
		for(i=0;i<n;i++)
		{
			if(A[i]%5!=0)
			System.out.println(A[i]);
		
			else
			{
				String four = "4";
				long nextNum = A[i]*(Integer.parseInt(four));
				long prevNum = A[i];
				boolean greater = true;
				
				while(greater)
				{
					if(trailingZeros(nextNum) > trailingZeros(prevNum))
					{
						prevNum = nextNum ;
						four   += "4";
						nextNum = A[i]*(Integer.parseInt(four));
					}
					else
						greater = false;
				}
				
				System.out.println(prevNum);	
			}
		}
	}
	
	public static int trailingZeros(long num)
	{
		int zero = 0;
		
		while(num>0 && num%10==0)
		{
			zero++;
			num /= 10;
		}
		
		return zero;
	}
}
