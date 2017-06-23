import java.io.*;
import java.math.*;
class TWTCLOSE
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n,k;
		int open=0,close,currIndex=0,lastClosedIndex=0;
		String input[];

		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		close = n;
		int i = 1;
		
		int tweets[][] = new int[n][2];
		for(i=0;i<n;i++){
			tweets[i][0] = 0;
			tweets[i][1] = 0;	
		}
		
		i=1;
		
		while(i<=k){
			input = br.readLine().split(" ");					
			if(input[0].equals("CLOSEALL")){
				close = n;
				open = 0;
				lastClosedIndex = i;
				pw.println("0");
				i++;
				continue;
			}else{
				int index = Integer.parseInt(input[1])-1;
				if(tweets[index][0]<=lastClosedIndex){
					//int javaBug = (tweets[index][1]%2==0)?open++:open-1>=0?open--:0;
					tweets[index][1] = 1;
					open++;
				}else{
					int javaBug = (tweets[index][1]%2==0)?open++:open-1>=0?open--:0;
					tweets[index][1]++ ;
				}
				tweets[index][0] = i;
			}
			
			i++;
			pw.println(open);
		}
		pw.close();
	}
}