package lesson15;
import java.util.*;

public class AnimalWeightComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {

        return o1.getWeight() - o2.getWeight();
    }
}