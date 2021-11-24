package org.bta.lesson.lesson19;

import org.bta.lesson.lesson10.Circle;

import java.util.Random;
import java.util.function.Supplier;

public class CircleSupplier implements Supplier<Circle> {



    @Override
    public Circle get() {
        return new Circle();

    }
}
