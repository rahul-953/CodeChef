import java.util.*;

class CIELAB
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		if(c%10 ==9)
		System.out.println((c-1));
		else
		System.out.println((c+1));
	}
}