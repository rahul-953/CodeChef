import java.io.*;

class MNMX
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
		String input[];
		
		while(t-->0)
		{
			count = 0;
			N = Integer.parseInt(br.readLine());
			
			int arr[] = new int[N];
			input = br.readLine().split(" ");
			int MAX = Integer.MAX_VALUE;
			
			for(i=0;i<N;i++)
			{
				arr[i] = Integer.parseInt(input[i]);
				if(arr[i]<MAX)
				{
					MAX = arr[i];
				}
			}
			count = (long)((long)MAX*(long)(N-1));
			pw.println(count);
		}
		
		pw.close();
	}
}