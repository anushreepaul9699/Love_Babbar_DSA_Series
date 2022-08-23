package LinkedList;

class  Checking
{
    Node head ;
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

    public void insert(int item , int element)
    {
        if(head == null)
        {
            Node node = new Node(item);
            head = node;
            node.next = head;

        }

        else
        {
            Node temp = head;

            while (temp.item != element)
            {
                temp = temp.next;
            }

            Node newNode = new Node(item) ;
            newNode.next = temp.next;
            temp.next = newNode ;

        }

    }


    public void print()
    {

        if(head==null)
        {
            System.out.print("List is empty !");
            return;
        }

        Node temp = head ;

        do {

            System.out.print(head.item + " ");
            head = head.next ;
        }while(head != temp) ;

    }

    public boolean isBoolean (Node head)
    {
        if(head == null)
        {
            return  true ;
        }

        Node temp = head.next ;
        while (temp !=null && temp.next != head)
        {
            temp = temp.next ;
        }

        if(temp.next == head)
        {
            return  true ;

        }

        return false ;

    }


}

public class CircularLyLinked
{
    public static void main (String[] args)
    {
        Checking cl = new Checking() ;
        cl.insert(3,0);
        cl.insert(4,3);
        cl.insert(5,4);
        cl.insert(6,5);
        cl.print();
        System.out.println();
        System.out.println(cl.isBoolean(cl.head));


    }
}
