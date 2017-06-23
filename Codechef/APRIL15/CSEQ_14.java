import java.util.*;

class CSEQ_14
{
	public static void main(String aarg[])
	{
		int t,n,l,r;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			n=sc.nextInt();
			l=sc.nextInt();
			r=sc.nextInt();
			l=r-l+1;
			
			long ans=0;
			int mod=1000000+3;
			
			long a[]=new long[l+1];
			int i;
			
			for(i=0;i<=l;i++)
			a[i]=(i*(i+1))/2;
			
			ans=(ans+l)%mod;
			if(n>=2)
			{
				ans=ans+(((l)*(l+1))/2)%mod;
				
				while((n-2) >=1)
				{
					int j;
					long temp=0;
					
					for(j=1;j<=l;j++)
					{
						ans=(ans+a[j])%mod;
						temp=(temp+a[j])%mod;
						a[j]=temp;		
					}
					
					n--;
				}
			}
			System.out.println(ans);
		}
	}
}