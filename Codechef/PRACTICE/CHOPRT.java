import java.io.*;
import java.util.*;
class CHOPRT
{
	public static void main(String arg[]) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
			//String ab[] = br.readLine().split(" ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b)
			System.out.println(">");
			else if(a<b)
			System.out.println("<");
			else
			System.out.println("=");
		}
		//pw.close();
	}
}