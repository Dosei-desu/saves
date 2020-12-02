package trees;

public interface IntBinaryTree
{
    void insert(int i);
    void inorder(IVisitor visitor);
    void preorder(IVisitor visitor);
    void postorder(IVisitor visitor);
    void breadthFirst(IVisitor printer);
}
