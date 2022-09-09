package Array;

import java.util.Scanner;

public class ReverseArray
{
    static void reverse(int[] arr , int n)
    {
        System.out.println();
        System.out.println("The reverse array is : ");
        for (int i = n-1 ; i>=0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int n = 5 ;
        int[] arr = new int[n] ;

        //taking input
        System.out.println("Enter the array elements : ");
        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        //printing the initial array
        System.out.println("The initial array is : ");
        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i] +" ");
        }

        //function to reverse the array
        reverse(arr,n);

    }
}
