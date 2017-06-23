import java.io.*;
import java.util.Arrays;
class SMPAIR
{
	public static void main(String arg[])throws IOException
	{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		while(t-->0)
		{
		  n= Integer.parseInt(br.readLine());
		  String arrs[] = br.readLine().split(" ");
		  int arr[] = new int[n];
		  int i;
		  for(i=0;i<n;i++)
		  arr[i] = Integer.parseInt(arrs[i]);
		  
		  Arrays.sort(arr);
		  System.out.println(arr[0]+arr[1]);
		}
	}
}	