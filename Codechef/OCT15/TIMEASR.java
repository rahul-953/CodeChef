import java.io.*;

class TIMEASR
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int t = Integer.parseInt(br.readLine());
		int m,h;
		float delta, diff = (float)(1.0/120.0);
		float A; 
		String time = "";
		
		while(t-->0)
		{
			A = Float.parseFloat(br.readLine());
			time = "";
			
			for(h=0;h<12;h++)
			{
				for(m=0;m<60;m++)
				{
					delta = (float)0.5*Math.abs(60*h-11*m);
					delta = (float)Math.min(delta,360-delta);
					
					//System.out.println("delta : "+delta+"  Diff : "+diff);
					if((float)Math.abs(delta-A)<=diff)
					{
						if(h<10)
						time += "0"+h+":";
						
						else
						time += h+":";	
						
						if(m<10)
						time = time + "0"+ m;
						else
						time = time + m;

						pw.println(time);
						time = "";
					}	
				}
			}
		}
		
		pw.close();
	}
}