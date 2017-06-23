import java.util.*;

class CHEFRP
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();	
		
		while(t-->0)
		{
			int n,ans=0;
			n=sc.nextInt();
			int a[]=new int[n];
			int i,max=0,min=0;
			
			a[0]=sc.nextInt();
			max=a[0];
			min=a[0];
			
			for(i=1;i<n;i++)
			{
				a[i]=sc.nextInt();
				
				if(a[i]>max)
				max=a[i];
				
				if(a[i]<min)
				min=a[i];
			}
						
			if(min<2)
			System.out.println("-1");
			
			else
			{
				for(i=0;i<n;i++)
				{
					ans+=a[i];				
				}
				ans=ans-min+2;
				System.out.println(ans);
			}	
		}
	}
}