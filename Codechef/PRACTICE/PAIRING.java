import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;

public class PAIRING {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Read in from console */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter(System.out);
		
		int t = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<t; i++){
		
			String[] data = reader.readLine().split("\\s");
			
			int n = Integer.parseInt(data[0]);
			int m = Integer.parseInt(data[1]);
			
			String[][] d = new String[m][2];
			
			for(int j=0; j<m; j++){
				d[j] = reader.readLine().split("\\s");
			}
			
			boolean[] used = new boolean[n];
			LinkedList<Integer> lst = new LinkedList<Integer>();
			
			for(int j=m-1; j>=0; j--){
				int a=Integer.parseInt(d[j][0]);
				int b=Integer.parseInt(d[j][1]);
				
				if(used[a] || used[b])
					continue;
				else{
					used[a] = true;
					used[b] = true;
					lst.push(j);
				}
			}
			
			for(Integer x:lst)
				writer.print(x + " ");
			writer.println("");
		}
		
		writer.close();

	}

}

