public class QuickSort
{
    public static void quick_sort(int[] arr,int s,int e)
    {
       if (s >= e )
       {
           return ;
       }

       int p = partition(arr , s , e) ;

       quick_sort(arr,s,p-1);
       quick_sort(arr,p+1 , e);

    }

    public static int partition(int[] arr,int s,int e )

    {

        int pivot = arr[s] ;

        int count = 0 ;

        for (int i = s + 1 ; i <= e ; i++)
        {
            //when duplicates elements are allowed 
            if(arr[i] <= pivot)
                count++ ;
        }

        int pivotIndex = s + count ;

        int temp = pivot ;

        arr[s] = arr[pivotIndex] ;

        arr[pivotIndex] = temp ;

        int i = s ;

        int j = e ;

        while ( i < pivotIndex && j > pivotIndex)
        {
            while (arr[i] <= pivot)
            {
                i++;
            }

            while (arr[j] > pivot)
            {
                j-- ;
            }

            if( i < pivotIndex && j > pivotIndex)
            {
                temp = arr[i] ;

                arr[i] = arr[j] ;

                arr[j] = temp ;

                i++ ;

                j-- ;
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
