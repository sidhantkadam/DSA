package Stack;

class Node
{
    int value;
    Node next;

    public Node(int value)
    {
        this.value = value;
    }
}

public class StackExample
{
    Node top;
    int height;

    public StackExample(int value)
    {
        Node node = new Node(value);
        this.top=node;
        height=1;
    }

    public void push(int value)
    {
        Node newNode = new Node(value);
        if(height == 0)
        {
            top = newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        height++;
    }

    public void printStack()
    {
        Node temp=top;
        while(temp != null)
        {
            System.out.print(" " + temp.value);
            temp = temp.next;
        }
    }

    public static void main(String[] args)
    {
        StackExample stackExample = new StackExample(4);
        stackExample.push(45);
        stackExample.push(67);
        stackExample.printStack();
    }
}
