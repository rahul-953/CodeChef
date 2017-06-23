import java.util.*;

class DEVCLASS_5
{
	public static void main(String arg[])
	{
		int t,type;
		Scanner sc=new Scanner (System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			type=sc.nextInt();
			String a=sc.next();
			int boy=0,girl=0,i;
			
			for(i=0;i<a.length();i++)
			{
				if(a.charAt(i)=='G')
				girl++;
			
				else
				boy++;
			}
			
			if(boy-girl>=-1 && boy-girl<=1)
			{
				if(boy>girl)
				{
					int n=a.length();
					int b[]=new int[n];
					int g[]=new int[n];
					int bi=0,gi=0;
					
					for(i=n-1;i>=0;i--)
					{
						if(i%2==0)
						{
							if(a.charAt(i)!='B')
							b[bi++]=i;	
						}
						
						else
						{
							if(a.charAt(i)!='G')
							g[gi++]=i;	
						}
					}
					
					if(type==0)
					System.out.println(bi);	
				
					else if(type==1)
					{
						int ans=0;
						for(i=0;i<bi;i++)
						ans+=(Math.abs(b[i]-g[i]));	
						System.out.println(ans);
					}		
					else
					{
						int ans=0;
						for(i=0;i<bi;i++)
						ans=ans+((b[i]-g[i])*(b[i]-g[i]));	
						System.out.println(ans);
					}
				}
				
				else if(girl>boy)
				{
					int n=a.length();
					int b[]=new int[n];
					int g[]=new int[n];
					int bi=0,gi=0;
					
					for(i=n-1;i>=0;i--)
					{
						if(i%2==0)
						{
							if(a.charAt(i)!='G')
							g[gi++]=i;	
						}
						
						else
						{
							if(a.charAt(i)!='B')
							b[bi++]=i;	
						}
					}
					
					if(type==0)
					System.out.println(bi);	
				
					else if(type==1)
					{
						int ans=0;
						for(i=0;i<bi;i++)
						ans+=(Math.abs(b[i]-g[i]));	
						System.out.println(ans);
					}		
					else
					{
						int ans=0;
						for(i=0;i<bi;i++)
						ans=ans+((b[i]-g[i])*(b[i]-g[i]));	
						System.out.println(ans);
					}
				}
				
				else //girl==boy
				{
					
					int n=a.length();
					int b[]=new int[n];
					int g[]=new int[n];
					int bi=0,gi=0;
					
					for(i=n-1;i>=0;i--)
					{
						if(i%2==1)
						{
							if(a.charAt(i)!='B')
							b[bi++]=i;	
						}
						
						else
						{
							if(a.charAt(i)!='G')
							g[gi++]=i;	
						}
					}
					int ans1=0;
					
					if(type==0)
					ans1=bi;
				
					else if(type==1)
					{
						
						for(i=0;i<bi;i++)
						ans1+=(Math.abs(b[i]-g[i]));	
						//System.out.println(ans);
					}		
					else
					{
						ans1=0;
						for(i=0;i<bi;i++)
						ans1=ans1+((b[i]-g[i])*(b[i]-g[i]));	
						//System.out.println(ans);
					}



					bi=gi=0;
					int ans2=0;
					
					for(i=n-1;i>=0;i--)
					{
						if(i%2==0)
						{
							if(a.charAt(i)!='B')
							b[bi++]=i;	
						}
						
						else
						{
							if(a.charAt(i)!='G')
							g[gi++]=i;	
						}
					}
					
					if(type==0)
					ans2=bi;
				
					else if(type==1)
					{
						ans2=0;
						for(i=0;i<bi;i++)
						ans2 +=(Math.abs(b[i]-g[i]));	
						//System.out.println(ans);
					}		
					else
					{
						ans2=0;
						for(i=0;i<bi;i++)
						ans2=ans2+((b[i]-g[i])*(b[i]-g[i]));	
						//System.out.println(ans);
					}			

					if(ans1>=ans2)		
					System.out.println(ans2);
				
					else
					System.out.println(ans1);
				}
			}
			
			else
			System.out.println("-1");
		
		}
		
	}
}
