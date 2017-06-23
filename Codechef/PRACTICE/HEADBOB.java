import java.io.*;
class HEADBOB
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());	
		
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine()),count=0;
			String response = br.readLine();
			int i=0;
			while(i<n)
			{
				if(response.charAt(i)=='I')
				{
					count = 1;
					break;
				}
				if(response.charAt(i)=='Y')
				{
					count = 2;
					break;
				}
				
				i++;
			}
			
			if(count ==0)
			System.out.println("NOT SURE");
			else if(count ==1)
			System.out.println("INDIAN");
			else
			System.out.println("NOT INDIAN");
		}
	}
}