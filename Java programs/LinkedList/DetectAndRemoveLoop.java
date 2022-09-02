

class DetectRemoveLoop

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

    public void insertNode (int item)
    {
        Node node = new Node(item) ;

        if(head == null)
        {
            head = node ;
            return ;
        }

        Node temp = head ;

        while (temp.next != null)
        {
            temp = temp.next ;
        }

        temp.next = node ;
    }

    public Node detectloop(Node head)
    {
        if(head == null)
        {
            return null ;
        }
        Node fast = head ;
        Node slow = head ;

       while (slow != null && fast != null)
       {
           fast = fast.next ;

           if(fast != null)
           {
               fast = fast.next ;

           }

           slow = slow.next ;

           if(fast == slow)
           {
               return slow ;
           }
       }

      return null ;
    }

    public Node getStartingNode (Node head)
    {
        if(head == null)
        {
            return null ;
        }

        Node intersection = detectloop(head) ;

        Node slow = head ;

        while (slow != intersection)
        {
            slow = slow.next ;
            intersection = intersection.next ;
        }

        return slow ;
    }

    public void removeLoop (Node head)
    {
        if(head == null)
        {
            return ;
        }

        Node startNode= getStartingNode(head) ;

        Node temp = startNode ;

        while (temp.next != startNode)
        {
            temp = temp.next ;
        }

        temp.next = null ;


    }
}


