package Lesson9;
import model.AutoStore;
import model.Car;
import model.Director;
import model.Slave;

public class ClassWork {
    public static void main(String[] args) {

        final var autoStore = new AutoStore();

        Car bmw = new Car(100,1000);
        Car toyota = new Car(200, 2500);
        Car honda = new Car(1600, 1200);
        autoStore.buyAuto(bmw);
        autoStore.buyAuto(toyota);
        autoStore.buyAuto(honda);

        autoStore.sellAuto(0);
        autoStore.sellAuto(6);
        autoStore.sellAuto(2);

        Director dir1 = new Director(10, "oleg", "tt");


    }
}
