package lesson15;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);
        Animal koer = new Animal("Kaera", "Dog", 12, 29);

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal longLifeAnimal = findFirst(zoo);


        Set<Animal> sortedByWeight = new TreeSet<>(new AnimalWeightComparator());
        sortedByWeight.add(cat);
        sortedByWeight.add(dog);
        sortedByWeight.add(koer);
        Animal biggestWeightAnimal = findFirst(sortedByWeight);
        System.out.println();


        Set<Animal> sortedByKind = new TreeSet<>(new KindAnimalComparator());
        sortedByKind.add(cat);
        sortedByKind.add(dog);
        sortedByKind.add(koer);
        Animal firstKindAnimal = findFirst(sortedByKind);
        System.out.println(firstKindAnimal);


        Set<Animal> sortedByName = new TreeSet<>(new KindAnimalComparator());
        sortedByName.add(cat);
        sortedByName.add(dog);
        sortedByName.add(koer);
        Animal firstNameAnimal = findFirst(sortedByName);
        System.out.println(firstNameAnimal);

        BtaQueue<Animal> myQueue = new BtaQueue<>(); // E = Animal = E во вкладке ClassWork, или вместо Animal может быть что угодно
        // например Car
        myQueue.offer(new Animal());
        Animal animalFromQueue = (Animal) myQueue.poll();

    }

    private static Animal findFirst(Set<Animal> animals) {
        return animals.stream().findFirst().get();
    }

}
