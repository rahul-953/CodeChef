import java.util.*;
import java.io.*;

class CHEFROUT_2 {
	public static void main(String args[] ) throws IOException{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i=0;
		
		while(t-->0){
			String line = sc.next();
			boolean correctRoutine = true;
			int len = line.length();
			int previousRoutine = getCurrentRoutine(line.charAt(0));
			for(i=1;i<len;i++){
				if(getCurrentRoutine(line.charAt(i))<previousRoutine){
					System.out.println("no");
					correctRoutine = false;
					break;
				}else{
					previousRoutine = getCurrentRoutine(line.charAt(i));
				}					
			}
			
			if(correctRoutine)
				System.out.println("yes");
		}
	}
	
	public static int getCurrentRoutine(char current){
		switch(current){
			 case 'C' :
			 	return 0;
			 case 'E':
				 return 1;
			 case 'S':
				 return 2;
		}
		
		return -1;
	}
}