import java.io.*;

class GRGUY_6
{
	public static void main(String arg[]) throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t-->0)
		{
			String s1,s2;
			s1 = br.readLine();			
			s2 = br.readLine();

			if(canHe(0,s1,s2))
			{
				System.out.println("Yes");
				System.out.println("2");
			}
			else
			System.out.println("No");
			
		}
	}
	
	public static boolean canHe(int i,String s1,String s2)
	{
		if(i<s1.length()-1)
		{
			if(s1.charAt(i)=='#' && s2.charAt(i)=='#')
			return false;
			
			if(s1.charAt(i+1)=='#' && s2.charAt(i+1)=='#')
			return false;
			
			if(s1.charAt(i)=='.' || s2.charAt(i)=='.')
			return (true && canHe(i+1,s1,s2));
	
		}	
		
		return true;
	}
}