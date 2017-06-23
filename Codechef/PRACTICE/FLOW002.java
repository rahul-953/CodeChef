import java.io.*;

class FLOW002
{
   public static void main(String ar[])throws IOException
   {
         BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());
         int a,b;
       	 String ab[];
         while(t-->0)
         {
            ab = br.readLine().split(" ");
            a = Integer.parseInt(ab[0]);
            b = Integer.parseInt(ab[1]);
            System.out.println(a%b);
         }
   }
}