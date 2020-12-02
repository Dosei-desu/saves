package sorting;

import java.util.List;
import java.util.Random;

public class Shuffler
{
    public void shuffle(List<Integer> list)
    {
        Random rnd = new Random();
        for(int i = 0; i < list.size()-1; ++i)
        {
            int luckyIndex = rnd.nextInt(list.size()-i) + i;
            int tmp = list.get(i);
            list.set(i, list.get(luckyIndex));
            list.set(luckyIndex, tmp);
        }
    }
}
