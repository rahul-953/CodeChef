import java.util.*;
import java.util.Arrays;

class STFM_2
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
				
		for(i=0;i<n;i++)			
		{
			a[i]=sc.nextLong();
			if(a[i]>max)
			max=a[i];
			//fact[i]=0;
		}
		
		long facto=1;
		long sap=0;
		long sf=0,temp=0;
		sum=0;
		i=0;
		max=(max>m)?m:max;
		long fact[]=new long[(int)max];
		
		for(j=1;j<=max;j++)
		{
			//F(x) = 1 * (1! + x) + 2 * (2! + x) + .. + x * (x! + x). 
			//=> 1*1!+2*2!+3*3!+.....+x*x!
			//=> x+2x+3x+4x+........x*x  ==  x*x*(x+1)/2
			
			sf=((j%m)*(facto%m))%m;
			sum=((sum%m)+(sf%m))%m;
			fact[j-1]=sum%m;
			facto=((facto%m)*((j+1)%m))%m;
		}
		
		long asd;
		long x,y,z;
		for(i=0;i<n;i++)
		{
			asd = a[i]-1;
			
			if (asd < max )
			{				
				if(a[i]%2==0)
				{
					x=(a[i]/2)%m;
					y=a[i]%m;
					z=(a[i]+1)%m;
					temp=((temp)%m + (fact[(int) (a[i]-1)])%m +((x*(y*z))%m) )%m;	
				}
				else
				{
					///x=(a[i]/2)%m;
					y=a[i]%m;
					z=((a[i]+1)/2)%m;
					temp=((temp)%m + (fact[(int) (a[i]-1)])%m +((z*((y*y)%m))%m) )%m;	
				}
			}
			
			else
			{
				if(a[i]%2==0)
				{
					x=(a[i]/2)%m;
					y=a[i]%m;
					z=(a[i]+1)%m;
					temp=(temp +((((x*y)%m)*z)%m)) %m;					
				}
				else
				{
					///x=(a[i]/2)%m;
					y=a[i]%m;
					z=((a[i]+1)/2)%m;
					temp=(temp + ((((y*y)%m)*z)%m) )%m;						
				}
			}
		}
		System.out.println(temp);
	}
}
	
	