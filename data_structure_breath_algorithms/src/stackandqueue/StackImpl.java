package stackandqueue;

import doublelinkedlist.DoubleLinkedList;
import doublelinkedlist.IDoubleLinkedList;

public class StackImpl<D> implements IStack<D>
{
    private IDoubleLinkedList<D> list;

    public StackImpl()
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
    public void push(D data)
    {
        list.insertLast(data);
    }

    @Override
    public D pop()
    {
        return list.takeLast();
    }

    @Override
    public D peek()
    {
        return list.peekLast();
    }

    @Override
    public void clear()
    {
        list.clear();
    }
}
