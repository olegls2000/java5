package lesson19;

import lesson10.Circle;
import lesson10.Triangle;
import model.Car;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static utils.BtaUtils.getRandom;

public class ClassWork {
    public static void main(String[] args) {
        Supplier<Float> supplier = new RandomNumberSupplier();


        RandomNumberSupplier randomNumberSupplier = new RandomNumberSupplier();
        print(supplier, 10);
        Supplier<Circle> circleSupplier = new CircleSupplier();
        print(circleSupplier, 20);

        /*for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberSupplier.get());
        }

        CircleSupplier randomCircleSupplier = new CircleSupplier();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberSupplier.get());
        }

        Supplier<Circle> circleSupplier = new CircleSupplier();
        for (int i = 0; i < 20; i++) {
            System.out.println(circleSupplier.get());
        } */

        Supplier<Triangle> triangleSupplier = new Supplier<Triangle>() {
            @Override
            public Triangle get() {
                return new Triangle();
            }
        };

        Supplier<Triangle> triangleSupplierLambda = () -> new Triangle();

        print(() -> new Triangle(), 7);
        print(triangleSupplier, 7);
        print(() -> new Circle(), 7);

        Supplier<Car> carSupplierLambda = () -> new Car(20000,2500);

        print(() -> new Car(getRandom(300,7000), getRandom(1000,3000)), 7);

        Consumer<Circle> circlePerimPrintConsumer = new Consumer<Circle>() {
            @Override
            public void accept(Circle circle) {
                System.out.println("Perimeter: " + circle.getPerimeter());
            }
        };

        circlePerimPrintConsumer.accept(new Circle());

        Consumer<Circle> circleAreaPrintLambda =
                (t) -> System.out.println("Perimeter: " + t.getPerimeter());

        circlePerimPrintConsumer.accept(new Circle());

    }

    static void print(Supplier<?> supplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(supplier.get());
        }
    }
}


