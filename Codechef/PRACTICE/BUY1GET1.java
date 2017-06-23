import java.io.*;

class BUY1GET1 { 
	
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out, false);
	
    	int size = Integer.parseInt(in.readLine());
    	int[] sum = null;
        for(int i=0;i<size;i++){
        	sum = new int[52];
        	
        	String str = in.readLine();
			int lne = str.length();
        	for(int k=0;k<lne;k++){
        		char c = str.charAt(k);
        		if(c>=97){
        			sum[c-71]++;
        		}else{
        			sum[c-65]++;
        		}
        	}
        	
        	int total = 0;
        	for(int s=0;s<52;s++){
        		if(sum[s]>0)
        			total += sum[s]/2 + sum[s]%2;
        	}
        	
        	out.println(total);
        }
        
        out.flush();
	}
	
	
}
