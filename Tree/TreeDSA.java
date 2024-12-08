package Tree;

public class TreeDSA
{
    Node root;
    class Node
    {
        int value;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value = value;
            this.left = this.right = null;
        }
    }

    public boolean insert(int value)
    {
        //created new node
        Node newNode = new Node(value);
        if(root == null)                            //checking tree is empty and assign new node to root
        {
            root = newNode;
            return true;
        }
        Node temp = root;                           //assign temp to root
        while(true)
        {
            if(newNode.value== temp.value)          //checking the temp and new node value
                return false;
            if(newNode.value < temp.value)          //checking the value is less than assign to left
            {
                if(temp.left==null)                 //left is null then assign new node to that node
                {
                    temp.left=newNode;
                    return true;
                }
                temp = temp.left;                   //otherwise increment temp to next left
            }
            else
            {
                if(temp.right==null)
                {
                    temp.right=newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value)
    {
        Node temp = root;
        while(temp!=null)
        {
            if(value<temp.value)              // checking the value is less that temp value
            {
                temp = temp.left;             // assign temp.value to temp
            }
            else if(value> temp.value)        // checking the value is greater than temp value
            {
                temp = temp.right;            // make temp as temp.right
            }
            else
            {
                return true;                  // otherwise returns true means value is found
            }
        }
        return false;
    }
}
