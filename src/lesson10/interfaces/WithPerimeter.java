package lesson10.interfaces;

public interface WithPerimeter {
    //public static final int AGE = 100;
    int AGE = 100;

    //public int getPerimeter();
    int getPerimeter();

    default void printSmth() {
        System.out.println("Hello from Default");
    }
}
