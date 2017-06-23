import java.io.*;

class FSQRT
{
	public static void main(String tt[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			System.out.println((int)Math.sqrt(n));
		}
	}
}