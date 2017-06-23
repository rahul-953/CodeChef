import java.io.IOException;
import java.util.*;


public class TSORT
{
	public static void main(String arh[]) throws IOException
	{
		int t=0,in=0;
		while((in=System.in.read()) != '\n')
		{
			t=t*10+in-'0';
		}
		
		int [] inputs = new int[t];
		int index=0;
		
		while(index < t)
		{
			int num=0;in=0;
			while((in=System.in.read()) != '\n')
			{
				num=num*10+in-'0';
			}
		
			inputs[index++]=num;
		}
	
		Arrays.sort(inputs);
		StringBuilder output = new StringBuilder();
		for(int i:inputs)
		output = output.append(i +"\n");
		System.out.println(output);
	}	
}
	