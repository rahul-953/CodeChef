import java.util.*;

class CHPLGNS_2
{
	public static double abc[][];
	private static int total;
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n=sc.nextInt(); 	// no of polygons
			abc = new double[n][2];
			int i;
			
			for(i=0;i<n;i++)
			{
				int m;	// no. of vertices
				m=sc.nextInt();
				
				int x[]=new int[m];
				int y[]=new int[m];
				
				for(int j=0;j<m;j++)
				{
					x[j]=sc.nextInt();
					y[j]=sc.nextInt();
				}
				
				abc[i][0]=(double)i+1.0;
				abc[i][1]=findArea(x,y);
			}
			//System.out.println("Array Before Sorting");	
			
			sort(abc,1);
			//System.out.println("Array After 1st Sorting");	
			for(i=0;i<n;i++)
			{
				//System.out.println("abc ["+i +"][0] = "+abc[i][0]+"  abc["+i+"][1]="+abc[i][1]);
				abc[i][1]=i;
			}
			
			sort(abc,0);
			//System.out.println("Array After 2nd Sorting");		
			for(i=0;i<n;i++)
			{
				System.out.print((int)abc[i][1]+" ");	
			}
			
			System.out.println();	
		}
	}
 
	

    private static void swap(double[][] arr, int a, int b)
    {
        double tmp = arr[a][0];
        arr[a][0] = arr[b][0];
        arr[b][0] = tmp;
		
        tmp = arr[a][1];
        arr[a][1] = arr[b][1];
        arr[b][1] = tmp;
    }

    private static void heapify(double[][] arr, int i,int r)
    {
        int lft = i * 2;
        int rgt = lft + 1;
        int grt = i;
		
		if(r==0)
		{
			if (lft <= total && arr[lft][0]>(arr[grt][0])) grt = lft;
			if (rgt <= total && arr[rgt][0]>(arr[grt][0])) grt = rgt;
			if (grt != i) {
				swap(arr, i, grt);
				heapify(arr, grt,r);
			}
		}
		else
		{
			if (lft <= total && arr[lft][1]>(arr[grt][1])) grt = lft;
			if (rgt <= total && arr[rgt][1]>(arr[grt][1])) grt = rgt;
			if (grt != i) {
				swap(arr, i, grt);
				heapify(arr, grt,r);
			}
		}
    }

    public static void sort(double[][] arr,int r)
    {
        total = arr.length - 1;

        for (int i = total / 2; i >= 0; i--)
            heapify(arr, i,r);

        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
             heapify(arr, 0,r);
        }
    }

	public static double findArea(int x[],int y[]) 
	{	 
		int j = x.length-1;  // The last vertex is the 'previous' one to the first
		double area=0.0,xsum=0.,ysum=0.;
		int i;
		
		for (i=0; i<x.length-1; i++)
		{
			xsum += x[i]*y[i+1];
			ysum += y[i]*x[i+1]; 
		}
		
		//System.out.println("Area original is = "+area/2);	
		xsum += (x[i]*y[0]);
		ysum += (y[i]*x[0]);
	
		area = xsum-ysum;
		area = Math.abs(area/2);
		//System.out.println("Area is = "+area);
		return area;
	}
}
