import java.util.LinkedList;

class LL
{
    Node head ;

    class Node
    {
        int data ;
        Node next ;

        Node(int data)
        {
            this.data = data ;
            this.next = null ;
        }

    }

    public void insertFirst(int data)
    {
       //creation of newNode
        Node newNode = new Node(data);

       //If head is null
        if(head==null)
        {
            //make newNode as head
            head = newNode ;

            return ;
        }

        else
        {
            //point newNode.next = head
            //and then make newNode as head
            newNode.next = head ;
            head = newNode ;
        }
    }

    public void InsertLast(int data)
    {
        Node newNode = new Node(data) ;

        if(head==null)
        {
            head = newNode;

            return ;
        }

       Node last = head ;

            while(last.next != null)
            {
                last = last.next ;
            }

            last.next = newNode ;

        }


    public void display()
    {

        Node curr = head ;

        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next ;
        }

    }


}

public class Linked_List
{
    public static void main (String[] args)
    {
        LL list = new LL();

        list.insertFirst(10);
        list.insertFirst(9);

        list.InsertLast(11);

        list.display();


    }
}