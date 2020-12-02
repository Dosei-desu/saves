package linkedlist;

public class IntLinkedList implements IntList
{
    private Node head;

    public IntLinkedList()
    {
        this.head = null;
    }

    @Override
    public void append(int data)
    {
        if(head == null)
        {
            head = new Node(data);
            return;
        }
        Node cur = head;
        while(cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = new Node(data);
    }

    @Override
    public void prepend(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public boolean delete(int data)
    {
        if(head == null)
        {
            return false;
        }
        Node cur = head;
        if(head.data == data)
        {
            head = head.next;
            return true;
        }
        while(cur.next != null)
        {
            if(cur.next.data == data)
            {
                cur.next = cur.next.next;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public int get(int index)
    {
        return get(head, index);
    }

    private int get(Node cur, int index)
    {
        if(cur == null) throw new IndexOutOfBoundsException();
        if(index == 0)
        {
             return cur.data;
        }
        return get(cur.next, index-1);
    }

    @Override
    public String toString()
    {
        StringBuffer res = new StringBuffer();
        Node cur = head;
        while(cur != null)
        {
            res.append(cur.data).append(" ");
            cur = cur.next;
        }
        return res.toString();
    }

    private static class Node
    {
        private final int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
}
