import java.io.*;

class STRPALIN {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		String s1,s2;
		int c1[],c2[];
		int len1,len2;
		int i;
		
		while(t-->0){
			c1 = new int[26];
			c2 = new int[26];
			
			s1 = br.readLine();
			s2 = br.readLine();
			len1 = s1.length();
			len2 = s2.length();
			
			for(i=0;i<len1;i++){
				c1[s1.charAt(i)-'a']++;
			}
			for(i=0;i<len2;i++){
				c2[s2.charAt(i)-'a']++;
			}
			
			boolean exist = false;
			for(i=0;i<26;i++){
				if(c1[i]!=0 && c2[i]!=0){
					exist = true;
					break;
				}
			}
			if(exist)
				pw.println("Yes");
			else
				pw.println("No");
		}
		
		pw.close();
	}
}