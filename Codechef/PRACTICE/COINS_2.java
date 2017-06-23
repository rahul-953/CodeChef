    import java.io.*;
    import java.util.*;

    class Byteland
    {
        long a[]=new long [3009],ans=0;
        int id=0;

        long calculate( long n)
        {
            if(n<12)
            return n;

            else if(n<3013)
            {
                id=(int)n;
                if(a[id-12]!=0)
                return a[id-12];
            }
     
            ans = (calculate(n/2)+calculate(n/3)+calculate(n/4));
            if(n<3013)
            {
                id=(int)n;
                a[id-12]=ans;
            }
            return ans;
        }
    }

    class COINS_2
    {
        public static void main(String a[])
        {
            Scanner sc=new Scanner(System.in);
            long num;
            int i=0;
            Byteland b=new Byteland();
            while( (i<10) && (num=sc.nextLong())!=-1 )
            {
                System.out.println(b.calculate(num));
                i++;
            }
        }
    } 
