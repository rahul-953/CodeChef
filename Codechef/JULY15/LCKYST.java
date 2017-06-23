import java.util.*;
import java.io.*;

class LCKYST
{
	public static void main(String arg[]) throws IOException
	{
		int n=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

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
			int five = calculateFive(A[i]);
			int twos = calculateFour(A[i]);
			
			int diff = five-twos;
			
			if(diff<=0)
			System.out.println(A[i]);
			
			else
			{
				if(diff==1 || diff==2)
				System.out.println(A[i]*4);	
			
				else if(diff==3 || diff==4)
				System.out.println(A[i]*4*4);	
			
				else if(diff==6 || diff==5)
				System.out.println(A[i]*4*4*4);	
			
				else if(diff==7 || diff==8)
				System.out.println(A[i]*4*4*4*4);	
			
				else if(diff==10 || diff==9)
				System.out.println(A[i]*4*4*4*4*4);
			
				else if(diff==11 || diff==12)
				System.out.println(A[i]*16*16*16);
			
				else if(diff==13 || diff==14)
				System.out.println(A[i]*16*16*16*4);
			}
		}
	}
	
	public static int calculateFour(long num)
	{
		int count=0;
		
		while(num>0 && num%2==0)
		{
			count++;
			num /= 2;
		}
		
		return count;
	}
	
	public static int calculateFive(long num)
	{
		int count=0;
		
		while(num>0 && num%5==0)
		{
			count++;
			num /= 5;
		}
		
		return count;
	}
}
