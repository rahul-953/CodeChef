import java.io.*;

class CHINSM_2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,k;
		String nk[] = br.readLine().split(" ");
		n = Integer.parseInt(nk[0]);
		k = Integer.parseInt(nk[1]);
		nk = br.readLine().split(" ");
		
		int arr[] = new int[n];
		int count = 0;
		
		for(int i=0;i<n;i++)
		arr[i]	= Integer.parseInt(nk[i]); 
		boolean next = true;
		
		for(int i=0;i<n;i++)
		{
			//if(arr[i]!=k)
			{
				count++;
			
				for(int j=i+1;j<n;j++)
				{
					if(isBad(i,j,k,arr))
					{
						break;	
					}
					else
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean isBad(int i,int j,int K,int arr[])
	{
		int begin,end;
		for( begin = i;begin<j;begin++)
		{
			for(end = begin+1;end<=j;end++)
			{
				if(arr[begin]%arr[end]==K)
				return true;
			}
		}
		
		return false;
	}
}