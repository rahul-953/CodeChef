import java.util.*;
import java.io.*;
class CHCUBE
{
	public static void main(String arg[]) throws IOException
	{
		int t=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		line = br.readLine();
		t = Integer.parseInt(line);	
		
		while(t-->0)
		{
			line = br.readLine();
			String []colors = line.split(" "); 
			// front, back, left, right, top and bottom,
			int sum=0;
			boolean key = false;
			
			for(int i=0;i<colors.length;i++)
			{
				sum=1;
				switch(i) 
				{
					case 0 :
					case 1 :
						if(colors[i].equals(colors[2]) || colors[i].equals(colors[3]))
						sum++;
					
						if(colors[i].equals(colors[4]) || colors[i].equals(colors[5]))
						sum++;
					break;
					
					case 2 :
					case 3 :
						if(colors[i].equals(colors[0]) || colors[i].equals(colors[1]))
						sum++;
						
						if(colors[i].equals(colors[4]) || colors[i].equals(colors[5]))
						sum++;
					break;
					
					case 4 :
					case 5:
						if(colors[i].equals(colors[0]) || colors[i].equals(colors[1]))
						sum++;
					
						if(colors[i].equals(colors[2]) || colors[i].equals(colors[3]))
						sum++;
					break;
				}
				
				if(sum>=3)
				{
					key=true;
					break;
				}
			}
			
			if(key)
			System.out.println("YES");
			else
			System.out.println("NO");	
		}
	}
}
