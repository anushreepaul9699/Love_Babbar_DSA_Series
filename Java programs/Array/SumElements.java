package Array;

import java.util.Scanner;

public class SumElements
{
    static int getSum (int[] arr , int n)
    {
        int sum = 0 ;

        for (int i = 0 ; i < n ; i++)
        {
            sum = sum + arr [i] ;
        }

        return  sum ;
    }

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int n = 5 ;

        int[] arr = new int[n] ;

        //taking input
        for (int i = 0 ; i<n ;i++)
        {
            arr[i] = sc.nextInt() ;
        }

        //function tp get the sum
        getSum(arr,n) ;

        System.out.println("The sum is : "+getSum(arr,n));
    }
}
