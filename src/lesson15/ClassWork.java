package lesson15;

import java.util.Comparator;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Set;

public class ClassWork {

    public static void main(String[] args) {
        Set<Animal> zoo = new TreeSet<>();
        Animal cat = new Animal("Barsik", "Canine", 3, 13);
        Animal dog = new Animal("Palkan", "Dog", 6, 20);
        Animal koer = new Animal("Kuri", "koer", 7, 29);

        zoo.add(cat);
        zoo.add(dog);
        zoo.add(koer);
        Animal longLifeAnimal = zoo.stream().findFirst().get();


        //Comparator<Animal> weightComparator = new AnimalWeightComparator();  - bylo tak
        Set<Animal> sortedByWeight = new TreeSet<>(new AnimalWeightComparator());
        sortedByWeight.add(cat);
        sortedByWeight.add(dog);
        sortedByWeight.add(koer);
        Animal biggestWeightAnimal = sortedByWeight.stream().findFirst().get();

        Set<Animal> sortedByKind =
                new TreeSet<>(new KindAnimalComparator());
        sortedByKind.add(cat);
        sortedByKind.add(dog);
        sortedByKind.add(koer);
        Animal firstKindAnimal = findFirst(sortedByKind);

        Set<Animal> sortedByName =
                new TreeSet<>(new AnimalNameComparator());
        sortedByName.add(cat);
        sortedByName.add(dog);
        sortedByName.add(koer);
        Animal firstNameAnimal = findFirst(sortedByName);


        ////// QUEUE

        BtaQueue<Animal> myQueue = new BtaQueue<>();
        myQueue.offer(new Animal());
        Animal animalFromQueue = (Animal) myQueue.poll();


    }

    //статический метод поиска первого. замена последней строчки выше
    private static Animal findFirst(Set<Animal> animals) {
        return animals.stream().findFirst().get();
    }


}


