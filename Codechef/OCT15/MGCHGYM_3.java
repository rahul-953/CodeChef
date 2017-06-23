import java.io.*;
import java.util.*;

class MGCHGYM_3
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
	 
		/* // uncomment this code to print table
		 for (int i = 0; i <= sum; i++)
		 {
		   for (int j = 0; j <= n; j++)
			  printf ("%4d", subset[i][j]);
		   printf("\n");
		 } */
	 
		 return subset[sum][n];
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
		
		
		while(q-->0)
		{
			input = br.readLine().split(" ");
			
			if(input[0].equals("1"))
			{
				int l = Integer.parseInt(input[1])-1;
				int r = Integer.parseInt(input[2]);
				arr[l] = r;
					
			}
			
			if(input[0].equals("2"))
			{
				int l = Integer.parseInt(input[1])-1;
				int r = Integer.parseInt(input[2])-1;
				///int last = (r-l+1)/2;
				///int count = r-1;
				
				while(l<r)
				{
					arr[l] = arr[r]+arr[l] - (arr[r]=arr[l]);	
					l++;
					r--;
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
			
			
				if(isSubsetSum(temp,Size,w))
				pw.println("Yes");	
				else 
				pw.println("No");		
			}				
		}
		
		pw.close();
	}
}