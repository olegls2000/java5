package org.bta.lesson.Lesson19;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier implements Supplier<Float> {

    private final Random random = new Random();

    @Override
    public Float get(){
        return random.nextFloat();
    }
}
