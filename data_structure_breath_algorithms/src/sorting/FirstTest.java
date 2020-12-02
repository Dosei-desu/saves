package sorting;

import java.util.ArrayList;
import java.util.List;

public class FirstTest
{
    public static void main(String[] args)
    {
        Shuffler shuffler = new Shuffler();
        ISorter bubble = new Bubblesort();
        ISorter heap = new Heapsort();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 40000; ++i)
        {
            list.add(i);
        }
        /*
        System.out.println("Initial list:");
        for(int n : list)
        {
            System.out.println(n);
        }
        */
        shuffler.shuffle(list);
        /*
        System.out.println("Shuffled list: ");
        for(int n : list)
        {
            System.out.println(n);
        }
        */
        long start = System.currentTimeMillis();
        bubble.sort(list);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Bubblesort took " + time + " milliseconds.");

        shuffler.shuffle(list);
        /*
        System.out.println("Shuffled list: ");
        for(int n : list)
        {
            System.out.println(n);
        }
        */

        start = System.currentTimeMillis();
        heap.sort(list);
        end = System.currentTimeMillis();
        time = end - start;
        System.out.println("Heapsort took " + time + " milliseconds.");
        /*
        System.out.println("Sorted list: ");
        for(int n : list)
        {
            System.out.println(n);
        }
        */
    }
}
