package Tree;

public class Main
{
    public static void main(String[] args)
    {
        TreeDSA tree = new TreeDSA();
//        System.out.println("Root : " + tree.root);
        tree.insert(47);
        tree.insert(21);
        tree.insert(76);
        tree.insert(18);
        tree.insert(52);
        tree.insert(82);

        tree.insert(27);

        System.out.println(tree.root.left.right.value);
        System.out.println(tree.contains(27));
    }
}
