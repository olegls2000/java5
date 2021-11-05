package lesson15;

import java.util.Comparator;

public class KindAnimalComparator implements Comparator<Animal> {


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getKind().compareTo(o2.getKind());
    }
}
