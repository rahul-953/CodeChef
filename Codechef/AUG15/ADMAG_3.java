import java.io.*;

class ADMAG_3
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
			double ind = (double)((Math.log(n*(Math.sqrt(5))+.5))/(Math.log(1.61803))) ;
			int index = (int)Math.floor(ind);
			System.out.println(index-1);
		}
	}
}