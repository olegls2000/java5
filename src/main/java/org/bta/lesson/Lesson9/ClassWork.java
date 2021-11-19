package org.bta.lesson.Lesson9;
import org.bta.lesson.exception.InsufficientPlacesException;
import org.bta.lesson.model.AutoStore;
import org.bta.lesson.model.Car;
import org.bta.lesson.model.Director;
import org.bta.lesson.model.Slave;


public class ClassWork {
    public static void main(String[] args) throws InsufficientPlacesException {

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

        autoStore.sellAuto(0);
        autoStore.sellAuto(6);
        autoStore.sellAuto(2);

        Director dir1 = new Director(10, "oleg", "tt");


    }
}
