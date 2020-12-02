package stackandqueue;

public class StackTest
{
    public static void main(String[] args)
    {
        IStack<Integer> stack = new StackImpl<>();

        for(int i = 1; i <= 10; ++i)
        {
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            System.out.println("Pop: " + stack.pop());
        }

        for(int i = 1; i <= 10; ++i)
        {
            stack.push(i);
        }

        System.out.println("Size: " + stack.size());
        System.out.println("Peek: " + stack.peek());

        stack.clear();
        System.out.println("Size after clear: " + stack.size());
    }
}
