import java.io.*;
import java.util.*;

class LOTERY
{
	public static int GIF(long a,long b)
	{
		float num = (float)a*(float)b;
		float den = b-a;
		
		if(b==a)
		return 0;
		
		float div = num/den;
		
		if(div < 0)
		return (int)(num/den)-1;	
	
		else
		return (int)(num/den);
	}
	
	public static long gcd(long a, long b)
	{
		long aa = (long)Math.abs(a);
		long bb = (long)Math.abs(b);
		
		if(bb==0)
		return 1;
	
		if (aa<bb) 
		return gcd(bb,aa);
	
		if (aa%bb==0) 
		return bb;
		
		else 
		return gcd(bb, aa%bb);
	}
	
	public static int LCM(long a, long b)
	{
		long aa = (long)Math.abs(a);
		long bb = (long)Math.abs(b);
		if(a==0 && b==0)
		return 0;	
		return (int)((long)(aa*bb)/gcd(aa,bb))%(1000000007);
	}
	
	public static void main(String arg[])throws OutOfMemoryError,IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String input[];
		String arr[];
		
		int t = Integer.parseInt(br.readLine());
		int n,k,m;
		int a,b;
		long mod = 1000000000+7;
		int i,j;
		int c[] = new int[t-1];
		int d[] = new int[t-1];
		
		///System.out.println((int)(-3.14));
		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		
		input = br.readLine().split(" ");
		a = Integer.parseInt(input[0]);
		b = Integer.parseInt(input[1]);
		m = Integer.parseInt(input[2]);
		
		arr = br.readLine().split(" ");
		for(i=0;i<t-1;i++)
		c[i] = Integer.parseInt(arr[i]);	
	
		arr = br.readLine().split(" ");
		for(i=0;i<t-1;i++)
		d[i] = Integer.parseInt(arr[i]);	
	
		long F[][] = new long[1002][1002];
		
		for(i=0;i<1002;i++)
		{
			for(j=0;j<1002;j++)
			F[i][j] = 1;	
		}
		
		for(i=1;i<=1001;i++)
		F[i][1] = i;	
		
		for(i=2;i<=1001;i++)
		{
			for(j=2;j<=i;j++)
			{
				F[i][j] = (GIF(F[i-1][j-1] , F[i][j-1]))%mod;
			}
		}
	
		long lcm = (long)F[n][k];
		for(i=1;i<k && i<n;i++)
		lcm = (long)(LCM(lcm,F[n][i])); 	
		
		pw.println(lcm%mod);
		t--;
		int index = 0;
		
		while(t-->0)
		{
			/***
				Ni = 1 + (A * Answeri-1 + Ci) mod M ,
				Ki = 1 + (B * Answeri-1 + Di) mod Ni,
			*/
			lcm = (long)lcm%mod;
			n = 1 + (int)( ((long)(a%m)*(long)(lcm%m))%(long)m + (long)(c[index]%m) )%m;
			k = 1 + (int)( ((long)(b%n)*(long)(lcm%n))%(long)n + (long)(d[index]%n) )%n;	
			index++;
			
			lcm = (long)Math.abs(F[n][k]);
			for(i=1;i<k && i<n;i++)
			lcm = (long)(Math.abs(LCM(lcm,F[n][i]))%mod); 	
			
			pw.println((long)(Math.abs(lcm%mod)));
		}
		
		pw.close();
	}
}