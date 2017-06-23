import java.io.*;
import java.util.*;
class COMPILER
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pout=new PrintWriter(new BufferedOutputStream(System.out));
        int test=Integer.parseInt(obj.readLine());
        while(test-->0)
        {
            String str=obj.readLine();
            int ctr=0;
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='<') 
                    count+=1;
                if(str.charAt(i)=='>')
                    count-=1;
                if(count<0)
                    break;
                if(count==0)
                    ctr=i+1;
            }
            pout.println(ctr);
        }
        pout.flush();
    }
}