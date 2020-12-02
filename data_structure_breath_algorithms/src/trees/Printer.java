package trees;

public class Printer implements IVisitor
{
    public Printer()
    {
    }

    @Override
    public void visit(TreeNode n)
    {
        System.out.println(n.getData());
    }
}
