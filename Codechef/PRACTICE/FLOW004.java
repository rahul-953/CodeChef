import java.io.*;
import java.util.*;
import java.math.*;
class FLOW004
{	
	public static void main(String args[]) throws IOException
	{
		InputReader in=new InputReader(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int t=in.readInt();int a,sum;
		while(t-->0)
		{
		   a=in.readInt();
		   sum=0;
		   sum=sum+a%10;
		   
		   while(a>0)
		   {
		       a=a/10;
		       
		       if(a<10)
		        sum+=a;
		       
		   }
		    
		   pw.println(sum); 
		   
		    
		}
		pw.flush();
	}
}
class IOUtils 
{
	public static int[] readIntArray(InputReader in, int size) 
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
		{	
			array[i] = in.readInt();
		}
		return array;
	}
	static int GCD(int a,int b)
	{
		if(b==0)
			return a;
		return GCD(b,a%b);
	}
	static int expo(int a, int b)
	{
		int result = 1;
		while (b!=0)
		{
			if ((b&1)!=0)
			{
				result *= a;
			}
			b >>=1 ;
			a *= a;
		}
		return result;
	}
	static int min(int a,int b)
	{
		if(a>b)
			return b;
		return a;
	}
	static int[] getPrimesUptoRootN(int n)
	{
		int x=(int) Math.ceil(Math.sqrt(n));
		boolean flags[] =new boolean[x+1];
		Arrays.fill(flags,true);
		for(int i=2;i<=x;i++)
		{
			if(flags[i])
			{
				for(int j=i*2;j<=x;j=j+i)
				{
					flags[j]=false;
				}
			}
		}
		int count=0;
		int myprimes[]=new int[x];
		for(int i=2;i<=x;i++)
		{
			if(flags[i])
			{
				myprimes[count++]=i;
			}
		}
		return myprimes;
	}
	static int[] primegenerate(int primes[],int m,int n)
	{
		boolean flags[]=new boolean[n-m+1];
		Arrays.fill(flags,true);
		for(int i=0;i<primes.length;i++)
		{
			if(primes[i]!=0)
			{
				int x=primes[i];
				int start=(int)m/x;
				start=start*x;
				if(start<m)
				{
					start+=x;
				}
				for(int j=start;j<=n;j=j+x)
				{
					flags[j-m]=false;
				}
			}
		}
		int count=0;
		int myprimes[]=new int[n-m+1];
		for(int i=0;i<(n-m+1);i++)
		{
			if(flags[i])
			{
				myprimes[count++]=m+i;
			}
		}
		return myprimes;
	}
	static LinkedHashSet<Integer> primegenerator(int m,int n)
	{
		if(m<2)
		{
			m=2;
		}
		int primes[]=getPrimesUptoRootN(n);
		LinkedHashSet<Integer> prime=new LinkedHashSet<Integer>();
		for(int i=0;i<primes.length;i++)
		{
			if(primes[i]!=0 && primes[i]>=m)
			{
				prime.add(primes[i]);
			}
		}
		int finprimes[]=primegenerate(primes,m,n);
		for(int i=0;i<finprimes.length;i++)
		{
			if(finprimes[i]!=0)
			{
				prime.add(finprimes[i]);
			}
		}
		return prime;
	}
}
class InputReader 
{
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;
	public InputReader(InputStream stream) 
	{
		this.stream = stream;
	}
 
	public int read() 
	{
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) 
		{
			curChar = 0;
			try 
			{
				numChars = stream.read(buf);
			} 
			catch (IOException e) 
			{
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
 
	public int readInt() 
	{
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') 
		{
			sgn = -1;
			c = read();
		}
		int res = 0;
		do 
		{
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} 
		while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public String readString() 
	{
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do 
		{
			res.appendCodePoint(c);
			c = read();
		} 
		while (!isSpaceChar(c));
		return res.toString();
	}
 
	public boolean isSpaceChar(int c) 
	{
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
 
	public String next() 
	{
		return readString();
	}
 
	public interface SpaceCharFilter 
	{
		public boolean isSpaceChar(int ch);
	}
}   