import java.io.BufferedReader;
import java.io.InputStreamReader;
class FLOW016 {
	public static void main(String Args[]) throws Exception
	{
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			String s[]=br.readLine().split(" ");
		int a=Integer.parseInt(s[0]);
		int b=Integer.parseInt(s[1]);
		System.out.print(gcd(a,b)+" ");
		System.out.println((a*b)/gcd(a,b));
		}
		}
		catch (Exception e)
		{
			System.exit(0);
		}
	}
	public static int gcd(int a,int b)
	{
		//System.out.print("hi");
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}