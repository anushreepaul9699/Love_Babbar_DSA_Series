package Sorting;

public class InsertionSort
{
    public static void sorting(int[] arr, int n)
    {
       for (int i = 1 ; i < n ; i++)
       {
           int temp = arr[i] ;

           int j = i - 1 ;

           for (; j>=0 ;j--)
           {
               if(arr[j] > temp)
               {
                   arr[j+1] = arr[j] ;
               }

               else
               {
                   break ;
               }
           }

           arr[j+1] = temp ;
       }

        for (int k = 0 ; k < n ; k++)
        {
            System.out.print(arr[k]+" ");
        }


    }

    public static void main (String[] args)
    {
        int[] arr = {10,1,7,4,8,2,11} ;

        int n = arr.length ;

        sorting(arr,n);

    }
}
