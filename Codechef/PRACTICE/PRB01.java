import java.io.*;

class PRB01
{
	public static void main(String argp[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			
			
			if(isPrime(n))
			System.out.println("yes");
			else
			System.out.println("no");
		}
	}
	
	public static boolean isPrime(int n)
	{
		boolean status = true;
		int i=0;
		if(n==1)
			return false;
		for(i=2;i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)	
			{
				status = false
				;break;
			}
		}
		
		return status;
	}
}