import java.io.*;
import java.util.Arrays;
class GDOG
{
	public static void main(String arg[])throws IOException
	{
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		while(t-->0)
		{
		  //n= Integer.parseInt(br.readLine());
		  String arrs[] = br.readLine().split(" ");
		  n = Integer.parseInt(arrs[0]);
		  int  k = Integer.parseInt(arrs[1]);
		  int max = 0;
		  int i;
		  for(i=2;i<=k;i++)
		  {
		  	if(n%i>max)
		  	max = n%i;
		  }
		  System.out.println(max);
		}
	}
}	