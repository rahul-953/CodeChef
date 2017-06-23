import java.util.*;

class CHEFEQ
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			int a[]=new int[100001];
			int n=sc.nextInt();
			int i;
			
			for(i=0;i<100001;i++)
			a[i]=0;
			
			int temp;
			for(i=0;i<n;i++)
			{
				temp=sc.nextInt();
				a[temp]++;
			}
			
			int max=0;
			for(i=1;i<100001;i++)
			{
				if(a[i]>max)
				max=a[i];
			}
			//if(==0)
			//n=n-1;	
			System.out.println((n-max));
		}
	}
}