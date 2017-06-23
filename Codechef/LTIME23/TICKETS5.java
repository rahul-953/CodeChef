import java.util.*;

class TICKETS5
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			String a=sc.next();
			int i;
			int key=1;
			
			for(i=0;i<a.length();i++)
			{
				if(i%2==0)
				{
					if(a.charAt(i) != a.charAt(0) || a.charAt(i) == a.charAt(1))
					{
						key=0;break;
					}
				}
				else
				{
					if(a.charAt(i) != a.charAt(1)|| a.charAt(i) == a.charAt(0))
					{
						key=0;break;
					}
				}
			}
			if(key==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
}