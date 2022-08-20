package LinkedList;

class DoubleLL
{
    Node head = null ;

    class Node
    {
        int item ;
        Node next ;
        Node prev ;

        Node(int item)
        {
            this.item = item ;
            this.prev = null ;
            this.next = null ;

        }

    }

    public void insertatFirst(int item)
    {
        if(head==null)
        {
            Node node = new Node(item) ;
            head =node ;
            return;
        }

        Node node = new Node(item) ;
        node.next = head ;
        head.prev = node ;
        head = node ;

    }

    public void insertLast(int item)
    {
        if(head==null)
        {
            return;
        }

        Node temp = head ;
        while (temp.next!=null)
        {
            temp = temp.next ;
        }

        Node node = new Node(item) ;
        temp.next = node ;
        node.prev = temp ;

    }

    public void anywhere_insert(int item , int pos)

    {
        if(head==null)
        {
            Node node = new Node(item) ;
            head = node ;
            return;
        }

        while(pos > 0)
        {

            if (pos==1)
            {
                Node node = new Node(item) ;
                node.next = head ;
                head.prev = node ;
                head = node ;
            }

            else
            {
                Node temp = head ;
                int cnt = 1 ;
                while(cnt < pos - 1)
                {
                    temp = temp.next ;
                    cnt++;
                }

                if (temp.next==null)
                {
                    Node node = new Node(item) ;
                    temp.next = node ;
                    node.prev = temp ;

                }

                else
                {
                    Node node = new Node(item) ;
                    node.next = temp.next ;
                    temp.next.prev = node ;
                    temp.next = node ;
                    node.prev = temp ;
                }
            }
        }


    }

    public void deleteFirst()
    {
        Node temp = head ;
        temp.next.prev = null ;
        head = temp.next ;
        temp.next = null ;

        System.gc();

    }

    public void  deleteLast()
    {
        if(head==null)
        {
            return;
        }

        if(head.next == null)
        {
            head = null ;
            return;
        }

        Node curr = head.next ;
        Node previous = head ;

        while (curr.next!=null)
        {
            curr = curr.next ;
            previous = previous.next ;
        }

        if(curr.next==null)
        {
            curr.prev = null ;
            previous.next = null ;
        }

        System.gc();


    }

    public void deleteAnyWhere(int item , int pos)
    {
        if(head == null)
        {
            return;
        }

        if(head.next==null)
        {
            head = null;
            return;
        }

        Node curr = head ;
        Node PREV = null ;

        int cnt = 1 ;

        while (cnt < pos)
        {
            PREV = curr ;
            curr = curr.next ;
            cnt++ ;
        }

        PREV.next = curr.next ;
        curr.next = null ;
        System.gc();



    }

    public void print ()
    {
        if(head==null)
        {
            return;
        }

        Node temp = head ;
        while (temp !=null)
        {
            System.out.print(temp.item +" ");
            temp = temp.next ;
        }

    }

}

public class DLLdeletion
{
    public static void main (String[] args)
    {
        DoubleLL ll = new DoubleLL() ;
        System.out.println("Initial Linked List :");
        ll.insertatFirst(10);
        ll.insertatFirst(9);
        ll.insertLast(11);
        ll.insertLast(12);
        ll.insertLast(13);
        ll.print();
        System.out.println();
        System.out.println("After deletion : ");
        ll.deleteAnyWhere(11,3);
        ll.print();




    }
}
