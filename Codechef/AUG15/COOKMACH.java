import java.util.*;
import java.io.*;

class COOKMACH 
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		String line = br.readLine();
		t = Integer.parseInt(line);
		String values[] = new String[2];
		
		while(t-->0)
		{
			int init,dest;
			int steps = 0;
			line = br.readLine();
			values = line.split(" ");
			init = Integer.parseInt(values[0]);
			dest = Integer.parseInt(values[1]);
			
			while(init != dest)
			{
				if(init%2==1 && init !=1)
				init = (init-1)/2;
				
				else
				{
					if(isPower2(init))
					{
						if(init < dest)
							init = init*2;
						else
							init = init/2;
					}
					
					else
					init /= 2;
				}
				steps++;
			}
			
			System.out.println(steps);
		}
	}
	
	public static boolean isPower2(int n)
	{
		while(n!=1)
		{
			if(n%2==1)
			return false;
			else
			n=n/2;
		}
		return true;
	}
}