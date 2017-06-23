import java.util.*;

class CHEFCH
{
	public static void main(String arg[])
	{
			Scanner sc=new Scanner(System.in);
			int t;
			t=sc.nextInt();
			String a;
			while(t-->0)
			{
				a=sc.next();
				int i;
				int count=0;
				
				//if(a.charAt(0)=='+')
				//key=1;		
					
				for(i=0;i<a.length();i++ )
				{
					if(i%2==0)
					{
						if(a.charAt(i)!='+')
						count++;
					}
					else
					{
						if(a.charAt(i)!='-')
						count++;			
					}
				}
				int max=count;
				count=0;
				//if(a.charAt(0)=='-')	
				//{	
					for(i=0;i<a.length();i++ )
					{
						if(i%2==0)
						{
							if(a.charAt(i)!='-')
							count++;
						}
						else
						{
							if(a.charAt(i)!='+')
							count++;			
						}
					}
				//}
				
				max=max<count?max:count;
				System.out.println(max);	
			}
	}
}