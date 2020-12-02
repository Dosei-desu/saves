package stackandqueue;

import doublelinkedlist.DoubleLinkedList;
import doublelinkedlist.IDoubleLinkedList;

public class QueueImpl<D> implements IQueue<D>
{
    IDoubleLinkedList<D> list;

    public QueueImpl()
    {
        list = new DoubleLinkedList<>();
    }

    @Override
    public int size()
    {
        return list.size();
    }

    @Override
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    @Override
    public void enqueue(D data)
    {
        list.insertLast(data);
    }

    @Override
    public D dequeue()
    {
        return list.takeFirst();
    }

    @Override
    public D peek()
    {
        return list.peekFirst();
    }

    @Override
    public void clear()
    {
        list.clear();
    }
}
