package LinkedList;

class CircularLL
{
    Node tail = null ;

    class Node
    {
        int item ;
        Node next ;
        Node(int item)
        {
            this.item = item ;
            this. next = null ;

        }

    }

    public void insert(int item,int element)
    {
        if (tail==null)
        {
            Node node = new Node(item) ;
            tail = node ;
            node.next = node;
        }

        else
        {
            Node temp = tail ;
            while (temp.item!=element)
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
        if (tail==null)
        {
            System.out.print("List is empty !!");
            return;
        }

        Node temp = tail ;

        do
        {

            System.out.print(tail.item +" ");
            tail = tail.next;

        }while (tail != temp);



    }

    public void delete(int value)

    {
        if(tail==null)
        {
            System.out.print("List is empty !!");
            return;
        }

        Node prev = tail.next ;
        Node cur = prev.next ;

        while (cur.item !=value)
        {
            prev = cur ;
            cur = cur.next ;
        }

        prev.next = cur.next ;
        cur.next = null ;

    }

}

public class CircularLinkedList
{
    public static void main (String[] args)
    {
        CircularLL cl = new CircularLL() ;

        cl.insert(3,3);
        cl.insert(4,3);
        cl.insert(5,4);
        cl.delete(4);

        cl.print();

    }
}
