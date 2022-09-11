package Array;

public class findDuplicates
{
    static int duplicatenumber (int[] arr , int n)
    {
        int ans = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            ans = ans ^ arr[i] ;
        }

        for (int i = 1 ; i < n  ; i++)
        {
            ans = ans ^ i ;
        }

        return ans ;

    }

    public static void main (String[] args)
    {
        int n = 5 ;
        int[] arr = {1,2,3,4,4} ;

        duplicatenumber(arr,n) ;

        System.out.println("The duplicate number is :"+" "+duplicatenumber(arr,n));
    }
}
