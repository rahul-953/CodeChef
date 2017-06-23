import java.util.*;

public class PERMUT2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		//System.out.print("Enter 1st number: ");
		n=sc.nextInt();
		boolean t;
		
		while(n!=0)
		{
			int a[]=new int[n];
			int i=0;
			
			for(i=0;i<n;i++)
			a[i]=sc.nextInt();
			
			t=true;
			
			for(i=1;i<=n;i++)
			{
				if(a[a[i-1]-1]==i)
				continue;
			
				else
				{
					t=false;
					break;
				}
			}
			
			if(t==true)
			System.out.println("ambiguous");
			else
			System.out.println("not ambiguous");
				
			n=sc.nextInt();
		}	
	}	
}