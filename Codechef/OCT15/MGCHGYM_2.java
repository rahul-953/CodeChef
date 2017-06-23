import java.io.*;
import java.util.*;

class MGCHGYM_2
{
	// Returns true if there is a subset of set[] with sun equal to given sum
	public static boolean isSubsetSum(int set[], int n, int sum)
	{
		// The value of subset[i][j] will be true if there is a subset of set[0..j-1]
		//  with sum equal to i
		boolean subset[][] = new boolean[sum+1][n+1];
	 
		// If sum is 0, then answer is true
		for (int i = 0; i <= n; i++)
		subset[0][i] = true;
	 
		// If sum is not 0 and set is empty, then answer is false
		for (int i = 1; i <= sum; i++)
		subset[i][0] = false;
	 
		 // Fill the subset table in botton up manner
		for (int i = 1; i <= sum; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				subset[i][j] = subset[i][j-1];
				if (i >= set[j-1])
				subset[i][j] = subset[i][j] || subset[i - set[j-1]][j-1];
		   }
		}
	 
		return subset[sum][n];
	}
	
	public static int GCD(int a,int b)
	{
		if(b==0) return 1;
		if(a<b) return GCD(b,a);
		if(a%b==0) return b;
		else return GCD(b,a%b);	
	}
	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter pw = new PrintWriter(System.out);
		
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int q = Integer.parseInt(input[1]);
		int arr[] = new int[n];
		int i;
		
		input = br.readLine().split(" ");
		for(i=0;i<n;i++)
		arr[i] = Integer.parseInt(input[i]);	
		
		int kCount[][] = new int[n+1][2];
		int k1 = arr[0];
		int k2,K = 2 ;
		
		kCount[1][0] = 1;
		i=0;
		
		while(arr[i]==k1)
		i++;
		
		k2 = arr[i];
		
		for(i=1;i<n;i++)
		{
			if(arr[i]==k1)
			{
				kCount[i+1][0] = kCount[i][0] + 1;
				kCount[i+1][1] = kCount[i][1] ;
			}
			
			else
			{
				if(k2 != arr[i])
				{
					K = 7;
					break;
				}	
				
				kCount[i+1][0] = kCount[i][0] ;
				kCount[i+1][1] = kCount[i][1] + 1;		
			}
		}
		
		while(q-->0)
		{
			input = br.readLine().split(" ");
			
			if(input[0].equals("1"))
			{
				int l = Integer.parseInt(input[1]);
				int r = Integer.parseInt(input[2]);
				arr[l-1] = r;
				
				if(K==2)
				{							
					kCount[0][0] = 0;		
					kCount[0][1] = 0;
					
					for(i=0;i<n;i++)
					{
						if(arr[i]==k1)
						{
							kCount[i+1][0] = kCount[i][0] + 1;
							kCount[i+1][1] = kCount[i][1] ;
						}
						
						else
						{
							kCount[i+1][0] = kCount[i][0] ;
							kCount[i+1][1] = kCount[i][1] + 1;		
						}
					}
				}
			}
			
			if(input[0].equals("2"))
			{
				int l = Integer.parseInt(input[1])-1;
				int r = Integer.parseInt(input[2])-1;
				
				while(l<r)
				{
					arr[l] = arr[r]+arr[l] - (arr[r]=arr[l]);	
					l++;
					r--;
				}
				
				
				if(K==2)
				{							
					kCount[0][0] = 0;		
					kCount[0][1] = 0;
					
					for(i=0;i<n;i++)
					{
						if(arr[i]==k1)
						{
							kCount[i+1][0] = kCount[i][0] + 1;
							kCount[i+1][1] = kCount[i][1] ;
						}
						
						else
						{
							kCount[i+1][0] = kCount[i][0] ;
							kCount[i+1][1] = kCount[i][1] + 1;		
						}
					}
				}
			}
			
			if(input[0].equals("3"))
			{
				int l = Integer.parseInt(input[1]);
				int r = Integer.parseInt(input[2]);
				int w = Integer.parseInt(input[3]);
				int Size = r-l+1;
				
				int temp[] = new int[Size];
				int index = 0;
				
				for(i=l-1;i<r;i++)
				temp[index++] = arr[i];	
			
				
				if(K==2)
				{							
					int gcd = GCD(k1,k2);
					
					if(w%gcd==0)
					{
						int n1 = kCount[r][0]-kCount[l-1][0];
						int n2 = kCount[r][1]-kCount[l-1][1];	
						
						int ans[] = extended_gcd(k1,k2);
						int x1 = ans[0];
						int y1 = ans[1];
						
						int x = x1; // - (k2/gcd);
						int y = y1; // + (k1/gcd);
						boolean status = false;
						
						if(x<0)
						pw.println("No");
						
						else
						{
							i=1;
							while(i<=n1 && i<=n2 )
							{
								x = x1 - i*(k2/gcd);
								y = y1 + i*(k1/gcd);
								
								if(x<=n1 && x>=0 && y<=n2 && y>=0)
								{
									status = true;
									break;
								}
							}
							if(status)
							pw.println("Yes");
							else
							pw.println("No");
						}
					}
					else
					pw.println("No");
				}
				
				else
				{
					if(isSubsetSum(temp,Size,w))
					pw.println("Yes");	
					else 
					pw.println("No");				
				}			
			}				
		}
		
		pw.close();
	}
	
	
	public static int[] extended_gcd(int a, int b)
    {
		int s = 0;
		int old_s = 1;
		int t = 1;    
		int old_t = 0;
		int r = b;
		int old_r = a;
		int quotient;
		int temp ;
		
		while(r != 0) 
		{
			quotient = old_r / r;
			
			//(old_r, r) := (r, old_r - quotient * r)
			temp = r;
			r = old_r - quotient * temp;
			old_r = temp;
			
			//(old_s, s) := (s, old_s - quotient * s)
			temp = s;
			s = old_s - quotient * temp;
			old_s = temp;
			
			//(old_t, t) := (t, old_t - quotient * t)
			temp = t;
			t =  old_t - quotient * t;
			old_t = temp;
		}
		
		int ans[] = new int[5];
		ans[0] = old_s;	
		ans[1] = old_t;
		ans[2] = old_r;
		ans[3] = t;
		ans[4] = s;
		
		return ans;
	}
}