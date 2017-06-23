import java.io.*;
import java.util.Arrays;

class DONUTS_12
{
	static int size = 44700000;
	static int  heapSize = size;
	
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n,m;
		String nm[];
		
		while(t-->0)
		{
			String chain[];
			nm = br.readLine().split(" ");
			n = Integer.parseInt(nm[0]);	
			m = Integer.parseInt(nm[1]);	
			chain = br.readLine().split(" ");	
			
			int ser[] = new int[m];
			int i,j;
			
			for(i=0;i<m;i++)
			ser[i] = Integer.parseInt(chain[i]);
			
			Heapsort(ser);
			
			int count = 0 ;
			j=0;
			
			if(m==1)
			count = 0;

			else if(m==2)
			count = 1;
		
			else if(m==3)
			{
				if(ser[0]==1 || ser[1]==1 || ser[2] == 1 )
				count = 1;
			
				else
				count = 2;
			}	
			
			else
			{
				int CountOfOne = 0;
				i=0;
				count = 0;
				
				while(m>1)	
				{
					if(ser[i]== 1)
					{
						m -= 2;
						i++;
						count++;
						continue;
					}
					
					m = m-1;
					ser[i] -= 1;
					count++;
				}
			}	
			System.out.println(count);
		}
	}
	
	
	public static void Heapsort(int a[])
	{
		BuildMaxHeap(a);
		
		for(int i = a.length-1;i>=0;i--)
		{
			swap(a,0,i);
			heapSize--;
			MaxHeapify(a,0);
		}
	}
	
	public static void BuildMaxHeap(int a[])
	{
		heapSize = a.length;
		
		for(int i = a.length/2;i>=0;i--)
			MaxHeapify(a,i);
	}
	
	public static void MaxHeapify(int a[],int i)
	{
		int l = 2*i;
		int r = 2*i+1;
		int largest;
		
		if(l< heapSize && a[l]>a[i])
		largest = l;
		else
		largest = i;
	
		if(r< heapSize && a[r]>a[largest])
		largest = r;

		if(largest !=i)
		{
			swap(a,i,largest);
			MaxHeapify(a,largest);			
		}
	}
	
	public static void swap(int a[],int i,int j)
	{
		a[i] = a[j] + a[i] -(a[j]=a[i]);
	}
}