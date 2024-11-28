package LinkedList;

class CirNode
{
    int value;
    CirNode next;

    public CirNode(int value)
    {
        this.value= value;
        this.next=null;
    }

    public void printList(CirNode head)
    {
        CirNode temp = head.next;
        while(true)
        {
            System.out.println(" " + temp.value);
            temp = temp.next;
            if(temp == head.next)
                break;
        }
    }
}

public class CircularLinkedList
{
    public static void main(String[] args)
    {
        CirNode first = new CirNode(6);
        CirNode second = new CirNode(7);
        CirNode last = new CirNode(8);

        first.next = second;
        second.next= last;
        last.next = first;

        last.printList(last);
    }
}
