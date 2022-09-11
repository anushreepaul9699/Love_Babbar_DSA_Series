package Array;

public class ReturnUnique
{
    static int returnunique (int[] arr , int n)
    {
        int ans = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            ans = ans ^ arr[i] ;
        }

        return ans ;
    }

    public static void main (String [] args)
    {
        int[] arr = {7,2,3,6,3,2,7};
        int n = arr.length;

        System.out.println("Unique element is : " +" "+returnunique(arr,n));
    }

}
