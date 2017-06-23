import java.util.Scanner;

class CHPUZZLE_1
{
	public static void main(String arg[])
	{
		int h,w,k;
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		k=sc.nextInt();
		int a[][]=new int [h][w];
		int i,j;
		int max[]=new int[k];
		for(i=0;i<k;i++)	
		{
			max[i]=sc.nextInt();
			int pp=max[i];
			
			int p[][]=new int[pp][2];
			int key=0;
			
			for(j=1;j<=pp;j++)
			{
				p[j-1][0]=sc.nextInt()-1;
				p[j-1][1]=sc.nextInt()-1;
				
				if(a[p[j-1][0]][p[j-1][1]]!=0 )
				key=a[p[j-1][0]][p[j-1][1]];
			}
			
			if(key==0)
			{
				for(j=0;j<pp;j++)
				a[p[j][0]][p[j][1]]=i+1;
			}
		}
		
		for(i=0;i<h;i++)
		{
			for(j=0;j<w;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
}