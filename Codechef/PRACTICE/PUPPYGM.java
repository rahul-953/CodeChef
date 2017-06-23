import java.io.*;

class PUPPYGM
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int  t = Integer.parseInt(br.readLine());  
		String ab[] ;
		int  a,b;
		
		while(t-->0)
		{
			ab = br.readLine().split(" ");
			a =  Integer.parseInt(ab[0]);  
			b =  Integer.parseInt(ab[1]);  
			
			if(a%2==0 || b%2==0)
			pw.println("Tuzik");
			else
			pw.println("Vanka");
		}
		pw.close();
	}
}