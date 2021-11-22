package org.bta.lesson.lesson11;

public class ClassWork {
    public static void main(String[] args) {
        //1..n
        //printInLoopTillZero(9);
        //printWithRecursion();
        //printInRecursionTillZero(2);
        printReverseInRecursionTillN(3);
        int fiboN = getFiboNumberByNumber(5);
        System.out.println(fiboN);

        TestInterface instance = new TestInterface() {
            @Override
            public void testMethod() {
                System.out.println("test method execution...");
            }
        };

        instance.testMethod();

    }

    //Fibo numbers:

    private static int getFiboNumberByNumber(int order) {
        if(order == 0) {
            return 0;
        }
        if (order == 1) {
            return 1;
        }
        return getFiboNumberByNumber(order - 1) + getFiboNumberByNumber(order - 2);
    }

    //n...0

    private static void printInRecursionTillZero(int n) {
        System.out.println(n);
        if (n <= 0) {
            return;
        }
        n--;
        printInRecursionTillZero(n);
    }

    //0...n
    private static void printReverseInRecursionTillN(final int n){
        if(n < 0) {
            return;
        }
        int m = n - 1;
        //n--;
        printReverseInRecursionTillN(m);
        System.out.println(n);
    }

    private static void printInLoopTillZero(int n) {
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    private static void printWithRecursion() {
        System.out.println("Hello From Recursion!!");
        printWithRecursion();
    }
}
