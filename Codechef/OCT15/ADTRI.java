import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class ADTRI
{
	// A function to print all prime factors of a given number n
	public static boolean primeFactors(int n)
	{
		boolean status = false;
		
		// Print the number of 2s that divide n
		while (n%2 == 0)
		n = n>>1;
		
		int sqrt = (int)Math.sqrt(n);
		// n must be odd at this point.  So we can skip one element (Note i = i +2)
		for (int i = 3; (i<=sqrt)&& (!status); i = i+2)
		{
			// While i divides n, print i and divide n
			while (n%i == 0)
			{
				if(i%4==1)
				{
					status = true;	
					break;
				}
				n = n/i;
			}
		}
	 
		// This condition is to handle the case when n is a prime number greater than 2
		if (n > 2 && n%4==1)
		status = true;
	
		return status;
	}
	
	public static boolean isPrime(int n)
	{
		boolean status = true;
		int sqrt = (int)Math.sqrt(n);
		
		
		// Print the number of 2s that divide n
		for (int i = 2; (i<=sqrt); i++)
		{
			// While i divides n, print i and divide n
			if (n%i == 0)
			{
				status = false;	
				break;
			}
		}
		
		return status;
	}
	
	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		int N = (int)Math.sqrt(5*1000000); 
		int i,j=0;
		int listPrimes[] = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997,1009,1013,1019,1021,1031,1033,1039,1049,1051,1061,1063,1069,1087,1091,1093,1097,1103,1109,1117,1123,1129,1151,1153,1163,1171,1181,1187,1193,1201,1213,1217,1223,1229,1231,1237,1249,1259,1277,1279,1283,1289,1291,1297,1301,1303,1307,1319,1321,1327,1361,1367,1373,1381,1399,1409,1423,1427,1429,1433,1439,1447,1451,1453,1459,1471,1481,1483,1487,1489,1493,1499,1511,1523,1531,1543,1549,1553,1559,1567,1571,1579,1583,1597,1601,1607,1609,1613,1619,1621,1627,1637,1657,1663,1667,1669,1693,1697,1699,1709,1721,1723,1733,1741,1747,1753,1759,1777,1783,1787,1789,1801,1811,1823,1831,1847,1861,1867,1871,1873,1877,1879,1889,1901,1907,1913,1931,1933,1949,1951,1973,1979,1987,1993,1997,1999,2003,2011,2017,2027,2029,2039,2053,2063,2069,2081,2083,2087,2089,2099,2111,2113,2129,2131,2137,2141,2143,2153,2161,2179,2203,2207,2213,2221,2237};
		
		int t = Integer.parseInt(br.readLine());
		int n;
		
		while(t-->0)
		{
			n = Integer.parseInt(br.readLine());
			j=0;
			int temp = n;
			boolean status = false;
			boolean prime = true;
			
			if(n<1000000)
			{
				if(n%5==0)
				pw.println("YES");
			
				else if(primeFactors(n))
				pw.println("YES");
				
				else
				pw.println("NO");
			}
			else
			{
				for(j=0;j<331 && (!status);j++)	
				{
					if(n%listPrimes[j]==0)
					{
						while(n%listPrimes[j]==0 && n>1)
						n = n/listPrimes[j];	
					
						prime = false;
						if(listPrimes[j]%4==1)
						{
							status = true;
						}
					}		
				}
				
				if(status)
				{
					pw.println("YES");	
				}
				
				else
				{
					if(n%4==1 && prime)
					pw.println("YES");
					else if(n>1 && !prime && n%4==1)
					pw.println("YES");	
					else
					pw.println("NO");	
				}
			}
		}
		pw.close();
	}
}