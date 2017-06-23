import java.util.*;

class  STRSUB
{
	public static void  main(String ar[])
	{
    	Scanner sc=new Scanner(System.in);

		int t;
		t=sc.nextInt();
		
		while(t-- >0)
		{
			int n,k,q;
			n=sc.nextInt();
			k=sc.nextInt();
			q=sc.nextInt();
			
			//sc.next();
			
			String a;
			int l,r,i;
			
			a=sc.next();
			//System.out.println("a is :"+a);
			
			for(i=0;i<q;i++)
			{			
				int count=0,count0=0,count1=0;
				l=sc.nextInt();
				r=sc.nextInt();
				
				int j,kk;
				
				for(j=l-1;j<=r-1;j++)
				{
					count0=count1=0;
					//System.out.print(a.charAt(j));
					for(kk=j;kk<=r-1;kk++)
					{
						if(a.charAt(kk)=='0')
						{
						count0++;
									//System.out.println("Char at "+a.charAt(kk));
						}
						else
						count1++;
						
						if(count0<=k && count1<=k)
						{		
							count++;
							//System.out.println(a.substring(j,kk+1));
						}
						
						else 
						break;
					}		 
				}
				System.out.println(count);
			}
		}
	}
}	
	
