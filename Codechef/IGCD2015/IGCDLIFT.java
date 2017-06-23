import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class IGCDLIFT
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String nhxi[] = br.readLine().split(" ");
			String ls[] = br.readLine().split(" ");
			
			int n = Integer.parseInt(nhxi[0]);
			int h = Integer.parseInt(nhxi[1]);
			int x = Integer.parseInt(nhxi[2]);
			int i = Integer.parseInt(nhxi[3]);
			int l = Integer.parseInt(ls[0]);
			int s = Integer.parseInt(ls[1]);
			
			int time_lift = (int)(Math.abs(x-h))*l + (int)Math.abs(h-i)*l;
			int time_stair = (int)Math.abs(h-i)*s;
			
			if(time_lift<=time_stair) 
			pw.println("LIFT");
			else
			pw.println("STAIRS") ;
		}
		
		pw.close();
	}
}