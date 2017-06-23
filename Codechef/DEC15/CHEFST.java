import java.io.*;

class CHEFST
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		long n1,n2,m,tot;
		String s[];
		
		while(t-->0)
		{
			long ans = 0;
			s = br.readLine().split(" ");
			n1 = Long.parseLong(s[0]);	
			n2 = Long.parseLong(s[1]);	
			m  = Long.parseLong(s[2]);

			if(m%2 == 0)	
			tot = (m/2)*(m+1);
			else
			tot = ((m+1)/2)*m;

			if(n1>=tot && n2>=tot)
				ans = n1-tot+n2-tot;	
			/*else if(n1>=tot && n2<tot)
				ans = n1-n2;	
			else if(n2>=tot && n1<tot)
				ans = n2-n1;	
			*/
			else // both are small		
				ans = (long)Math.abs(n1-n2);
			pw.println(ans);
		}
		
		pw.close();
	}
}