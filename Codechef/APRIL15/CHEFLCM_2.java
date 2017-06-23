import java.util.*;

class CHEFLCM_2
{
	public static void main(String arg[])
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			long n=sc.nextLong();
			long count=1,i;
			int temp=0;
			
			if(n%2==0)
			{
				while(n%2 ==0)
				{
					temp++;
					n/=2;
				}
				count=count*(long)(Math.pow(2,temp+1)-1);
			}
			
			for(i=3;i<=Math.sqrt(n);i++)
			{
				temp=0;
				if(n%i==0)
				{
					while(n%i==0)
					{
						temp++;
						n/=i;
					}
					count=count*(long)((Math.pow(i,temp+1)-1)/(i-1));
				}	
			}
			
			//System.out.println("N is: "+n);
			temp=1;
			if(n>2)
			count=count*(long)((Math.pow(n,temp+1)-1)/(n-1));
			System.out.println(count);
		}
	}
}