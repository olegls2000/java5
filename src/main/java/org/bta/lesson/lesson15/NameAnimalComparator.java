package org.bta.lesson.lesson15;

import java.util.Comparator;

public class NameAnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {

        return o1.getName().compareTo(o2.getName());
    }
}