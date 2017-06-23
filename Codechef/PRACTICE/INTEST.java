import java.io.*;
import java.util.*;

public class INTEST 
{
    public static void main(String args[]) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr, 16 * 1024);
        
        String[] line0 = br.readLine().split(" ");
        int n, k, m = 0;
        n = Integer.parseInt(line0[0]);
        k = Integer.parseInt(line0[1]);
        
        for (int c = 0; c < n; c++) 
        if (Integer.parseInt(br.readLine()) % k == 0)
        m++;
        System.out.println(m);
    }
}