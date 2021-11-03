package lesson15;

import java.util.Set;
import java.util.TreeSet;

public class ClassWork {
    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        // Set<Car> parking = new TreeSet<>();
        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);
        Animal koer = new Animal("Kuri", "koer", 7, 29);

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal longLifeAnimal = findFirst(zoo);
        // final Car car = parking.stream().findFirst().get();

        //Comparator<Animal> weightComparator = new AnimalWeightComparator();
        Set<Animal> sortedByWeight = new TreeSet<>(new AnimalWeightComparator());
        sortedByWeight.add(cat);
        sortedByWeight.add(dog);
        sortedByWeight.add(koer);
        Animal biggestWeightAnimal = findFirst(sortedByWeight);
        Set<Animal> sortedByKind =
                new TreeSet<>(new KindAnimalComparator());
        sortedByKind.add(cat);
        sortedByKind.add(dog);
        sortedByKind.add(koer);
        Animal firsKindAnimal = findFirst(sortedByKind);
    }

    private static Animal findFirst(Set<Animal> animals){
        return animals.stream().findFirst().get();
    }
}
