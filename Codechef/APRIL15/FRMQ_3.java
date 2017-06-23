import java.util.*;

class FRMQ_3
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int a[]=new int[n];
		int i;
		
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		int m,x,y;
		m=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		
		int j;
		int ans=0;
		int xx,yy;
		for(i=1;i<=m;i++)
		{
			xx=x;
			yy=y;
			if(x>y)
			{
				xx=y;
				yy=x;
				///y=temp;
			}
			//x=y+x-(y=x);
		
			int max=0;
			
			for(j=xx;j<=yy;j++)
			{
				if(a[j]>max)
				max=a[j];
			}
			ans+=max;
			
			x=((x+7)%(n-1));
			y=((y+11)%(n));
			//System.out.println("Max is: "+max+"  I is:"+i+"X is: "+x+"  Y is: "+y);
		}
		System.out.println(ans);
	}
}

