import java.util.*;
import java.util.Arrays;

class STFM_30
{
	//static long  tempMergArr[];	
	//static long  array[];
	
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
			a[i]=sc.nextLong();
			if(a[i]>max)
			max=a[i];
			fact[i]=0;
		}
		
		long facto=1;
		long sap=0;
		long sf=0,temp=0;
		sum=0;
		fact[0]=1;
		i=0;
		max=(max>10000000)?10000000:max;
		
		for(j=1;j<=max;j++)
		{
			//F(x) = 1 * (1! + x) + 2 * (2! + x) + .. + x * (x! + x). 
			//=> 1*1!+2*2!+3*3!+.....+x*x!
			//=> x+2x+3x+4x+........x*x  ==  x*x*(x+1)/2
			
			sf=((j%m)*(facto%m))%m;
			sum=((sum%m)+(sf%m))%m;
			fact[i]=sum%m;
			i++;
			facto=((facto%m)*((j+1)%m))%m;
		}
		long asd;
		for(i=0;i<n;i++)
		{
			asd = a[i]-1;
			if (asd < max){
				temp=(temp + fact[(int) (a[i]-1)] +(((a[i]*a[i]*(a[i]+1))/2)%m) )%m;
			}
			else
			{
				temp=(temp +(((a[i]*a[i]*(a[i]+1))/2)%m) )%m;
			}
		}
		/*
		ans=0;	
		for(i=0;i<n;i++)
		{
			sf=(( (((array[i]%m)*(array[i]%m))%m)*((array[i]+1)%m) ) /2)%m;
			ans=(ans+sf)%m;	
			ans=((ans%m)+((fact[i])%m))%m;		
		}		
			*/
		System.out.println(temp);
	}
}
	
	