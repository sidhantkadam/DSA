package Tree;

class NodeOne
{
    int value;
    NodeOne left;
    NodeOne right;

    public NodeOne(int value)
    {
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class MaxHeight
{
    public int maxHeight(NodeOne root)
    {
        if(root == null)
        {
            return -1;
        }
        int l = maxHeight(root.left);
        int r = maxHeight(root.right);
        return Math.max(l,r) + 1;
    }

    public static void main(String[] args)
    {
        NodeOne root = new NodeOne(1);
        root.left = new NodeOne(2);
        root.right = new NodeOne(3);
        root.left.left = new NodeOne(4);
        root.left.right = new NodeOne(5);

        MaxHeight max = new MaxHeight();
        System.out.println(max.maxHeight(root));
    }
}
