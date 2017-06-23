import java.io.*;

class PALL01
{
	public static void main(String argp[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int rev = 0;
			int temp = n;
			while(n>0)
			{
				rev =rev*10 +n%10;
				n   /= 10;
			}
			
			if(temp==rev)
			System.out.println("wins");
			else
			System.out.println("losses");
		}
	}
}