package lesson15;

import java.util.Set;
import java.util.TreeSet;

public class ClassWork {
    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);

        zoo.add(cat);
        zoo.add(dog);
    }
}
