import java.util.*;
import java.io.*;
 
public class PRIME1 {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter pw=new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {	
			int i,j;
			int flag=0;
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			String s="";
			for(i=a; i<=b; i++) {
				if(Prime(i))
				//s=s+"\n";
					pw.println(i);
			}
			pw.println();	
		}
		pw.close();
	}
	public static boolean Prime(int n){	
		int j;
		if(n==2)
			return true;
		if(n==1)
			return false;
		if(n%2==0)
			return false;
		for(j=3;j*j<=n;j++){
			if(n%j==0){
				return false;
			}
		}
		return true;
	}
}  