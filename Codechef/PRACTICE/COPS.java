import java.io.*;

class COPS
{
	public static void main( String  arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int i,j;
		int beg,end;
		int t = Integer.parseInt(br.readLine());
		int M,x,y;
		String input[];
		
		while(t-->0)
		{
			input = br.readLine().split(" ");	
			M = Integer.parseInt(input[0]);
			x = Integer.parseInt(input[1]);
			y = Integer.parseInt(input[2]);
			int arr[] = new int[M];
			input = br.readLine().split(" ");
			
			for(i=0; i<M;i++)
				arr[i] = Integer.parseInt(input[i]);
			boolean status[] = new boolean[101];
			
			for(i=0;i<M;i++)
			{
				beg = arr[i]-x*y;
				end = arr[i]+x*y;
				if(beg<=0)
					beg = 1;
				if(end>=101)
					end = 100;
				for(j=beg;j<=end;j++)
					status[j] = true;
			}
			
			int count = 0;
			for(i=1;i<101;i++)
			{
				if(!status[i])
					count++;
			}
			System.out.println(count);
		}
	}
}