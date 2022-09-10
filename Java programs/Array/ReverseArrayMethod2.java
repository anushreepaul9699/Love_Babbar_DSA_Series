package Array;

import java.util.Scanner;

public class ReverseArrayMethod2
{
    static void reverse (int[] arr , int n)
    {
        int start = 0 ;
        int end = n - 1 ;

        int temp = 0 ;

        while (start <= end)
        {
            temp = arr[start] ;
            arr[start] = arr[end] ;
            arr[end] = temp ;

            start++ ;
            end-- ;
        }


    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int n = 5 ;
        int[] arr = new int[n] ;

        System.out.println("Enter the array elements : ");

        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        reverse(arr,n);

        System.out.println("The reverse array is : ");

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
