import java.io.*;

class CHEFPATH{
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		long n,m;	
		String text[];
		
		while(t-->0){
			text = br.readLine().split(" ");
			n = Long.parseLong(text[0]);
			m = Long.parseLong(text[1]);
			
			if(n==1){
				if(m==2)
					pw.println("Yes");
				else
					pw.println("No");
				
			}else if(m==1){
				if(n==2)
					pw.println("Yes");
				else
					pw.println("No");
				
			}else if(n%2==1 && m%2==1) 
					pw.println("No");
			else pw.println("Yes");
		}
		
		pw.close();
	}
}