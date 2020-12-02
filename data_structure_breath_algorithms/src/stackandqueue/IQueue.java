package stackandqueue;

public interface IQueue<D>
{
    public int size();
    public boolean isEmpty();
    public void enqueue(D data);
    public D dequeue();
    public D peek();
    public void clear();
}
