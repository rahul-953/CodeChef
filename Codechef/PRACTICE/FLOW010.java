import java.io.*;

class FLOW010
{
	public static void main(String argp[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			String aa = (br.readLine());
			char a = aa.charAt(0);
			switch(a)
			{
				case 'b' :
				case 'B' :
				System.out.println("BattleShip");
				break;
				
				case 'c' :
				case 'C' :
				System.out.println("Cruiser");
				break;
				
				case 'd' :
				case 'D' :
				System.out.println("Destroyer");
				break;
				
				case 'f' :
				case 'F' :
				System.out.println("Frigate");
				break;			
			}
		}
	}
}