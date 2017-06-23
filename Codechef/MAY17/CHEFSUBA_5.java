	import java.util.*;
import java.io.*;
import java.util.Arrays	;

/**

111100111101
111110011110
111101111100

111111111100

**/

class CHEFSUBA_5 {

	static int arr[];
	static int n,k;
	static int start,end;
	public static void main(String args[] ) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		if(k>n) k=n;
		int p = sc.nextInt();
		int i=0;
		arr = new int[n];
		start=0;
		end=n-1;
		
		for(i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}		
		
		String line = sc.next();

		
		for(i=0;i<p;i++){
		
			if(line.charAt(i)=='?'){
	
				System.out.println(maxOnes());
				//maxOnes();
							
			}else{
				//System.out.println("Before : "+printArray());
				shift();
				//System.out.println("After : "+printArray());  
			}
		}
	}
	
	public static String printArray(){
	
		String array="";
		for(int i=0;i<n;i++){
			array += arr[i];
		}
		return array;
	}
	
	public static void shift(){
		start = (start + n-1)%n;  
		end   = (end   + n-1)%n;	
	}
	
	public static int maxOnes(){

		int count=0;
		int max=0;
		
		for(int i=0;i<k;i++)
			if(arr[(i+start)%n]==1)
			count++;	
		max=count;
		int temp_start=start;
		for(int i=(k+start)%n;i!=start;i=(i+1)%n){
			count = count - arr[temp_start] + arr[i];
			max = (int)Math.max(count,max);		
			temp_start = (temp_start+1)%n;	
		}
		
		return max;
	}	
}