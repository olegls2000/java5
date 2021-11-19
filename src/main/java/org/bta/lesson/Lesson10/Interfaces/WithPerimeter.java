package org.bta.lesson.Lesson10.Interfaces;

public interface WithPerimeter {



    int getPerimeter();

    int AGE = 100;

    default void printSmth(){
        System.out.println("Hello from default");
    }
}
