import java.io.*;

class MARCHA1
{
	public static boolean subSetDP(int[] A, int sum){
		boolean[][] solution = new boolean[A.length + 1][sum + 1];		
		// if sum is not zero and subset is 0, we can't make it 
		for(int i=1;i<=sum;i++){
			solution[0][i]=false;
		}
		// if sum is 0 the we can make the empty subset to make sum 0
				for(int i=0;i<=A.length;i++){
					solution[i][0]=true;
				}
		//
		for(int i=1;i<=A.length;i++){
			for(int j=1;j<=sum;j++){				
				//first copy the data from the top
				solution[i][j] = solution[i-1][j];
				
				//If solution[i][j]==false check if can be made
				if(solution[i][j]==false && j>=A[i-1])
					solution[i][j] = solution[i][j] || solution[i-1][j-A[i-1]];				
			}
		}		
		return solution[A.length][sum];
	}
	
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		int n,m;
		int i;
		String input[];
		
		while(t-->0){
			input = br.readLine().split(" ");
			n = Integer.parseInt(input[0]);	
			m = Integer.parseInt(input[1]);
			
			int arr[] = new int[n];
			for(i=0;i<n;i++){
				arr[i] = Integer.parseInt(br.readLine());
			}
			
			if(subSetDP(arr,m))
				pw.println("Yes");
			else
				pw.println("No");
		}
		
		pw.close();
	}
}