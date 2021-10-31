package lesson12abstractvsinterface;

import java.io.Serializable;
import java.util.concurrent.Callable;

interface Ii extends
        Serializable,
        Runnable,
        Callable {
    int SOME_FIELD = 7;

    void print();

    default void method1() {
        System.out.println("from Abstract");
    }


}


