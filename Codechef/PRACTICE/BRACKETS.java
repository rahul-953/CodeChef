import java.util.*;

class BRACKETS
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
		
			String a,b;
			a=sc.next();
			int i,count=0,max_count=0;
			
			for(i=0;i<a.length();i++)
			{
				if(a.charAt(i)=='('  )
				count++;
				else if(a.charAt(i)==')')
				count--;
				
				max_count=max_count>count ? max_count : count;			
			}
			
			for(i=1;i<=max_count;i++)
			System.out.print("(");
			
			for(i=1;i<=max_count;i++)
			System.out.print(")");
			System.out.println();
		
		}
	}
}