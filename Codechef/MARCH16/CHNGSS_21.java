import java.io.*;

class CHNGSS_21 {
	public static void main(String arg[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter pw = new PrintWriter(System.out);
		int MaxQues = 10000;
		String input[];
		int n,m,C;
		int i;
		
		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		C = Integer.parseInt(input[2]);
		
		int B[][] = new int[n][m];
		int j,k=0;
		int avg;
		
		System.out.println("2 "+(1)+" "+(n)+" "+(1)+" "+(m));
		System.out.flush();
		avg = Integer.parseInt(br.readLine());
		avg = avg/(n*m);
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++)
				B[i][j] = avg;
		}
		i=2;
		
		for(j=0;j<n && i<C;j++){
			for(k=0;k<m && i<C;k++){
				System.out.println("2 "+(j+1)+" "+(j+1)+" "+(k+1)+" "+(k+1));
				System.out.flush();
				B[j][k] = Integer.parseInt(br.readLine());
				i++;
			}	
		}
		
		int row=j,col=k;
		
		for(row=j;row<n && i< MaxQues;row++){
			for(col=0;col<m && i< MaxQues;col++){
				for(int x=1;x<=50 && i<MaxQues;x++){
					System.out.println("1 "+(row+1)+" "+(row+1)+" "+(col+1)+" "+(col+1)+" "+x+" "+x);
					System.out.flush();
					i++;
					int ans = Integer.parseInt(br.readLine());
					if(ans==1){
						B[row][col] = x;	
						break;
					}	
				}
			}
		}
		
		if(row<n && ((row+1)*(m)>n*m)){
			System.out.println("2 "+(row+1)+" "+(n)+" "+(1)+" "+(m));
			System.out.flush();
			avg = Integer.parseInt(br.readLine());
			avg = avg/(n*m-((row+1)*(m)));
			int ii,jj;
			for(ii=row+1;ii<n;ii++){
				for(jj=0;jj<m;jj++)
					B[ii][jj] = avg;
			}	
		}
		
		System.out.println("3");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(B[i][j]+" ");
			}
			System.out.flush();
		}
		//pw.close();
	}
}