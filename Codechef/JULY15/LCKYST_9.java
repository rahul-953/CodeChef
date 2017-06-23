import java.util.*;
import java.io.*;
class LCKYST_9
{
	public static void main(String arg[]) throws IOException
	{
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		
		
		n = sc.nextInt();
		
		int i;
		long A[]	= new long[n];
	
		
		
		for(i=0;i<n;i++)
		{
			A[i] = sc.nextLong();
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
