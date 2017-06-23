import java.io.*;
import java.math.*;
import java.util.*;
class CAPIMOVE_3 {
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t;
		int n,U,V;
		long cats,dogs,legs;
		String input[];

		t = Integer.parseInt(br.readLine());
		
		while(t-->0){

			n = Integer.parseInt(br.readLine());					
			input = br.readLine().split(" ");
			LinkedList<Integer> map[]  = new LinkedList[n];
			
			long population[ ]= new long[n];
			long temp_population[ ]= new long[n];
			int i;
			for(i=0;i<n;i++){
				temp_population[i] = population[i] = Long.parseLong(input[i]);
				map[i] = new LinkedList<Integer>();	
			}
			
			for(i=0;i<n-1;i++){
				input = br.readLine().split(" ");
				V = Integer.parseInt(input[0])-1;
				U = Integer.parseInt(input[1])-1;
				map[V].add(U);
				map[U].add(V);
			}
			
			for(i=0;i<n;i++){
				temp_population[i] = 0;
				for(Integer pop : map[i]){
					temp_population[pop] = 0;
				}
				long max = 0;
				int index=0;
				for(int j=0;j<n;j++){
					if(temp_population[j]>max){
						max= temp_population[j];
						index = j;
					}
				}	
				for(int jj=0;jj<n;jj++){
					temp_population[jj] = population[jj];
				}
				pw.print(index+1+" ");
			}
		}
		pw.close();
	}
}