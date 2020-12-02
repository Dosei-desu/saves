package stackandqueue;

public interface IStack<D>
{
    public int size();
    public boolean isEmpty();
    public void push(D data);
    public D pop();
    public D peek();
    public void clear();
}
