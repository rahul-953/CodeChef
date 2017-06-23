import java.io.*;
import java.util.*;

class LOTERY_19
{
	public static long GIF(long a,long b)
	{
		long num = a*b;
		long den = b-a;
		
		if(b==a)
		{
			//System.out.println("Error  a= "+a+"  b = "+b);
			return 2;
		}
		if( ((num)/(den))< 0 )
		return (int)((num/den)-1);	
		
		return num/den;
	}
	
	public static long gcd(long a, long b)
	{
		if (a<b) return gcd(b,a);
		if (a%b==0) return b;
		else return gcd(a, a%b);
	}
	
	public static long LCM(long a, long b)
	{
		return ((a*b)/gcd(a,b));
	}
		
	public static void main(String arg[])throws IOException,OutOfMemoryError
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input[];
		String arr[];
		
		int t = Integer.parseInt(br.readLine());
		int n,k,m;
		long a,b;
		int mod = 1000000000+7;
		int i,j;
		long c[] = new long[t-1];
		long d[] = new long[t-1];
		
		///System.out.println((int)(-3.14));
		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		
		input = br.readLine().split(" ");
		a = Long.parseLong(input[0]);
		b = Long.parseLong(input[1]);
		m = Integer.parseInt(input[2]);
		
		arr = br.readLine().split(" ");
		for(i=0;i<t-1;i++)
		c[i] = Long.parseLong(arr[i]);	
	
		arr = br.readLine().split(" ");
		for(i=0;i<t-1;i++)
		d[i] = Long.parseLong(arr[i]);	
	
		long F[][] = new long[1002][1002];
		for(i=1;i<=1000;i++)
		F[i][1] = i;	
		
		for(i=2;i<=1000;i++)
		{
			for(j=2;j<=i;j++)
			{
				F[i][j] = (GIF(F[i-1][j-1] , F[i][j-1]))%mod;
				//System.out.print( F[i][j]+" ");
			}
			//System.out.println();
		}
	
		long lcm = (long)F[n][k];
		for(i=1;i<k;i++)
		lcm = LCM(lcm,F[n][i]); 	
		
		pw.println(lcm%mod);
		t--;
		int index = 0;
		while(t-->0)
		{
			/***
				Ni = 1 + (A * Answeri-1 + Ci) mod M ,
				Ki = 1 + (B * Answeri-1 + Di) mod Ni,
			*/
			n = 1+(int)(a*lcm + c[index])%m;
			k = 1+(int)(b*lcm + d[index++])%n;	
			
			lcm = (long)F[n][k];
			for(i=1;i<k;i++)
			lcm = LCM(lcm,F[n][i]); 	
			
			pw.println(lcm%mod);
		}
		
		pw.close();
	}
}