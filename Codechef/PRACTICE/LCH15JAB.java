import java.io.*;

class LCH15JAB
{
	public static void main(String argp[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int i;
		float max = 0;
		
		while(t-->0)
		{
			String a = (br.readLine());
			float freq[] = new float[26];
			max=freq[0];
			
			for(i=0;i<a.length();i++)
			{
				freq[a.charAt(i)-'a']++;
			}
			
			for(i=0;i<26;i++)
			{
				if(freq[i]>max)
				max = freq[i];
			}
			
			if(max == (float)a.length()/2.0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}