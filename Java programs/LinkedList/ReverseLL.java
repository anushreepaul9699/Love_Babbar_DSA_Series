package LinkedList;

class RLL
{
   Node head  ;
    class Node
    {
        int item;
        Node next;

        Node(int item) {
            this.item = item;
            this.next = null;

        }

    }

        public void insert(int item)
        {
            if(head==null)
            {
                Node node = new Node (item);
                head = node ;
                return;
            }

            Node temp = head ;

            while (temp.next!=null)
            {
                temp = temp.next ;
            }

            Node node = new Node(item) ;

            temp.next = node ;

            node.next = null ;


        }

        public void NormalTraverse()

        {
            if(head==null)
            {
                System.out.print("List is empty !!");
                return ;
            }

            Node temp = head ;

            while (temp !=null)
            {
                System.out.print(temp.item +" ");
                temp = temp.next ;
            }


        }

        public Node reverse()
        {
            if(head==null || head.next==null)
            {
                return head ;
            }

            Node curr = head ;
            Node prev = null ;

            while(curr!=null)
            {
                Node forward = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr = forward ;
            }

           head = prev ;

            while (head!=null)
            {
                System.out.print(head.item+" ");
                head = head.next ;
            }

            return head ;

        }






}

public class ReverseLL
{
    public static void main (String[] args)
    {
        RLL list = new RLL() ;
        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.insert(13);
        list.insert(14);
        System.out.print("The initial linked list : ");
        list.NormalTraverse();
        System.out.println();
        System.out.print("The reverse linked list is : ");
        list.reverse();


    }
}
