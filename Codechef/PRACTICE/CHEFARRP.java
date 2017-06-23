import java.io.*;

class CHEFARRP
{
	public static void main( String  arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int i,j;
		//int beg,end;
		int t = Integer.parseInt(br.readLine());
		int N;
		long count = 0;
		long sum=0,prod=1;
		String input[];
		
		while(t-->0)
		{
			count = 0;
			
			N = Integer.parseInt(br.readLine());
			
			int arr[] = new int[N];
			input = br.readLine().split(" ");
			
			for(i=0;i<N;i++)
				arr[i] = Integer.parseInt(input[i]);
			
			for(i=0;i<N;i++)
			{
				sum = 0;
				prod = 1;
				prod *= (long)arr[i];
				sum  +=  (long)arr[i];
				count++;
				for(j=i+1;j<N;j++)
				{
					prod *= (long)arr[j];
					sum  +=  (long)arr[j];
					if(prod==sum)
					{
						count++;
						//pw.println("index = "+i+","+j);
					}
						
				}
			}
			pw.println(count);
		}
		
		pw.close();
	}
}