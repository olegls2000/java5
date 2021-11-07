package Lesson9;
import exception.InsufficientPlacesException;
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
        try {
            autoStore.buyAuto(bmw);
            autoStore.buyAuto(toyota);
            autoStore.buyAuto(honda);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            autoStore.sellAuto(0);
            autoStore.sellAuto(6);
            autoStore.sellAuto(2);
        } catch (InsufficientPlacesException e) {
            e.getMessage();
        }

        Director dir1 = new Director(10, "oleg", "tt");


    }
}
