package org.bta.lesson.lesson19;

import org.bta.lesson.lesson10.Circle;
import org.bta.lesson.lesson10.Triangle;
import org.bta.lesson.model.Car;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ClassWork {

    public static void main(String[] args) {
        RandomNumberSupplier randomNumberSupplier = new RandomNumberSupplier();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumberSupplier.get());
        }

        CircleSupplier circleSupplier = new CircleSupplier();
        for (int i = 0; i < 20; i++) {
            System.out.println(circleSupplier.get());
        }
        //drugaia zapis
        Supplier<Circle> circleSupplier1 = new CircleSupplier();
        for (int i = 0; i < 20; i++) {
            System.out.println(circleSupplier1.get());

        }

        print(randomNumberSupplier, 10);
        print(circleSupplier1, 20);

        //     Supplier<Triangle> triangleSupplier = new Supplier<Triangle>() {
        //          @Override
        //         public Triangle get() {
        //             return new Triangle();
        //          }
        //      };
        //   Preobrazovanie v LAMBDA

        Supplier<Triangle> triangleSupplierLambda = () -> new Triangle();


        print(triangleSupplierLambda, 7);


       Supplier<Car> carSupplier = () -> new Car(225000,1500);
       print(carSupplier,3);
// toge samoe LAMBDA srazu v print
        print(() -> new Car(220000, 1500), 3);


  //  CONSUMER !!!!

        Consumer<Circle> circlePerimPrintConsumer = new Consumer<Circle>() {
            @Override
            public void accept(Circle circle) {
                System.out.println("Perimetr : " + circle.getPerimeter());
            }
        };



        circlePerimPrintConsumer.accept(new Circle());


    }

    static void print(Supplier<?> supplier, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(supplier.get());
        }

    }

}
