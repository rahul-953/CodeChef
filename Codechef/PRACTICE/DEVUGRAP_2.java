import java.io.*;

class DEVUGRAP_2
{
	public static void main( String  arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int i,j;
		//int beg,end;
		int t = Integer.parseInt(br.readLine());
		int N,k;
		int count = 0;
		String input[];
		
		while(t-->0)
		{
			count = 0;
			input = br.readLine().split(" ");	
			N = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			
			int arr[] = new int[N];
			input = br.readLine().split(" ");
			
			for(i=0;i<N;i++)
			{
				arr[i] = Integer.parseInt(input[i]);
				if(arr[i]%k!=0)
				{
					if(arr[i]<k)
						count += k-arr[i];
					else
						count += (int)Math.min(arr[i]%k,((arr[i]/k)+1)*k -(arr[i]));		
				}
			}
			pw.println(count);
		}
		
		pw.close();
	}
}