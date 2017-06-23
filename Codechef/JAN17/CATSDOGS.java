import java.io.*;
import java.math.*;

class CATSDOGS {
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n;
		long cats,dogs,legs;
		String input[];

		n = Integer.parseInt(br.readLine());
		
		while(n-->0){

			input = br.readLine().split(" ");					
			cats = Long.parseLong(input[0]);
			dogs = Long.parseLong(input[1]);
			legs = Long.parseLong(input[2]);
			long min,max;
			
			max = (cats+dogs)*4;
			min = ((cats - dogs*2)>0?cats - dogs*2:0)*4 + (dogs)*4;
			
			if(legs>=min && legs<=max && legs%4==0){
				pw.println("yes");
			}else{
				pw.println("no");
			}
		}
		pw.close();
	}
}