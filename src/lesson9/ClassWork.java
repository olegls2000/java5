package lesson9;

import model.AutoStore;
import model.Car;

public class ClassWork {
    public static void main(String[] args) {
        Car bmw = new Car(3000, 1500);
        Car toyota = new Car(5000, 1500);
        Car honda = new Car(6000, 1500);
        AutoStore autoStore = new AutoStore(5_000);
        autoStore.addCar(bmw, 0);
        autoStore.addCar(toyota, 1);
        autoStore.addCar(honda, 2);

        autoStore.report();
        autoStore.sellAuto(0);
        autoStore.report();
        autoStore.sellAuto(4);
        autoStore.report();
        autoStore.sellAuto(1);
        autoStore.report();


    }
}
