import java.io.*;
import java.util.*;

class TWOSTR
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String a,b;
		
		while(t-->0)
		{
			a = br.readLine();
			b = br.readLine();
			
			int i=0;
			boolean possible = true;
			for(i=0;i<a.length();i++)	
			{
				if(a.charAt(i)==b.charAt(i) || a.charAt(i)=='?'  || b.charAt(i)=='?')
				continue;
				else{
				possible = false;		
				break;}	
			}
			if(possible)
			System.out.println("Yes");
			else
			System.out.println("No");
		
		}
	}
}