package stackandqueue;

public class QueueTest
{
    public static void main(String[] args)
    {
        IQueue<Integer> queue = new QueueImpl<>();

        for(int i = 1; i <= 10; ++i)
        {
            queue.enqueue(i);
        }

        while(!queue.isEmpty())
        {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        for(int i = 1; i <= 10; ++i)
        {
            queue.enqueue(i);
        }

        System.out.println("Size: " + queue.size());

        System.out.println("Peek: " + queue.peek());

        queue.clear();
        System.out.println("Size after clear: " + queue.size());
    }
}
