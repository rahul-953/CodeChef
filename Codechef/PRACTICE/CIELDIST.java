import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CIELDIST {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		//double ans[]=new double[t];
		for(int i=0;i<t;i++)
		{
			String s[]=br.readLine().split(" ");
			int d1=Integer.parseInt(s[0]);
			int d2=Integer.parseInt(s[1]);
			int d=Integer.parseInt(s[2]);
			System.out.println(Math.max(Math.max(0,d-d1-d2),Math.max(d1-d2-d,d2-d1-d)));
		}
	
	}

}