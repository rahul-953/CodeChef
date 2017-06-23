import java.util.*;

public class TRISQ
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		
		while(t-->0)
		{
			int b=sc.nextInt();
			int ans=b/2-1;
			
			System.out.println((ans*(ans+1))/2);
		}
	}
}	