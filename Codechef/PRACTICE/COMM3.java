/*	1 -2
	|  |
	3---

	1  2
	|  |   3 cases
	--3- 
	
	1    2
	  3
*/


import java.util.*;

class COMM3
{
	public static void main(String aarg[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int R;
			R=sc.nextInt();
			
			int Cx,Cy,Hx,Hy,Sx,Sy;
			double a,b,c;
			
			Cx=sc.nextInt();
			Cy=sc.nextInt();

			Hx=sc.nextInt();
			Hy=sc.nextInt();

			Sx=sc.nextInt();
			Sy=sc.nextInt();
			
			a=Math.sqrt((Cx-Hx)*(Cx-Hx) +((Cy-Hy)*(Cy-Hy)) );
			b=Math.sqrt((Sx-Hx)*(Sx-Hx) +((Sy-Hy)*(Sy-Hy)) );
			c=Math.sqrt((Cx-Sx)*(Cx-Sx) +((Cy-Sy)*(Cy-Sy)) );
			
			if(a<=R && b<=R && c<=R)
			System.out.println("yes");
			
			else if(a>R && b<=R && c<=R)
			System.out.println("yes");
			
			else if(a<=R && b>R && c<=R)
			System.out.println("yes");
			
			else if(a<=R && b<=R && c>R)
			System.out.println("yes");
			
			else
			System.out.println("no");
		}
	}
}