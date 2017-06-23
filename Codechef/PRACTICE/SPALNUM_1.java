import java.io.*;

class SPALNUM_1 {
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int l,r;
		int i,j;
		String input[];
		long count = 0;
		
		while(t-->0)
		{
			count = 0;
			input =  br.readLine().split(" " );
			l = Integer.parseInt(input[0]);
			r = Integer.parseInt(input[1]);
			
			for(i=l;i<=r;i++)
			{
				if(pallindrome(i))
					count += (long)i;
			}
			System.out.println(count);
		}
	}
	
	public static boolean pallindrome(int n)
	{
		int temp = n;
		int newNum = 0;
		while(temp>0)
		{
			newNum = newNum*10 + temp%10;
			temp /= 10;		
		}
		return n==newNum;
	}
}