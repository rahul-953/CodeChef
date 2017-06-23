import java.io.*;
import java.util.Arrays;

class CODECRCK
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String nm[] = br.readLine().split(" ");
		long i,k;
		long ai,bi,ak,bk;
		double s,m,ak_temp,bk_temp, y = Math.sqrt(3);
		
		i = Long.parseLong(nm[0]);
		k = Long.parseLong(nm[1]); 
		s = Double.parseDouble(nm[2]);
		
		nm = br.readLine().split(" ");
		
		ai = Long.parseLong(nm[0]);
		bi = Long.parseLong(nm[1]);
		
		if((i%2==0 && k%2==0) || (i%2==1 && k%2==1))  // case 1 and 2 :  either both are even or both are odd
		{
			m = (k-i)*2;
			m = m-s;
			ak_temp = Math.pow(2,m)*(ai+bi);
			pw.println(""+ak_temp);
		}
		
		else
		{
			m = (2*k -2*i - 3.0/2.0);
			ak_temp = ai*(1-y) + bi*(1+y);
			bk_temp = ai*(1+y) - bi*(1-y);
			
			m = m-s;
			ak_temp = Math.pow(2,m)*(ak_temp + bk_temp); 
			pw.println(""+ ak_temp);
		}
		
		pw.close();
	}
}