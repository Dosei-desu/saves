package doublelinkedlist;

public class FirstTest
{
    public static void main(String[] args)
    {
        IDoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        for(int i = 1; i <= 10; ++i)
        {
            list.insertLast(i);
        }
        System.out.println("Inserted last: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }

        list.clear();

        for(int i = 1; i <= 10; ++i)
        {
            list.insertFirst(i);
        }

        System.out.println("Inserted first: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }

        list.clear();

        for(int i = 1; i <= 10; ++i)
        {
            list.insertLast(i);
        }

        System.out.println("List: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }
        System.out.println("Peek first: " + list.peekFirst());
        System.out.println("Peek last: " + list.peekLast());
        System.out.println("List: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }

        System.out.println("Take first: " + list.takeFirst());
        System.out.println("List: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }
        System.out.println("Take last: " + list.takeLast());

        System.out.println("List: ");
        for(Integer i : list)
        {
            System.out.println(i);
        }

        System.out.println("Size: " + list.size());

        System.out.println("Is Empty? : " + list.isEmpty());

        System.out.println("Clearing list...");

        list.clear();

        System.out.println("Is Empty? : " + list.isEmpty());


    }
}
