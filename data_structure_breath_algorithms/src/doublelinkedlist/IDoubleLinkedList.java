package doublelinkedlist;

public interface IDoubleLinkedList<D> extends Iterable<D>
{
    public void insertFirst(D data);
    public void insertLast(D data);
    public D takeFirst();
    public D takeLast();
    public D peekFirst();
    public D peekLast();
    public boolean isEmpty();
    public int size();
    public void clear();
}
