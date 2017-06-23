import java.io.*;
import java.util.*;

class MGCHGYM_6
{
	public static boolean subArraySum(int arr[], int n, int sum)
	{
		/* Initialize curr_sum as value of first element
		and starting point as 0 */
		int curr_sum = arr[0], start = 0, i;
	
		/* Add elements one by one to curr_sum and if the curr_sum exceeds the
		sum, then remove starting element */
		for (i = 1; i <= n; i++)
		{
			// If curr_sum exceeds the sum, then remove the starting elements
			while (curr_sum > sum && start < i-1)
			{
				curr_sum = curr_sum - arr[start];
				start++;
			}
	
			// If curr_sum becomes equal to sum, then return true
			if (curr_sum == sum)
			{
				//printf ("Sum found between indexes %d and %d", start, i-1);	
				return true;	
			}
	
			// Add this element to curr_sum	
			if (i < n)
			curr_sum = curr_sum + arr[i];
		}
 
		// If we reach here, then no subarray
		//printf("No subarray found");
		return false;
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
		
		input = br.readLine().split(" ");
		
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
		
			if(subArraySum(temp,Size,w))
			System.out.println("Yes");	
			else 
			System.out.println("No");		
		}
	}
}