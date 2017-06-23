import java.util.*;

class STFM_20
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n, m;
		n=sc.nextInt();
		m=sc.nextInt();
		
		int i,j;
		long a[]=new long[n];
		long sum=0,ans=0,max=0;
		long fact[]=new long[n];
		
		for(i=0;i<n;i++)			
		{
			a[i]=sc.nextLong();
			fact[i]=0;
			if(a[i]>max)
			max=a[i];
		}
		
		long facto=1;
		long sap=0;
		long sf=0;
		sum=0;
		fact[0]=1;
		
		for(j=1;j<=max;j++)
		{
			//F(x) = 1 * (1! + x) + 2 * (2! + x) + .. + x * (x! + x). 
			
			//sum= sum + (j*(j+facto)); 
			//sum=sum+((j*j*(j+1))/2)-(((j-1)*(j-1)*j)/2);
			//sum=sum+( (i%m) * (i%m)*((i+1)%m))/2;	
			//sum=sum%m;
			
			//if(facto%m==0)
			//break;
			
			//else
			sum-=sap;	
			sap=(j*j*(j+1))/2;
			sf=j*facto;
			sum=sum+sap+sf;
			
			facto=facto*(j+1);
			
			fact[j-1]=sum;
			//System.out.println(fact[j-1]);
		}
		ans=0;	
		for(i=0;i<n;i++)
		{		
			//System.out.println("F( "+(i+1)+" ) is : "+ans);
			ans=((ans%m)+((fact[(int)a[i]-1])%m))%m;
				//		System.out.println("F( "+(i+1)+" ) is : "+ans);
		}
		System.out.println(ans);
	}
}