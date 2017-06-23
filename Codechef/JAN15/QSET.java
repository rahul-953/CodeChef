import java.util.*;
import java.io.*;

class QSET
{
    public static void main(String[] args) 
    {

        try
        { 
            int n,m,ty,x,i,j,len,sum=0;
            String y;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            m=sc.nextInt();

            String a;
            a=sc.next();
            char[] chars=a.toCharArray();
            len=a.length();

            int afwd[]=new int[n];    
            int arev[]=new int[n];    

            afwd[0]=a.charAt(0)-'0';
            arev[len-1]=a.charAt(len-1)-'0';

            for(j=1;j<len;j++)
            {    
                sum=afwd[j-1] + (a.charAt(j)-'0');
                afwd[j]=sum;
            }   
            

            for(j=len-2;j>=0;j--)
            {    
                sum=arev[j+1] + (a.charAt(j)-'0');
                arev[j]=sum;
            }   
/*
            for(j=0;j<len;j++)
            System.out.print(afwd[j]+" ");

            System.out.print(" \n\n\n");
            for(j=0;j<len;j++)
            System.out.print(arev[j]+" ");
*/
            for(j=0;j<m;j++)
            {
                ty=sc.nextInt();
                x=sc.nextInt();
                y=sc.nextLine();

                if(ty==1)
                {
                    chars = a.toCharArray();
                    chars[x-1] = y.charAt(1);
                    a=String.valueOf(chars); 
                    //System.out.println(a) ;

                    afwd[0]=a.charAt(0)-'0';
                    arev[len-1]=a.charAt(len-1)-'0';

                    for(i=1;i<len;i++)
                    {    
                        sum=afwd[i-1] + (a.charAt(i)-'0');
                        afwd[i]=sum;
                    }   
                
                    for(i=len-2;i>=0;i--)
                    {    
                        sum=arev[i+1] + (a.charAt(i)-'0');
                        arev[i]=sum;
                    }   
                }

                else
                {   
                    int left=x-1;
                    int right=Integer.parseInt(y.trim())-1;

                    int num;

                    if(left>0 && right<len-1)
                    num=arev[0]-(afwd[left-1]+arev[right+1]);

                    else if(left==0 && right<len-1)
                    num=arev[0]-(arev[right+1]);

                    else if (left!=0 && right==len-1) 
                    num=arev[0]-(afwd[left-1]);                   
                                            
                    else
                    num=arev[0];

                    int sum_found=0,k;

                    chars = a.toCharArray();    
                    String temp="";

                    //System.out.println("\n Left is : " +left+"  Right  is : "+right);

                    for(i=left; i<=right; i++) 
                    {   
                        sum=num;   
                        temp="";
                      //  System.out.println("\nSum for first digit with "+a.charAt(i)+ " is : "+sum);

                        for(k=right;k>=i;k--)
                        {   
                            //temp+=a.charAt(k);
                            if(sum%3==0)
                            sum_found++; 
                               
                            sum-=a.charAt(k)-'0';     
                            //System.out.println("\nTemp is : "+temp);
                        }                          
                        num-=a.charAt(i)-'0';
                    }
                    a=String.valueOf(chars); 
                    System.out.println( sum_found);
                } 
            }        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    } 
}      


