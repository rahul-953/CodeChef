import java.io.*;

class ADMAG_5
{
	public static void main(String arg[]) throws IOException
	{
		int t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		long  n;
		
		while(t-->0)
		{
			n = Long.parseLong(br.readLine()); 
			float ind = (float)((Math.log(n*2.2360679+.5))/(Math.log(1.61803))) ;
			int index = (int)Math.floor(ind);
			System.out.println(index-1);
		}
	}
}