import java.io.*;

class FLOW015
{
	public static void main(String argp[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int i;
		float max = 0;
		
		while(t-->0)
		{
			int y  = Integer.parseInt(br.readLine());
			y = y-1;
			int ans=0;
			y = y%400;
			
			if(y -300 >=0)
			{
				y -=300;
				ans ++;
			}
			
			if(y -200 >=0)
			{
				y -=200;
				ans +=3;
			}
			
			if(y -100 >=0)
			{
				y -=100;
				ans +=5;
			}
			
			ans += (y/4)*2 +(y-y/4)+1;
			ans = ans%7;
			
			switch(ans)
			{
				case 0 :
				System.out.println("sunday");
				break;
				
				
				case 1 :
				System.out.println("monday");
				break;
				
				
				case 2 :
				System.out.println("tuesday");
				break;
				
				case 3 :
				System.out.println("wednesday");
				break;
				
				case 4 :
				System.out.println("thursday");
				break;
				
				case 5 :
				System.out.println("friday");
				break;
				
				case 6 :
				System.out.println("saturday");
				break;
				
			}
		}
	}
}