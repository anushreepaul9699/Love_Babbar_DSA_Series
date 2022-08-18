package Sorting;

public class MergeSort
{
    public static void sorting_divide(int[] arr , int s , int e)
    {

        if(s>=e)
        {
            return;
        }

        int mid = s + (e-s) / 2 ;

        sorting_divide(arr ,s , mid);
        sorting_divide(arr,mid+1,e);

        sorting_conquer(arr,s,mid,e);


    }

    public static void sorting_conquer(int[] arr , int s , int mid , int e)
    {

        int idx1 = s ;

        int idx2 = mid+1 ;

        int x = 0 ;

        int[] merged = new int[e-s+1] ;

        while (idx1 <= mid && idx2<=e)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++] ;
            }

            else
            {
                merged[x++] = arr[idx2++] ;
            }
        }

        while (idx1<=mid)
        {
            merged[x++] = arr[idx1++] ;
        }

        while (idx2<=e)
        {
            merged[x++] = arr[idx2++] ;
        }

        for (int i = 0 , j = s ; i < merged.length ; i++,j++)
        {
            arr[j] = merged[i] ;
        }

    }

    public static void main (String[] args)
    {
        int[] arr = {10,1,7,4,8,2,11} ;

        int s = 0 ;

        int e = (arr.length) - 1 ;

        sorting_divide(arr,s,e);

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }
}
