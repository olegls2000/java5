package org.bta.lesson.lesson12abstractvsinterface;

import java.util.AbstractSet;

public abstract class Cc extends AbstractSet
        /*, AbstractList*/ {
    private int someField;

    public abstract void print();

    public void method1() {
        System.out.println("from Abstract");
    }

}
