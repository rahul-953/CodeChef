import java.io.*;

class CLEANUP { 
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		int n,m;
		int i;
		int count =0 ;
		String input[];
		String Chef = "";
		String Asst = "";
		
		while(t-->0){
			Chef = "";
			Asst = "";
			count = 0;
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			m = Integer.parseInt(input[1]);
			
			boolean Completed[] = new boolean[n+1];
			input = br.readLine().split(" ");
			
			for(i=0;i<m;i++){
				Completed[Integer.parseInt(input[i])] = true;
			}
			
			for(i=1;i<=n;i++){
				if(!Completed[i]){
					if(count%2==0){
						Chef += (i)+" ";
						count++;
					}
					else{
						Asst += (i)+" ";
						count++;
					}
				}
			}
			
			pw.println(Chef);
			pw.println(Asst);
		}
		
		pw.close();
	}
}
