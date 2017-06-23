import java.util.*;

class DEVCLASS
{
	public static void main(String arg[])
	{
		int t,type,i,j;
		Scanner sc=new Scanner (System.in);
		t=sc.nextInt();
		
		while(t-->0)
		{
			type=sc.nextInt();
			String a=sc.next();
			///StringBuilder a=new StringBuilder(aa);
			
			int boy=0,girl=0;
			int n=a.length();
			int b[]=new int[n];
			int g[]=new int[n];
			int bi=0,gi=0;
			long ans1=0,ans2=0;
			
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
						long ans=0;
						for(i=0;i<bi;i++)
						ans+=(long)(Math.abs(b[i]-g[i]));	
						System.out.println(ans);
					}		
					else // type=2
					{
						long ans=0;
						
						for(i=n-1;i>=0;i--)
						{
							char temp=a.charAt(i);
							
							if(i%2==0)
							{
								if(a.charAt(i)!='B')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='B';j--);
									a=swapChars(a,i,j);
									ans=ans+(j-i)*(j-i);
									
								}
							}
							
							else
							{
								if(a.charAt(i)!='G')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='G';j--);
									a=swapChars(a,i,j);
									ans=ans+(j-i)*(j-i);
								}

							}
						}
						System.out.println(ans);
					}
				}
				
				else if(girl>boy) // #girl>#boy
				{
					bi=0;gi=0;
					
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
						long ans=0;
						for(i=0;i<bi;i++)
						ans+=(long)(Math.abs(b[i]-g[i]));	
						System.out.println(ans);
					}		
					else // type=2 
					{
						long ans=0;
	
						for(i=n-1;i>=0;i--)
						{
							char temp=a.charAt(i);
							
							if(i%2==0)
							{
								if(a.charAt(i)!='G')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='G';j--);
									a=swapChars(a,i,j);
									ans=ans+(j-i)*(j-i);
								}
							}
							
							else
							{
								if(a.charAt(i)!='B')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='B';j--);
									a=swapChars(a,i,j);
									ans=ans+(j-i)*(j-i);
								}
							}	
						}
						System.out.println(ans);
					}
				}
				
				else //girl==boy
				{
						String bb=a;
					bi=0;gi=0;
					
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
					
					//ans1=0;
					
					if(type==0)
					ans1=bi;
				
					else if(type==1)
					{	
						ans1=0;
						for(i=0;i<bi;i++)
						ans1+=(long)(Math.abs(b[i]-g[i]));	
					}		
					
					else //boy=girl abd type=2
					{
						ans1=0;
					
	
						for(i=n-1;i>=0;i--)
						{
							char temp=a.charAt(i);
							
							if(i%2==0)
							{
								if(a.charAt(i)!='G')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='G';j--);
									a=swapChars(a,i,j);
									ans1=ans1+(j-i)*(j-i);
								}
							}
							
							else
							{
								if(a.charAt(i)!='B')
								{
									for(j=i-1;j>=0 && a.charAt(j)!='B';j--);
									a=swapChars(a,i,j);
									ans1=ans1+(j-i)*(j-i);
								}
							}
						}
					}
					
					//ans2=0;
						
					bi=0;
					gi=0;
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
					//ans1=0;
					
					if(type==0)
					ans2=bi;
				
					else if(type==1)
					{	
						ans2=0;
						for(i=0;i<bi;i++)
						ans2+=(long)(Math.abs(b[i]-g[i]));	
					}	
						
					else
					{	
						ans2=0;
						for(i=n-1;i>=0;i--)
						{
							char temp=bb.charAt(i);
								
							if(i%2==0)
							{
								if(bb.charAt(i)!='B')
								{
									for(j=i-1;j>=0 && bb.charAt(j)!='B';j--);
									bb=swapChars(bb,i,j);
									ans2=ans2+(j-i)*(j-i);
								}
							}
								
							else
							{
								if(bb.charAt(i)!='G')
								{
									for(j=i-1;j>=0 && bb.charAt(j)!='G';j--);
									bb=swapChars(bb,i,j);
									ans2=ans2+(j-i)*(j-i);
								}
							}
				
						}	
					}
					if(ans1<=ans2)
						System.out.println(ans1);
						else
						System.out.println(ans2);
				}
			}
			
			else
			System.out.println("-1");
		
		}	
	}
	
	private static String swapChars(String str, int lIdx, int rIdx) 
	{
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }
}