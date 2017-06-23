import java.util.*;
import java.io.*;

class UNICOURS {
	public static void main(String args[] ) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int max=0;
		int i=0;
		
		while(t-->0){
			int n = sc.nextInt();
			max=0;
			int arr[] = new int[n];	
			
			for(i=0;i<n;i++){
				arr[i] = sc.nextInt();
				max = (int)Math.max(max,arr[i]);
			}		
			
			System.out.println(n-max);
		}
	}
}