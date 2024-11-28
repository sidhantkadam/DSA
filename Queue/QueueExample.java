package Queue;

public class QueueExample
{
    Node first;
    Node last;
    int length;

    class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }
    }

    public QueueExample(int value)
    {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length=1;
    }

    public void printQueue()
    {
        Node temp = first;
        while(temp !=null)
        {
            System.out.print(" " + temp.value);
            temp= temp.next;
        }
        System.out.println();
    }

    public int getFirst()
    {
        return first.value;
    }

    public int getLast()
    {
        return last.value;
    }

    public void enqueue(int value)
    {
        Node newNode = new Node(value);
        if(length == 0)
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue()
    {
        Node temp = first;
        if(length==0)
        {
            return null;
        } else if (length==1)
        {
            first=null;
            last = null;
        }
        else
        {
            first = first.next;
            temp.next= null;
        }
        length--;
        return temp;
        }

    public static void main(String[] args)
    {
        QueueExample queue = new QueueExample(4);
        queue.enqueue(6);
        queue.enqueue(8);
        System.out.println(queue.dequeue());
        queue.printQueue();

        System.out.println("First : " + queue.getFirst());
        System.out.println("Last : " + queue.getLast());
    }
}
