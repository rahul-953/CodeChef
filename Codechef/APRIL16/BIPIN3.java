import java.io.*;
import java.util.Arrays;

class BIPIN3{
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		long t = Long.parseLong(br.readLine());
		long n,k;
		long MOD = 1000000000+7;
		String text[];
		
		while(t-->0){
			text = br.readLine().split(" ");
			n = Long.parseLong(text[0]);
			k = Long.parseLong(text[1]);
			
			pw.println( (pow(k-1,n-1,MOD)*k)%MOD);	
		}
		
		pw.close();
	}
	
	public static long pow(long n,long k,long mod){
		if(k==0) return 1%mod;
		if(k==1) return n%mod;
		if(k%2==0){
			long temp = pow(n,k/2,mod);
			return (long)(temp*temp)%mod;
		}else{
			long temp = pow(n,k/2,mod);
			temp = (temp*temp)%mod;
			return (temp*(n%mod))%mod;
		}
	}
}