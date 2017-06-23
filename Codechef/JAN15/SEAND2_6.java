/*
Input

    First line contain a single integer T denoting number of test cases. Then T tests follow.
    First line of each test case contains an integer A.
    Next line contains an integer N.
    Next line contains N integers B[1], B[2], ..., B[N].

*/

import java.util.*;

class SEAND2_6
{
    static String A;

    public static void main(String arg[])
    {
        int t,n,i,b,key=0,j;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        

        while((t--)>0)
        {
            key=0;
            A=sc.next();
            n=sc.nextInt();

            for(i=0;i<n;i++)                
            b=sc.nextInt();

            j=A.length();

            for(i=0;i<j;i++)
            {
                if((A.charAt(i)-'0')%2==1 )
                {
                    do
                    {
                        j--;
                    }while((A.charAt(j)-'0')%2==1 && i<j);

                    char temp;    
                    char[] myNameChar = A.toCharArray();                      
                    temp =A.charAt(i);
                    myNameChar[i]=A.charAt(j);
                    myNameChar[j]=temp;
                    A = String.valueOf(myNameChar);     
                }
            }

            for(i=0;i<A.length();i++)
            {
                if((A.charAt(i)-'0')%2==1 )
                key++;
            }

            //System.out.println("Array after requiring type is: "+A);    
            quickSort(0,key-1);
            //System.out.println(A)   ;
            quickSort(key,A.length()-1);

            for(i=0;i<key;i++)
            System.out.print(A.charAt(i))   ;

            

            for(i=A.length()-1;i>=key;i--)
            System.out.print(A.charAt(i))   ;

            System.out.println()   ;        
        }
    }    
    

    static  void quickSort(int lowerIndex, int higherIndex) 
    {   
        int i = lowerIndex;
        int j = higherIndex;

        // calculate pivot number, I am taking pivot as middle index number
        char pivot = A.charAt(lowerIndex+(higherIndex-lowerIndex)/2) ;
        char temp;

        // Divide into two arrays
        while (i <= j) 
        {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (A.charAt(i) < pivot) 
            i++;
            
            while (A.charAt(j) > pivot) 
            j--;
            
            if (i <= j) 
            {


                char[] myNameChars = A.toCharArray();             
                
                temp =A.charAt(i);
                myNameChars[i]=A.charAt(j);
                myNameChars[j]=temp;
                A = String.valueOf(myNameChars);     

                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
        quickSort(lowerIndex, j);

        if (i < higherIndex)
        quickSort(i, higherIndex);
    }


    static  void quickSortDescend(int lowerIndex, int higherIndex) 
    {   
        int i = lowerIndex;
        int j = higherIndex;

        // calculate pivot number, I am taking pivot as middle index number
        char pivot = A.charAt(lowerIndex+(higherIndex-lowerIndex)/2) ;
        char temp;

        // Divide into two arrays
        while (i <= j) 
        {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (A.charAt(i) > pivot) 
            i++;
            
            while (A.charAt(j) < pivot) 
            j--;
            
            if (i <= j) 
            {


                char[] myNameChars = A.toCharArray();             
                
                temp =A.charAt(i);
                myNameChars[i]=A.charAt(j);
                myNameChars[j]=temp;
                A = String.valueOf(myNameChars);     

                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
        quickSort(lowerIndex, j);

        if (i < higherIndex)
        quickSort(i, higherIndex);
    }
}