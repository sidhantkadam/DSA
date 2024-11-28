package LinkedList;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class LinkedListDSA
{
    public static void deleteNode(Node head, int pos)
    {
        if(pos==0)
        {
            head= head.next;
        }

        Node prev = head;
        for(int i=0;i<pos-1;i++)
        {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }


    public static boolean searchLinkedList(Node head, int target)
    {
        while(head!=null)
        {
            if(head.data==target)
            {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static Node insertAtBeginning(Node head, int value)
    {
        //created new node with given value
        Node newNode = new Node(value);

        //Point newNode as head
        newNode.next=head;

        //move the head to pint to new node
        head = newNode;

        //return the newNode to the linked list
        return head;
    }

    public static void printList(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node reverseLinkedList(Node head)
    {
        Node cur  = head;
        Node prev = null;
        while(cur!=null)
        {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args)
    {

        //Creating the new nodes in linked list format
        Node head = new Node(2);
        head.next= new Node(3);
        head.next.next= new Node(4);
        head.next.next.next= new Node(6);

        int data = 1;
        head = insertAtBeginning(head, data);
        printList(head);

        System.out.println(searchLinkedList(head, 5));
//        deleteNode(head, 2);

        System.out.println("Reverse : ");
        printList(reverseLinkedList(head));
    }
}
