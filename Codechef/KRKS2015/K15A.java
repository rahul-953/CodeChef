import java.util.*;

class K15A
{
	public static void  main(String arg[])throws Exception
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();

		while(t-->0)
		{
			int n;
			n=sc.nextInt();
			int a[]=new int[1000],temp,count=0;
			int i;

			for(i=0;i<n;i++)
			{
				temp=sc.nextInt();
				a[temp-1]++;
			}
			
			for(i=0;i<a.length;i++)
			if(a[i]>1)
			count++;

			System.out.println(count);
		}
	}
}