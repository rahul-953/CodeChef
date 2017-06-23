import java.util.*;
class FRMQ 
{
	static int[] logTable;
	static int[][] rmq;
	static int[] a;

	public static void init() 
	{
		int n = a.length;
	
		logTable = new int[n + 1];
		for (int i = 2; i <= n; i++)
		logTable[i] = logTable[i >> 1] + 1;
	
		rmq = new int[logTable[n] + 1][n];
	
		for (int i = 0; i < n; ++i)
		rmq[0][i] = i;
	
		for (int k = 1; (1 << k) < n; ++k) 
		{
			for (int i = 0; i + (1 << k) <= n; i++) 
			{
				int x = rmq[k - 1][i];
				int y = rmq[k - 1][i + (1 << k - 1)];
				rmq[k][i] = a[x] <= a[y] ? y: x;
			}
		}
	}

	public static int minPos(int i, int j) 
	{
		int k = logTable[j - i];
		int x = rmq[k][i];
		int y = rmq[k][j - (1 << k) + 1];
		return a[x] <= a[y] ? y: x;
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int i;
		long ans=0;
		a=new int[n];
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		int m,x1,y1;
		m=sc.nextInt();
		x1=sc.nextInt();
		y1=sc.nextInt();

		init();
		for(i=0;i<m;i++)
		{
			if(x1<y1)
			ans+=a[minPos(x1,y1)];
			else
			ans+=a[minPos(y1,x1)];
			
			x1=(x1+7)%(n-1);
			y1=(y1+11)%(n);
		}
		System.out.println(ans);
	}
}