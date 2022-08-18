public class Selection_Sort
{
    public static void Sorting (int[] arr,int n)
    {
        for (int i = 0 ; i < arr.length - 1 ; i++)
        {
            int smallest =  i  ;

            for (int j = i+1 ; j < n ; j++)
            {
                if(arr[smallest]>arr[j])
                {
                   smallest = j ;
                }
            }

            int temp = arr[i] ;

            arr[i] = arr[smallest] ;

            arr[smallest] = temp ;

        }

        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main (String[] args)
    {
        int[] arr = {64,25,12,22,11} ;

        int n = arr.length ;

        Sorting(arr,n);
    }
}
