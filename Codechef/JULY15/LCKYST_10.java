import java.util.*;
import java.io.*;
class LCKYST_10
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
			if(A[i]%5==0 && A[i]%10 !=0)
			System.out.println(A[i]*4);
		
			else
			System.out.println(A[i]);
		}
	}
}
