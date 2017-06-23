import java.util.*;

public class FCTRL2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t,n;
		//System.out.print("Enter 1st number: ");
		t=sc.nextInt();
		
		while(t-->0)
		{
			n=sc.nextInt();
			int a[]=new int[200];
			int i=0,nn=n;
			
			while(nn>0)
			{
				a[i]=nn%10;
				nn=nn/10;
				i++;
			}
			int m=i;
			//for(i=0;i<m;i++)
				//System.out.print(a[i]);
			//S/ystem.out.println();
			
			int j=1;
			int temp=0;
			
			for(j=n-1;j>=1;j--)
			{
				for(i=0;i<m;i++)
				{
					temp=temp+a[i]*(j);
					a[i]=temp%10;
					temp/=10;
				}
				while(temp>0)
				{
					a[i]=temp%10;
					temp/=10;
					i++;
				}
				m=i;
			}
			m=i;
			for(i=m-1;i>=0;i--)
				System.out.print(a[i]);
			System.out.println();
		}
	}	
	
	
}