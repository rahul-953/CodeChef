import java.io.*;

class WOUT
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0)
		{
			int n,h;
			String nh[] = br.readLine().split(" ");
			n = Integer.parseInt(nh[0]);
			h = Integer.parseInt(nh[1]);
			long arr[] = new long[n];
			long left[] = new long[n];
			long top[] = new long[n];
			int l,r;

			for(int i=0;i<n;i++)
			arr[i] = n;
		
			for(int i=0;i<n;i++)
			{
				nh = br.readLine().split(" ");
				l = Integer.parseInt(nh[0]);
				r = Integer.parseInt(nh[1]);
				
				left[l] += 1; 
				
				if((r+1)<n)
				top[r+1] +=1;
			}
			
			l=0;
			for(int i=0;i<n;i++)
			{
				l += left[i];
				arr[i] -= (l);
			}
			
			l=0;
			for(int i=0;i<n;i++)
			{
				l += top[i];
				arr[i] += (l);
			}
			
			long cost = 0 ,min;
			int ind=0;
			for(int i=0;i<h;i++)
			cost += arr[i];
			
			min = cost;
			for(int i=h;i<n;i++)
			{
				cost = cost-arr[ind++]+arr[i];
				if(cost<min)
				min=cost;
			}
			System.out.println(min);
		}
	}
}