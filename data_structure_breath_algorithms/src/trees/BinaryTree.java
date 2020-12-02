package trees;

import stackandqueue.IQueue;
import stackandqueue.QueueImpl;

public class BinaryTree implements IntBinaryTree
{
    private TreeNode root;

    public BinaryTree()
    {
        root = null;
    }

    @Override
    public void insert(int data)
    {
        if(root == null)
        {
            root = new TreeNode(null, null, data);
        }
        else
        {
            insert(root, data);
        }
    }

    private void insert(TreeNode n, int data)
    {
        if(data == n.getData())
        {
            //If we already have this data, do nothing.
            return;
        }
        if(data < n.getData())
        {
            TreeNode left = n.getLeftChild();
            if(left == null)
            {
                n.setLeftChild(new TreeNode(null, null, data));
            }
            else
            {
                insert(left, data);
            }
        }
        else
        {
            // data > n.getData()
            TreeNode right = n.getRightChild();
            if(right == null)
            {
                n.setRightChild(new TreeNode(null, null, data));
            }
            else
            {
                insert(right, data);
            }
        }
    }

    @Override
    public void inorder(IVisitor visitor)
    {
        inorder(root, visitor);
    }

    private void inorder(TreeNode n, IVisitor visitor)
    {
        if(n == null)
        {
            return;
        }
        inorder(n.getLeftChild(), visitor);
        visitor.visit(n);
        inorder(n.getRightChild(), visitor);
    }

    @Override
    public void preorder(IVisitor visitor)
    {
        preorder(root, visitor);
    }

    private void preorder(TreeNode n, IVisitor visitor)
    {
        if(n == null)
        {
            return;
        }
        visitor.visit(n);
        preorder(n.getLeftChild(), visitor);
        preorder(n.getRightChild(), visitor);
    }

    @Override
    public void postorder(IVisitor visitor)
    {
        postorder(root, visitor);
    }

    @Override
    public void breadthFirst(IVisitor visitor)
    {
        if(root == null) return;
        IQueue<TreeNode> queue = new QueueImpl<>();
        queue.enqueue(root);
        while(!queue.isEmpty())
        {
            TreeNode n = queue.dequeue();
            visitor.visit(n);
            if(n.getLeftChild() != null)
            {
                queue.enqueue(n.getLeftChild());
            }
            if(n.getRightChild() != null)
            {
                queue.enqueue(n.getRightChild());
            }
        }
    }

    private void postorder(TreeNode n, IVisitor visitor)
    {
        if(n == null)
        {
            return;
        }
        postorder(n.getLeftChild(), visitor);
        postorder(n.getRightChild(), visitor);
        visitor.visit(n);
    }
}
