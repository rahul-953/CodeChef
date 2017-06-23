import java.io.*;
import java.util.*;

class TIDRICE {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
        int t = Integer.parseInt(br.readLine());
        int n ;
		int i;
		String input[];
		String userid;
		int votes;
		
        while(t-->0){
			n = Integer.parseInt(br.readLine());
            HashMap<String,String> UsersLog = new HashMap<String,String>();
            votes = 0;
			
            for(i = 0 ; i < n ; i++ ){
				input = br.readLine().split(" ");
				userid = input[0];
                
				UsersLog.put(userid,input[1]);
			}
			
            
			for (String value : UsersLog.values()){
				//System.out.print(value+" ");
				if(value.equals("+"))
					votes++;
				else
					votes--;
			}
			//System.out.println();
			pw.println(votes);
		}
		
		pw.close();
	}
}
    

