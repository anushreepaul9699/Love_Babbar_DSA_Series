package Array;

import java.util.Scanner;

public class LinearSearch
{
    static  boolean searchingElement(int[] arr,int n , int x)
    {
        for (int i = 0 ; i < n ; i++)
        {
            if(arr[i] == x)
            {
                return true ;
            }
        }

        return false ;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        int[] arr = new int[10] ;
        int x = 90 ;
        int n = 6 ;

        for (int i = 0 ; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        searchingElement(arr,n,x) ;

        System.out.println("The element was found or not ? "+searchingElement(arr,n,x));


    }
}
