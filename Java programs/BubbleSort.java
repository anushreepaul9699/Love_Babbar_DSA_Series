public class BubbleSort
{
    public static void sorting (int[] arr ,int n)
    {
        int temp = 0 ;

        boolean swaped = false ;

        for (int i = 1 ; i < n    ; i++)
        {
            for (int j = 0 ; j < n - i  ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //swapping

                    temp = arr[j] ;

                    arr[j] = arr[j+1] ;

                    arr[j+1] = temp ;

                    swaped = true ;
                }
            }

            if(swaped==false)
                break;


        }

        for (int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public  static void main (String[] args)
    {
        int[] arr = {10,1,7,6,14,9} ;

        int n = arr.length ;

        sorting(arr,n) ;

    }
}
