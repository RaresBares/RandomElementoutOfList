import java.util.ArrayList;
import java.util.Random;

public class RandomList
{
    private Random randomGenerator;
    private ArrayList<Integer> ints;



    public int anyItem()
    {
        int index = randomGenerator.nextInt(ints.size());
        int item = ints.get(index);
        System.out.println("" + item + "");
        return item;
    }
}