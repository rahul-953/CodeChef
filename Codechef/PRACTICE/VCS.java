import java.util.*;

public class VCS
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int k=sc.nextInt();
			
			int i,j,ti=0,uti=0,temp;
			
			ArrayList<Integer> ignored=new ArrayList<Integer>();
			ArrayList<Integer> tracked=new ArrayList<Integer>();
			
			for(i=0;i<m;i++)
			{
				j=sc.nextInt();
				ignored.add(j);
			}
			
			for(i=0;i<k;i++)
			{
				j=sc.nextInt();
				tracked.add(j);
			}
			
			for(i=1;i<=n;i++)
			{
				if(ignored.contains(i) && tracked.contains(i))
					ti++;
				else if(!ignored.contains(i) && !tracked.contains(i))
					uti++;
			}
			System.out.println(ti+ " "+uti );
		}
	}
}	