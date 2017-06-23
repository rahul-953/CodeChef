import java.util.*;

class HOTEL
{
	public static void main(String aarg[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		//sc.next();
		
		while(t-->0)
		{
			int n;
			n=sc.nextInt();
			
			int count=0,i,max=0,in[]=new int[n],out[]=new int[n],j=0,k=0;
			
			for(i=0;i<n;i++)
			{
				in[i]=sc.nextInt();
			}
			
			for(i=0;i<n;i++)
			{
				out[i]=sc.nextInt();
			}
			
			Arrays.sort(in);
			Arrays.sort(out);
			
			for(i=0;i<=1000 && j<in.length && k<out.length;i++)
			{
				
				if(out[k]<=i)
				{
					count--;
					k++;
					max=Math.max(max,count);
				}
				
				if(in[j]<=i)
				{
					count++;
					j++;
					max=Math.max(max,count);
				}
				
			}
			System.out.println(max);
		}
	}
}