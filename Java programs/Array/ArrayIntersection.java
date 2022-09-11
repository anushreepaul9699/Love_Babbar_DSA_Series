package Array;

import java.util.ArrayList;

public class ArrayIntersection
{
    static void findintersection(ArrayList<Integer>arrayList1 , int n ,ArrayList<Integer>arrayList2 , int m)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        int i = 0 , j = 0 ;
        while (i < n && j < m )
        {
            if(arrayList1.get(i) == arrayList2.get(j))
            {
                ans.add(arrayList1.get(i)) ;
                i++ ;
                j++ ;
            }

            else if (arrayList1.get(i) < arrayList2.get(j))
            {
                i++ ;
            }

            else
            {
                j++ ;
            }
        }

        System.out.print("The intersection of two arraylists are : "+" ");
        for (int k : ans)
        {
            System.out.print(k +" ");
        }
    }

    public static void main (String[] args)
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>() ;

        arrayList1.add(1) ;
        arrayList1.add(2) ;
        arrayList1.add(3) ;
        arrayList1.add(4) ;

        int n = arrayList1.size() ;

        ArrayList<Integer> arrayList2 = new ArrayList<>() ;

        arrayList2.add(1) ;
        arrayList2.add(4) ;

        int m = arrayList2.size();

       findintersection(arrayList1,n,arrayList2,m) ;
    }
}
