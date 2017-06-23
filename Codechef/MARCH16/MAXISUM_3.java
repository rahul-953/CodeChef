import java.io.*;

class MAXISUM_3 {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		String input[];
		int n,k,i;
		
		while(t-->0){
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			
			int index=0;
			long maxB;
			
			long a[] = new long[n];
			input = br.readLine().split(" ");
			for(i=0;i<n;i++)
				a[i] = Long.parseLong(input[i]);
			
			long b[] = new long[n];
			input = br.readLine().split(" ");
			maxB = mod(Integer.parseInt(input[0]));
			for(i=0;i<n;i++){
				b[i] = Long.parseLong(input[i]);
				if(mod(b[i])>maxB){
					maxB = mod(b[i]);
					index = i;
				}
			}
				
			if(b[index]>0 )
				a[index] += k;
			else
				a[index] -= k;
			
			long sum =0;
			for(i=0;i<n;i++){
				sum += a[i]*b[i];
			}
			
			pw.println(sum);
		}
		
		pw.close();
	}
	
	public static long mod(long num){
		if(num>=0) return num;
		else return -num;
	}
}