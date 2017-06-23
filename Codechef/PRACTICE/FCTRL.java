import java.util.*;
import java.util.Arrays;
public class FCTRL
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t,num,ans=0;
		t=sc.nextInt();
		
		while(t-->0)
		{
			num=sc.nextInt();
			int temp=1;
			ans=0;
			int i=1;
			while(temp>0)		
			{
				temp=num/((int)Math.pow(5,i));
				ans=ans+temp;
				i++;
			}
			System.out.println(ans);
		}
	}
}