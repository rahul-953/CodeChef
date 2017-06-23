import java.io.*;

class CHEFSTLT
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String s1 = br.readLine();
			String s2 = br.readLine();
			int min=0,max=0;
			int i,j;
			
			for(i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!= s2.charAt(i))
				max++;
				else if(s1.charAt(i)=='?')
				max++;
			}
			
			for(i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!= s2.charAt(i) && (s1.charAt(i)!='?' && s2.charAt(i)!='?'))
				min++;
			}
			System.out.println(min+" "+max);
		}
	}
}