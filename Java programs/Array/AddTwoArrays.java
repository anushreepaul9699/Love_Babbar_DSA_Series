package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddTwoArrays
{


    static Object[] addtwoarrays (int[] a , int n , int[]b , int m)
    {
        ArrayList<Integer> result = new ArrayList<>() ;

        int carry = 0 ;
        int first = n - 1 ;
        int second = m - 1 ;

        while (first >= 0 && second >= 0)
        {
            int sum = carry + a[first] + b[second] ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            result.add(sum) ;
            first -- ;
            second -- ;

        }

        while (first >= 0)
        {
            int sum = carry + a[first] ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            result.add(sum) ;
            first -- ;
        }

        while (second >= 0 )
        {
            int sum = carry + b[second] ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            result.add(sum) ;
            second -- ;
        }

        while (carry != 0 )
        {
            int sum = carry ;
            carry = sum / 10 ;
            sum = sum % 10 ;
            result.add(sum) ;

        }

        Collections.reverse(result);

        System.out.println("The addition of two arrays is : "+" ");

       return result.toArray() ;

    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print ("Enter the size of first array : "+" ") ;
        int n = scanner.nextInt() ;
        int[] a = new int[n] ;

        for (int i = 0 ; i < n ; i++)
        {
            a[i] = scanner.nextInt() ;
        }

        System.out.print ("Enter the size of second array : "+" ") ;
        int m = scanner.nextInt();
        int[] b = new int[m] ;

        for (int j = 0 ; j < m ; j++)
        {
            b[j] = scanner.nextInt();
        }

        System.out.println(addtwoarrays(a,n,b,m)) ;
    }
}
