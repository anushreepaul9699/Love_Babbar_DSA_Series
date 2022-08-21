package LinkedList;

class SingleCircularLL
{
    Node head ;
    Node tail  ;

    class Node
    {
        int item ;
        Node next ;

        Node(int item)
        {
            this.item = item ;
            this.next = null ;

        }

    }

    public void InsertFirst(int item)
    {
        if(head==null)
        {
            Node node = new Node(item) ;
            head = node ;
            node.next = head ;
        }

        Node temp = head ;

        while(temp.next !=head)
        {
            temp = temp.next ;
        }

        Node node = new Node(item) ;

        if(temp.next==head)
        {
            node.next = head ;
            temp.next = node ;
            head = node ;
        }
    }

}

public class Single_Circular_LL
{
    public static void main (String[] args)
    {


    }
}
