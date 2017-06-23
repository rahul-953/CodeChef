import java.io.*;
class LEXOPAL {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String input;
		
		while(t-->0){
			input = br.readLine();
			int len = input.length();
			int end = len-1;
			int start = 0;
			char req[] = new char[len];
			boolean possible=true;
			
			while(start<=end){
				if(input.charAt(start)=='.' && input.charAt(end)!='.'){
					req[start] =  req[end] = input.charAt(end);
				}else if(input.charAt(start)=='.' && input.charAt(end)=='.'){
					req[start] =  req[end] = 'a';
				}else if(input.charAt(start)!='.' && input.charAt(end)!='.'){
					if(input.charAt(start)!=input.charAt(end)){
						possible=false;
						break;
					}
					req[start] = req[end] = input.charAt(start);
					
				}else if(input.charAt(start)!='.' && input.charAt(end)=='.'){
					req[start] =  req[end] = input.charAt(start);
				}
				
				start++;
				end--;
			}
			
			if(possible)
				System.out.println(req);
			else
				System.out.println("-1");
		}
	}
}