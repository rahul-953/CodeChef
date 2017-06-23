import java.io.*;

class MAXISUM {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		String input[],input1[];
		int n,k,i;
		
		while(t-->0){
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);
			k = Integer.parseInt(input[1]);
			
			int index=0;
			long maxB;
			long prod;
			long sum =0;
			
			long a[] = new long[n];
			long b[] = new long[n];
			
			input1 = br.readLine().split(" ");
			input = br.readLine().split(" ");
			
			maxB = mod(Integer.parseInt(input[0]));
			a[0] = Long.parseLong(input1[0]);
			b[0] = Long.parseLong(input[0]);
			sum = a[0]*b[0];
			
			for(i=1;i<n;i++){
				a[i] = Long.parseLong(input1[i]);
				b[i] = Long.parseLong(input[i]);
				sum += (a[i]*b[i]);
				if(mod(b[i])>maxB){
					maxB = mod(b[i]);
					index = i;
				}
			}
			
			sum -= (a[index]*b[index]);	
			if(b[index]>0 )
				a[index] += k;
			else
				a[index] -= k;
			
			sum += a[index]*b[index];
			pw.println(sum);
		}
		
		pw.close();
	}
	
	public static long mod(long num){
		if(num>=0) return num;
		else return -num;
	}
}