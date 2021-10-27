package Lesson11;

public class ClassWork {
    public static void main(String[] args) {

        // printInLoop(8);
        // printInRecursionTillZero(2);
        printInRecursionTillN(3);

    }

    private static void printInLoop(int n) {

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }

    private static void printInRecursionTillZero(int n) {
        System.out.println(n);
        if (n <= 0) {
            return;
        }
        n--;
        printInRecursionTillZero(n);
    }

    private static void printInRecursionTillN(final int n) {
        if (n < 0) {
            return;
        }
        int m = n - 1;
        printInRecursionTillN(m);
        System.out.println(n);
    }
}
