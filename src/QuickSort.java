public class QuickSort
{
    public static void quick_sort(int[] arr,int s,int e)
    {

        if(s>=e)
        {
            return;
        }

        int p = partition(arr , s , e);

        quick_sort(arr , s ,p -1 );
        quick_sort(arr, p+1 , e);

    }

    public static int partition(int[] arr,int s,int e )

    {
        int pivot = arr[s] ;

        int count = 0 ;

        for (int i = s + 1 ; i <=e ; i++)
        {
            if(arr[i] < pivot)
                count++ ;
        }

        int pivotIndex = s + count ;

        int temp = pivot ;

        arr[s] = arr[pivotIndex] ;

        arr[pivotIndex] = temp ;

        int sIdx = s ;

        int eIdx = e ;

        while (sIdx < pivotIndex && eIdx > pivotIndex)
        {
            while (arr[sIdx] <= pivot)
            {
                sIdx++;
            }

            while (arr[eIdx] > pivot)
            {
                eIdx-- ;
            }

            if( sIdx < pivotIndex && eIdx > pivotIndex)
            {
                temp = arr[sIdx] ;

                arr[sIdx] = arr[eIdx] ;

                arr[eIdx] = temp ;

                sIdx++;

                eIdx-- ;
            }
        }

        return pivotIndex ;

    }
    public static void main (String[] args)
    {
        int[] arr =  {2,4,1,6,9} ;

        int n = 5 ;

        quick_sort(arr,0,n-1) ;

        for (int i = 0 ; i < n  ; i++)
        {
            System.out.print(arr[i] +" ");
        }


    }
}
