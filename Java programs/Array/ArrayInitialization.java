package Array;

import java.util.Scanner;

public class ArrayInitialization
{
    //main function of the program

    public  static  void main (String[] args)
    {
        int[] arr = new int [6] ;

        Scanner sc = new Scanner(System.in) ;

        //taking input from user using scanner class

        for (int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        //printing the array elements

        System.out.println("The array elements are : ") ;

        for (int j = 0 ; j < arr.length ; j++)
        {
            System.out.print(arr[j] +" ");
        }

        //accessing the index of the array

        System.out.println("The third element is :"+arr[2]);

    }
}
