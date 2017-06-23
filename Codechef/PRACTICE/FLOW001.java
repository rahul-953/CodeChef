import java.io.*;
class FLOW001
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String ab[] = br.readLine().split(" ");
			int a = Integer.parseInt(ab[0]);
			int b = Integer.parseInt(ab[1]);
			System.out.println(a+b);
		}
	}
}