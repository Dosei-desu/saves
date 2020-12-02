package doublelinkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<D> implements IDoubleLinkedList<D>
{
    private Node<D> first;
    private Node<D> last;
    private int size;

    public DoubleLinkedList()
    {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void insertFirst(D data)
    {
        ++size;
        if(first == null)
        {
            first = new Node(null, null, data);
            last = first;
            return;
        }
        Node newNode = new Node(null, first, data);
        first.setPrev(newNode);
        first = newNode;
    }

    @Override
    public void insertLast(D data)
    {
        ++size;
        if(last == null)
        {
            last = new Node(null, null, data);
            first = last;
            return;
        }
        Node newNode = new Node(last, null, data);
        last.setNext(newNode);
        last = newNode;
    }

    @Override
    public D takeFirst()
    {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        --size;
        D res = first.getData();
        first = first.getNext();

        if(first == null)
        {
            last = null;
        }
        else
        {
            first.setPrev(null);
        }
        return res;
    }

    @Override
    public D takeLast()
    {
        if(last == null)
        {
            throw new NoSuchElementException();
        }
        --size;
        D res = last.getData();
        last = last.getPrev();

        if(last == null)
        {
            first = null;
        }
        else
        {
            last.setNext(null);
        }
        return res;
    }

    @Override
    public D peekFirst()
    {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        return first.getData();
    }

    @Override
    public D peekLast()
    {
        if(last == null)
        {
            throw new NoSuchElementException();
        }
        return last.getData();
    }

    @Override
    public boolean isEmpty()
    {
        return (size == 0);
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public void clear()
    {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public Iterator<D> iterator()
    {
        return new IteratorImpl<>(first);
    }

    private static class IteratorImpl<D> implements Iterator<D>
    {
        private Node<D> next;

        public IteratorImpl(Node next)
        {
            this.next = next;
        }

        @Override
        public boolean hasNext()
        {
            return next != null;
        }

        @Override
        public D next()
        {
            D res = next.getData();
            next = next.getNext();
            return res;
        }
    }

    private static class Node<D>
    {
        private Node prev;
        private Node next;
        private D Data;

        public Node(Node prev, Node next, D data)
        {
            this.prev = prev;
            this.next = next;
            Data = data;
        }

        public Node getPrev()
        {
            return prev;
        }

        public void setPrev(Node prev)
        {
            this.prev = prev;
        }

        public Node getNext()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }

        public D getData()
        {
            return Data;
        }

        public void setData(D data)
        {
            Data = data;
        }
    }
}
