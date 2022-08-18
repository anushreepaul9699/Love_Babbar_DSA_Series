package LinkedList;

import java.util.List;

class LL

{
    Node head ;

    class Node
    {
        int item ;
        Node next;

        Node(int item)
        {
            this.item = item;
            this.next = null;
        }

    }

    public void InsertFirst(int item)
    {
        Node newNode = new Node(item);
        if(head == null)
        {
            head = newNode ;
            return ;

        }

        newNode.next = head ;

        head = newNode ;


    }

    public void InsertLast(int item)
    {
        Node node = new Node(item) ;

        if(head==null)
        {
            head = node ;
            return ;
        }

        Node Last = head ;

        while(Last.next!=null)
        {
            Last = Last.next ;
        }

        Last.next = node ;

    }

    public void print()
    {
        if (head==null)
        {
            System.out.print("List is Empty");
            return ;
        }

        Node curr = head ;

        while(curr!=null)
        {
            System.out.print(curr.item+" ");
            curr = curr.next ;
        }

        System.out.print("null");

    }

    public void deleteFirst(int item)
    {
        if(head==null)
        {
            System.out.print("List is empty");
            return ;
        }

        Node temp = head ;

        head = temp.next ;


    }

    public void deleteLast(int item)
    {
        if(head==null)
        {
            System.out.print("List is Empty !!");
            return ;
        }

        if(head.next==null)
        {
            head = null ;

            return;
        }

        Node curr = head ;

        Node LastNode = head.next ;

        while(LastNode.next!=null)
        {
            LastNode = LastNode.next ;
            curr = curr.next ;
        }

        curr.next = null ;


    }



}

public class SingleLinkedList
{
    public static void main (String[] args)
    {
        LL list = new LL () ;

        list.InsertFirst(10);
        list.InsertFirst(9);
        list.InsertLast(11);
        list.deleteFirst(9);
        list.deleteLast(11);
        list.print();

    }

}
