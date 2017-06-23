import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Scanner;
import java.math.*;
class SEAND2_13
{
    public static void main(String arg[]) throws IOException,NumberFormatException,OutOfMemoryError
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
                
                //int size=A.length();

        	    int b[]=new int[n]; 	  
        	    //int count_base[]=new int[10];
        	   
        	    //char[] chars = A.toCharArray();    
        	    //Arrays.sort(chars);
        	    //String sorted = new String(chars); 
        	    int max=0;//,temp_i=0;

                max=b[0]=sc.nextInt();         	    

                for(i=1;i<n;i++)                    
                {   
    	            b[i]=sc.nextInt(); 
    	            //count_base[(int)Math.log10(b[i])+1]++; 
    	               
    	            if (b[i]>max )	
    	            {  
    	            	max=b[i];
    	            	//temp_i=i; 
    	            }  
                }   

                //String final_l= sorted.substring(0,(int)Math.log10(max)+1);
                //sorted=sorted.substring((int)Math.log10(max)+1);  
            
                //sorted=reverseStringBuffer(sorted);
                //sorted=sorted+final_l;               
                System.out.println(A)   ;  

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
