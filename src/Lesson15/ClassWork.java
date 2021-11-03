package Lesson15;

import java.util.Comparator;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;


public class ClassWork {
    public static void main(String[] args) {

        Set<Animal> zoo = new TreeSet<>();
        Set<Animal> sortedByWeight = new TreeSet<>(new AnimalWeightComparator());
        Set<Animal> sortedByAnimalKind = new TreeSet<>(new AnimalKindComparator());
        Set<Animal> sortedByAnimalName = new TreeSet<>(new AnimalNameComparator());

        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);
        Animal koer = new Animal("Kuri", "Koer", 7, 25);

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal first = findFirst(zoo);

        sortedByWeight.add(cat);
        sortedByWeight.add(dog);
        sortedByWeight.add(koer);
        Animal biggestWeightAnimal = findFirst(sortedByWeight);

        sortedByAnimalKind.add(cat);
        sortedByAnimalKind.add(dog);
        sortedByAnimalKind.add(koer);
        Animal firstByKindAnimal = findFirst(sortedByAnimalKind);

        sortedByAnimalName.add(cat);
        sortedByAnimalName.add(dog);
        sortedByAnimalName.add(koer);
        Animal firstByAnimalName = findFirst(sortedByAnimalName);

        BtaQueue<Animal> myQueue = new BtaQueue<>();
        myQueue.offer(new Animal());
        Animal animalFromQueue = (Animal) myQueue.poll();

    }

    private static Animal findFirst(Set<Animal> animals){
        return animals.stream().findFirst().get();
    }

}
