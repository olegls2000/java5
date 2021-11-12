package lesson19;

import lesson10.Circle;

import java.util.function.Supplier;

public class CircleSupplier implements Supplier<Circle> {

    @Override
    public Circle get() {
        return new Circle();
    }
}
