import java.util.*;
import java.io.*;
class AMSGAME1
{
	public static int GCD(int a,int b)
	{
		if(b==0)
		return a;
		return GCD(b,a%b);
	}
	
	public static void main(String argp[])
	{
		Scanner sc = new Scanner(System.in); 
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		int n,ip;
		int i;
		
		while(t-->0){
			n = sc.nextInt();
			ip =  sc.nextInt();
			for(i=1;i<n;i++){
				//ip = ;
				ip = GCD(ip,sc.nextInt()); 
			}
			
			pw.println(ip);
		}
		pw.close();
	}
}