import java.util.*;
import java.io.*;
import java.util.Arrays	;

/**

111100111101
111110011110
111101111100

111111111100

**/

class CHEFSUBA_4{

	private static int arr[],karr[];
	private static int n,k;
	private static int totalShifts=0;
	private static int start,end;
	
	public static void main(String args[] ) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		if(k>n) k=n;
		int p = sc.nextInt();
		int i=0;
		arr = new int[2*n];
		
		start=0;
		end=n-1;
		
		for(i=0;i<n;i++){
			arr[i] = sc.nextInt();
			arr[i+n] = arr[i];
		}		
		
		//karr = new int[n*2];
		
		//fill_K_Array();
		//System.out.println("KARRAY  : "+printArray());
		
		//SegmentTree sgmntree = new SegmentTree(karr,2*n);
		//System.out.println(sgmntree.printArray());
		
		String line = sc.next();

		
		for(i=0;i<p;i++){
		
			if(line.charAt(i)=='?'){
				//System.out.println("Start = "+start);
				//System.out.println(sgmntree.getMax(n,start,start+n-1));
				System.out.println(maxOnes());
							
			}else{
				//System.out.println("Before : "+printArray());
				start = (start + n-1)%n;  
				//totalShifts = (totalShifts+1);
				//System.out.println("After : "+printArray());  
			}
		}
	}
	
	public static String printArray(){
	
		String array="";
		for(int i=0;i<2*n;i++){
			array += karr[i];
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
	
	public static void fill_K_Array(){
		
		int count = 0;
		
		for(int i=0;i<k;i++)
			count += arr[i];
		
		karr[0] = count;
		//System.out.println("karr[0] = "+karr[0]);
		int prevIndex=0;
			
		for(int i=1;i<2*n-k+1;i++){
			count = count - arr[prevIndex] + arr[i+k-1]; 
			karr[i] = count;
			prevIndex = i;
			//System.out.println("karr["+i+"] = "+karr[i]);
		}
		
		count=0;
		for(int i=2*n-1;i>=2*n-k+1;i--){
			count += arr[i];
			karr[i] = count;
			//System.out.println("karr["+i+"] = "+karr[i]);
		}
	}
}
