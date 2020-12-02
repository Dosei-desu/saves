package sorting;

import java.util.List;

public class Bubblesort implements ISorter
{

    @Override
    public void sort(List<Integer> list)
    {
        boolean swapped = true;
        while(swapped)
        {
            swapped = false;
            for(int i = 0; i < list.size()-1; ++i)
            {
                Integer a = list.get(i);
                Integer b = list.get(i+1);
                if(b < a)
                {
                    list.set(i, b);
                    list.set(i + 1, a);
                    swapped = true;
                }
            }
        }
    }
}
