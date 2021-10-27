package lesson12.abstractvsinterface;

import java.util.AbstractSet;

public abstract class Cc extends AbstractSet {
    // *, AbstractList*/ {
    private int someField;

    private int someField2;

    public abstract void print();

    public void method1() {
        System.out.println("from Abstract");
    }
}
