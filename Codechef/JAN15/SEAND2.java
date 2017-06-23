import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;
import java.math.*;
class SEAND2
{
    public static void main(String arg[]) throws IOException,NumberFormatException,OutOfMemoryError,StringIndexOutOfBoundsException
    {
        
            String A;
            int t,n,i;
            Scanner sc=new Scanner(System.in);
            t=sc.nextInt(); 

            while((t--)>0)
            {

                A=sc.next();   
                A=A.trim() ;
                n=sc.nextInt();
                
                int size=A.length();

        	    int b[]=new int[n]; 	  
        	    int count_base[]=new int[10];
        	   
        	    char[] chars = A.toCharArray();    
        	    Arrays.sort(chars);
        	    String sorted = new String(chars); 
        	    int max=0,temp_i=0;

                //max=b[0]=sc.nextInt();         	    

                for(i=0;i<n;i++)                    
                {   
    	            b[i]=sc.nextInt(); 
    	            count_base[(int)Math.log10(b[i])+1]++; 
    	               
    	            if (count_base[(int)Math.log10(b[i])+1]>=max )	
    	            {  
    	            	max=count_base[(int)Math.log10(b[i])+1];
    	            	temp_i=i; 
    	            }  
                }   

                //System.out.println("Sorted String is:"+sorted+"dfd" );
                String final_l;

                if(sorted.length()>=(int)Math.log10(b[temp_i])+1 )
                {
                    final_l= (sorted.substring(0,(int)Math.log10(b[temp_i])+1));
                    sorted=sorted.substring((int)Math.log10(b[temp_i])+1);  
                }

                else
                {
                    final_l=sorted.substring(0);
                    sorted="";
                }

                //System.out.println("Final is: "+final_l+"  Sorted is: "+sorted);
                
                sorted=reverseStringBuffer(sorted);
                sorted=sorted+final_l;               
                System.out.println(sorted)   ;  

                //System.gc();
            }
         
        //catch(Exception e)   
        //{
          //  System.out.println(e);
        //}
    } 
    
    public static String reverseStringBuffer(String s) 
    {
        return new StringBuffer(s).reverse().toString();
    }
}   
