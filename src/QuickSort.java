public class QuickSort
{
    public static void quick_sort(int[] arr,int s,int e)
    {
        //base case

        if(s>=e)
        {
            return ;
        }

        //main operations

        int p = partition(arr,s,e) ;

        quick_sort(arr,s,p-1);

        quick_sort(arr,p+1,e);

    }

    public static int partition(int[] arr,int s,int e )

    {

     int pivot = arr[s] ;

     int cnt = 0 ;

     for (int i = s + 1 ; i<=e ; i++)
     {
         if(arr[i] <= pivot)

             cnt++;

     }

     int pivotIndex = s + cnt ;

     int temp = pivot ;

    arr[s] = arr[pivotIndex] ;

    arr[pivotIndex] = temp ;

     int i = s , j = e ;

     while (i < pivotIndex && j > pivotIndex)
     {
         while (arr[i] <= pivot)
         {
            i++ ;
         }

         while (arr[j] > pivot)
         {
             j-- ;
         }

         if(i < pivotIndex && j > pivotIndex)
         {
             int tempo = arr[i] ;

             arr[i] = arr[j] ;

             arr[j] = tempo;

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
