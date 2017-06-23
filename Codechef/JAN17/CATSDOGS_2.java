import java.io.*;
import java.math.*;

class CATSDOGS_2 {
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n;
		int cats,dogs,legs;
		String input[];

		n = Integer.parseInt(br.readLine());
		
		while(n-->0){

			input = br.readLine().split(" ");					
			cats = Integer.parseInt(input[0]);
			dogs = Integer.parseInt(input[1]);
			legs = Integer.parseInt(input[2]);
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