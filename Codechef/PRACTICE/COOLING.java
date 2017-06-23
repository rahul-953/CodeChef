import java.io.*;
import java.util.*;

class COOLING { 
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	int n = Integer.parseInt(br.readLine());
	while (n-- > 0) {
	    int m = Integer.parseInt(br.readLine());
	    Scanner sc = new Scanner(br.readLine());
	    Scanner sc2 = new Scanner(br.readLine());
	    int[] pies = new int[m];
	    int[] racks = new int[m];
	    for (int i = 0; i < m; i++){
		pies[i] = sc.nextInt();
		racks[i] = sc2.nextInt();
	    }
	    Arrays.sort(pies);
	    Arrays.sort(racks);
	    int pieCount = 0;
	    int rackIndex = 0;
	    for (int i = 0; i < m; i++){
		while (rackIndex < m && pies[i] > racks[rackIndex]){
		    rackIndex++;
		}
		if (rackIndex >= m){
		    break;
		}
	        pieCount++;
		rackIndex++;
	    }
	    System.out.println(pieCount);
	    
	}
    }
}