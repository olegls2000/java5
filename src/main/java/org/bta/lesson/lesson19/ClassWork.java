package org.bta.lesson.lesson19;



import org.bta.lesson.lesson10.Circle;
import org.bta.lesson.lesson10.Triangle;
import org.bta.lesson.model.Car;


import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.bta.lesson.utils.BtaUtils.getRandom;


public class ClassWork {
    public static void main(String[] args) {
        Supplier<Float> supplier = new RandomNumberSupplier();
        print(supplier, 10);
        Supplier<Circle> circleSupplier = new CircleSupplier();
        print(circleSupplier, 20);

        Supplier<Triangle> triangleSupplier = new Supplier<Triangle>() {
            @Override
            public Triangle get() {
                return new Triangle();
            }
        };

        Supplier<Triangle> triangleSupplierLambda = () -> new Triangle();

        print(triangleSupplierLambda, 7);
        print(() -> new Circle(), 3);
        print(() -> new Car(getRandom(3000, 700000), getRandom(1000, 3000)), 3);

        Consumer<Circle> circlePerimPrintConsumer = new Consumer<Circle>() {
            @Override
            public void accept(Circle circle) {
                System.out.println("Perimeter: " + circle.getPerimeter());
            }
        };

        Consumer<Circle> circlePerimPrintConsumerLambda =
                t -> System.out.println("Perimeter: " + t.getPerimeter());

        circlePerimPrintConsumer.accept(new Circle());

        //Consumer<Circle> circleAreaPrintL = ...
    }

    static void print(Supplier<?> supplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(supplier.get());
        }
    }
}
