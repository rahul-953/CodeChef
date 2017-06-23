/*
Input

    First line of the input contains T denoting number of test cases.
    For each test case, first line contains N denoting the number of one dimensional kingdoms.
    For each next N lines, each line contains two space separated integers ai and bi.


*/

import java.util.*;

class ONEKING
{
    static int array[][];

    public static void main(String arg[])
    {
        int t,n,ii,bomb=01;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();

        while((t--)>0)
        {
            bomb=01;
            n=sc.nextInt();
            array = new int [n][2];   

            for(ii=0;ii<n;ii++)                
            {
                array[ii][0]=sc.nextInt();
                array[ii][1]=sc.nextInt();
            }

            quickSort(0,n-1);

           // for(ii=0;ii<n;ii++)
             //System.out.println(array[ii][0]+" ")   ;

            int right=array[0][1];

            for(ii=01;ii<n;ii++)
            {
                if(array[ii][0]<=right)
                right=right>array[ii][1]?array[ii][1]:right;

                else
                {
                   bomb++;     
                   //left=array[ii][0];
                   right=array[ii][1];
                }
            }

            System.out.println(bomb);
        }    
    }

    static  void quickSort(int lowerIndex, int higherIndex) 
    {   
        int i = lowerIndex;
        int j = higherIndex,temp[][]=new int[1][2];

        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2][0];

        // Divide into two arrays
        while (i <= j) 
        {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i][0] < pivot) 
            i++;
            
            while (array[j][0] > pivot) 
            j--;
            
            if (i <= j) 
            {
                temp[0][0]=array[i][0];
                temp[0][1]=array[i][1];

                array[i][0]=array[j][0];
                array[i][1]=array[j][1];

                array[j][0]=temp[0][0];
                array[j][1]=temp[0][1];

                //i=j;
                //j=temp;

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
