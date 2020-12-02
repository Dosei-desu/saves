import linkedlist.IntLinkedList;
import linkedlist.IntList;

public class Main {

    public static void main(String[] args)
    {
        IntList list = new IntLinkedList();
        for(int i = 1; i <= 10; ++i)
        {
            list.prepend(i);
        }
        System.out.println(list);
        System.out.println("list på index 2: "+ list.get(2));
        list.delete(7);
        System.out.println("Listen uden 7: " + list);
        list.append(42);
        System.out.println("Appended 42: " + list);
    }
}
