import java.util.*;

class STFM_42
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n, m;
		n=sc.nextInt();
		m=sc.nextInt();
		
		int i,j;
		long a[]=new long[n];
		long sum=0,ans=0;
		for(i=0;i<n;i++)			
		a[i]=sc.nextLong();
	
		for(i=0;i<n;i++)
		{
			long fact=1;	
			sum=0;
			for(j=1;j<=a[i];j++)
			{
				sum=(sum+((fact%m)*(j%m))%m)%m;
				
				if(fact%m==0)
				break;
			
				else
				fact=((fact%m)*((j+1)%m))%m;
			}
			sum=sum+( (a[i]%m) * (a[i]%m)*((a[i]+1)%m))/2;
			//System.out.println("F( "+(i+1)+" ) is : "+sum);
			ans=((ans%m)+((sum)%m))%m;
		}
		System.out.println(ans);
	}
}