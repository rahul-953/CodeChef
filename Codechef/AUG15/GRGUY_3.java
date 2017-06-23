import java.io.*;

class GRGUY_3
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
			boolean doubt = true,possible = true;
			int i = 0,count = 0,current = 1;
			
			if(s1.charAt(i)=='#' && s2.charAt(i)=='#')
			possible = false;
		
			else if(s1.charAt(i)=='#' && s2.charAt(i)=='.')
			{
				doubt = false;
				current = 2;		
			}
			
			else if(s1.charAt(i)=='.' && s2.charAt(i)=='#')
			{
				doubt = false;
				current = 1;		
			}
			else if(s1.charAt(i)=='.' && s2.charAt(i)=='.')
			{
				doubt = true;
				current = 1;		
			}
			
			i++;
			while(i<s1.length())
			{
				if(s1.charAt(i)=='#' && s2.charAt(i)=='#')
				{
					possible = false;
					break;
				}
				
				else if(s1.charAt(i)=='.'&& s2.charAt(i)=='#')
				{
					if(doubt && current ==1)
					{
						doubt = false;
						current = 1;	
					}
					else
					{
						doubt = false;
						current = 1;	
						count++;
					}	
				}
				else if(s1.charAt(i)=='#'&& s2.charAt(i)=='.')
				{
					if(doubt && current ==2)
					{
						doubt = false;
						current = 2;	
					}
					else
					{
						doubt = false;
						current = 2;	
						count++;
					}
				}				
				else
				doubt = true;	
				
				i++;
			}
			
			if(possible)
			{
				System.out.println("Yes");			
				System.out.println(count);			
			}
			
			else
			System.out.println("No");
		}
	}
}