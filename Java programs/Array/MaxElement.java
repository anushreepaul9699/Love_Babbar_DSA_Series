package Array;

import java.util.Scanner;

public class MaxElement
{
    static  int getMax (int[] arr , int n)
    {
        int max = Integer.MIN_VALUE ;

        for (int i = 0 ; i < n ; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i] ;
            }
        }

        return max ;
    }

    public static void main (String[] args)
    {
        int n = 5 ;
        int[] arr = new int[n] ;

        Scanner sc = new Scanner(System.in) ;

        //taking input

        for (int i = 0 ; i < n ;i++)
        {
            arr[i] = sc.nextInt() ;
        }

        //function to get maximum value
        getMax(arr,n) ;

        System.out.println("The maximum element is : "+getMax(arr,n));
    }
}
