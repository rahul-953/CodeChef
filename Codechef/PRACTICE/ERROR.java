import java.io.*;

class ERROR
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String imp = br.readLine();
			boolean ans = false;
			int i = 0;
			while(i+2<imp.length())
			{
				//System.out.println(imp.substring(i,i+3));
				if(imp.substring(i,i+3).equals("010") || imp.substring(i,i+3).equals("101"))
				{ ans = true ; break;}
				i++;
			}
			
			if(ans)
			System.out.println("Good");
			else
			System.out.println("Bad");
		}
	}
}