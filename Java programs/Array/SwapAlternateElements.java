package Array;

public class SwapAlternateElements
{
    public static void main (String[] args)
    {
        int[] arr = {1,2,4,5,6,7,65,98} ;
        int n = arr.length ;

        int temp = 0 ;

        //Swapping alternate elements
        for (int i = 0 ; i < n - 1 ; i = i + 2)
        {
            temp = arr[i] ;
            arr[i] = arr[i+1] ;
            arr[i+1] = temp ;
        }

        //printing array

        System.out.println("The Final Array is : ");

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
