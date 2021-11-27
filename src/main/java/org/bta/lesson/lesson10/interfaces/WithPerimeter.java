package org.bta.lesson.lesson10.interfaces;

import org.bta.lesson.lesson10.interfaces.WithCode;

public interface WithPerimeter { //extends WithCode, WithId
    // public static final int AGE = 100;
    int AGE = 100;

    // public int getPerimeter();
    int getPerimeter();

    default void printSmth() {
        System.out.println("Hello from default");
    }

}
