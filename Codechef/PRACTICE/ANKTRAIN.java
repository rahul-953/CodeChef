import java.io.*;
import java.util.Arrays;
import java.util.*;

class ANKTRAIN { 
	static String seats[] = new String[9];
	
	public static void main(String args[])throws IOException{
		seats[0] = "SU";
		seats[1] = "LB"; seats[4] = "LB";
		seats[2] = "MB"; seats[5] = "MB";
		seats[3] = "UB"; seats[6] = "UB";
		seats[7] = "SL"; seats[8] = "SU";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n;
		
		while(t-->0){
			n = Integer.parseInt(br.readLine());
			System.out.println(findNeighbour(n)+seats[findNeighbour(n)%8]);		
		}
	}
	
	public static int findNeighbour(int n){
		if(n%8==0)
			return n-1;
		else if(n%8==7)
			return n+1;
		else if(n%8==6)
			return n-3;
		else if(n%8==5)
			return n-3;
		else if(n%8==4)
			return n-3;
		else if(n%8==3)
			return n+3;
		else if(n%8==2)
			return n+3;
		else 
			return n+3;
		
	}
}