package lesson15;

import lesson10.HomeWork.Car;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class ClassWork {

    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);
        Animal koer = new Animal("Kuri", "koer", 7, 29);

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal LongLifeAnimal = findFirst(zoo);
        // final Car car = parking.stram().findFirst().get();

        // Comparator<Animal> weightComparator = new AnimalWeightComparator();
        Set<Animal> sortedByWeight = new TreeSet<>(new AnimalWeightComparator());
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal biggestWeightAnimal = findFirst(sortedByWeight);

        Set<Animal> sortedByKind =
                new TreeSet<>(new KindAnimalComparator());
        sortedByKind.add(cat);
        sortedByKind.add(dog);
        sortedByKind.add(koer);
        Animal firstKindAnimal = findFirst(sortedByKind);

        Set<Animal> sortedByName = new TreeSet<>(new NameAnimalComparator());
        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal bestNameAnimal = findFirst(sortedByName);

        Queue<Animal> myQueue = new BtaQueue<>();
        Queue<Car> myCar = new BtaQueue<>();
        myQueue.offer(new Animal());
        Animal animalFromQueue = (Animal) myQueue.poll();

    }



    private static Animal findFirst(Set<Animal> animals) {
        return animals.stream().findFirst().get();
    }
}
