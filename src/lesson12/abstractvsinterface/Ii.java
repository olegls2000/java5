package lesson12.abstractvsinterface;

import java.io.Serializable;
import java.util.concurrent.Callable;

public interface Ii extends Serializable, Runnable, Callable {
    public static final int SOME_FIELD = 7;
    int SOME_FIELD2 = 7; // и так и так можно писать

    void print();

    default void method1() {
        System.out.println("from Abstract");
    }

}
