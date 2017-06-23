     import java.io.*;
    import java.util.*;
     
    class COINS
    {
    long a[]=new long [4009],ans=0;
    int id=0;
     
    long calculate( long n)
    {
    if(n<12)
    return n;
     
    else if(n<4013)
    {
    id=(int)n;
    if(a[id-12]!=0)
    return a[id-12];
    }
    ans = (calculate(n/2)+calculate(n/3)+calculate(n/4));
    if(n<4013)
    {
    id=(int)n;
    a[id-12]=ans;
    }
    return ans;
    }
    }
     
    class Test
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
