package lesson19;

import lesson10.Circle;

import java.util.Random;
import java.util.function.Supplier;

public class CircleSupplier implements Supplier<Circle> {
    @Override
    public Circle get() {
        System.out.println("Circle supplier");

        return new Circle();
    }
}
