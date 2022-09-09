package Array;

import java.util.Scanner;

public class MinElement
{
    static int getMin (int[] arr , int n)
    {
        int mini = Integer.MAX_VALUE ;

        /*for (int i = 0 ; i < n ; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i] ;
            }
        }*/

        for (int i = 0 ; i < n ; i++)
        {
            mini = Integer.min(mini,arr[i]) ;
        }

        return mini ;
    }

    public static void main (String[] args)
    {
        int n = 6 ;
        int[] arr = new int[n] ;

        Scanner sc = new Scanner(System.in) ;

        //taking input
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        //function to get the min. element
        getMin(arr,n) ;

        System.out.println("The min element is : "+getMin(arr,n));
    }
}
