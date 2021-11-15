package lesson19;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier implements Supplier<Float> {

    private final Random random = new Random();

    @Override
    public Float get() {
        //      Random random = new Random();   // analog nige napisan
        return random.nextFloat();
    }
}
