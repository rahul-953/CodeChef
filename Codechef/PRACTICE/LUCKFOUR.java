import java.io.*;

class LUCKFOUR
{
	public static void main(String rg[])throws IOException
	{
		int t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		int n;
		int count = 0;
		
		while(t-->0)
		{
			n = Integer.parseInt(br.readLine());
			count = 0;
			while(n>0)
			{
				if(n%10==4)	
				count++;
				n/=10;
			}
			System.out.println(count);			
		}
	}
}