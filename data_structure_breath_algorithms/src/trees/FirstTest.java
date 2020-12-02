package trees;

public class FirstTest
{
    public static void main(String[] args)
    {
        IntBinaryTree tree = new BinaryTree();
        //We make a balanced tree...
        tree.insert(4);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(5);
        tree.insert(7);

        IVisitor printer = new Printer();

        //Print inorder:
        System.out.println("Inorder: ");
        tree.inorder(printer);

        //Print preorder
        System.out.println("Preorder: ");
        tree.preorder(printer);

        //Print postorder
        System.out.println("Postorder: ");
        tree.postorder(printer);

        System.out.println("Breadth first: ");
        tree.breadthFirst(printer);
    }
}
