import java.util.*;
import java.io.*;
import java.util.Arrays	;

class MXMEDIAN { 
	public static void main(String args[] ) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int max=0;
		int i=0;
		
		while(t-->0){
			int n = sc.nextInt();
			int arr[] = new int[2*n];	
			
			for(i=0;i<2*n;i++){
				arr[i] = sc.nextInt();
			}		
			
			Arrays.sort(arr);
			int temp[] = new int[2*n];
			int j=2*n-1;
			int k=0;
			for(i=0;i<j;i++,j--){
				temp[k++] = arr[i];
				temp[k++] = arr[j];
			}	
			
			int B[] = new int[n];
			for(i=0;i<n;i++){
				B[i] = (int)Math.max(temp[2*i],temp[2*i+1]);
			}
			
			Arrays.sort(B);
			System.out.println(B[n/2]);
			for(i=0;i<2*n;i++){
				System.out.print(temp[i]+" ");
			}
		}
	}
}