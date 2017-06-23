import java.util.*;
import java.io.*;
class LCKYST_19
{
	public static void main(String arg[]) throws IOException
	{
		int n=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		//Scanner sc=new Scanner(System.in);
		
		line = br.readLine();
		String temp[] = line.split(" ");
		n = Integer.parseInt(temp[0]);	
		
		
		String nk[] = line.split(" ");
		int i;
		long A[]	= new long[n];
	
		line = br.readLine();
		String arr[] = line.split(" ");
		
		
		for(i=0;i<n;i++)
		{
			A[i] = Long.parseLong(arr[i]);	
		}
	
		for(i=0;i<n;i++)
		{
			if(A[i]%5!=0)
			System.out.println(A[i]);
		
			else
			{
				int five=0,two=0;
				long tempo = A[i];
				
				while(tempo>0 && tempo%5==0)
				{
					five++;
					tempo  /= 5;
				}
				tempo = A[i];
				
				while(tempo>0 && tempo%2==0)
				{
					two++;
					tempo  /= 2;
				}
				if(two==0 && five>1)
				tempo = five/2-two;
				else
				tempo = five-two;	
			
				String four = "1";
				if( tempo >= 1)
				{
					four = "";
					while(tempo>0)
					{
						four += "4"; 
						tempo--;
					}
				}
				
				System.out.println(A[i]*(Integer.parseInt(four)));	
			}
		
		
		}
	}
}
