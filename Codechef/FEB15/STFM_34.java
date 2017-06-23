import java.util.*;

class STFM_34
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
		long fact[]=new long[10000000];
		
		for(i=0;i<n;i++)			
		{
			a[i]=(sc.nextLong())%m;
			fact[i]=0;
			if(a[i]>max)
			max=a[i];
		}
		
		for(i=0;i<10000000;i++)
		fact[i]=0;
	
		long facto=1;
		long sap=0;
		long sf=0;
		sum=0;
		fact[0]=1;
		
		for(j=1;j<=max;j++)
		{
			//F(x) = 1 * (1! + x) + 2 * (2! + x) + .. + x * (x! + x). 
			//=>1*1!+2*2!+3*3!+.....+x*x!
			//=> x+2x+3x+4x+........x*x  ==  x*x*(x+1)/2
			
			sum=sum-sap;	
			sap=(j*j*(j+1))/2;
			sf=((j%m)*(facto%m))%m;
			sum=((sum%m)+(sf%m))%m;
			sum=sum+sap;
			
			facto=((facto%m)*((j+1)%m))%m;
			
			fact[j-1]=sum%m;
			//System.out.println(fact[j-1]);
		}
		
		ans=0;	
		
		for(i=0;i<n;i++)
		{		
			ans=((ans%m)+((fact[(int)a[i]-1])%m))%m;		
		}
		
		System.out.println(ans);
	}
}