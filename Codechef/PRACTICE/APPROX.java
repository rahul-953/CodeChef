import java.util.*;

class APPROX
{
	public static void main(String arg[])
	{
		int t,k=1000000,i=0,a[]=new int[k];
		//String ar="";
		Scanner sc=new Scanner (System.in);	
		
		
		int r=46870,div=33102;
		//System.out.println("Calculating.....");
		while(k-->0)
		{
			// 103993/33102
			a[i]=(r/div);
			r=(r%div)*10;
			//System.out.println("Ar "+a[i]);

			//if(k==(10000/2))
			//{
			//	System.out.println("Enter t....");		
			//	t=sc.nextInt();
			//}
			i++;
		}

		t=sc.nextInt();
		String ar=Arrays.toString(a);
		ar = ar.replaceAll("\\s","");
		ar = ar.replaceAll("[,]","");
				//System.out.println(ar.substring(1,100));
		while(t-->0)
		{
			k=sc.nextInt();	

			if(k==0)	
			System.out.print("3");

			else
			{	
				System.out.print("3."+ ar.substring(1,k+1));
				
			}
			System.out.println();
		}
	}	
}