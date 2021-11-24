package org.bta.lesson.lesson11;

public class ClassWork {

    public static void main(String[] args) {
        //1..n
 //       printInRecursionTillZero( int n);
        // printWithRecursion();


     // anonimnyi class  !!!!!!!!!!!!!!1

 /*       TestInterface instance = new TestInterface() {
            @Override
            public void testMethod() {
                System.out.println("test method execution...");
            }
        };
        instance.testMethod();

        TestInterface instance2 = new TestInterface() {
            @Override
            public void testMethod2() {
                System.out.println("test method execution2...");
            }
        };
        instance2.testMethod2();
*/
        System.out.println(getFiboNumberByNumber(10));
    }

    // n..0
    private static void printInRecursionTillZero(int n) {

        System.out.println(" N = " + n);
        if (n <= 0) {
            return;
        }
        n--;
        printInRecursionTillZero(n);
        int fiboN = getFiboNumberByNumber(4);
        System.out.println(fiboN);
    }

    //0..n
    private static void printReverseInRecursion(int n) {
        int i = 0;
        System.out.println(" N = " + n);
        if (i > n) {
            return;
        }
        i++;
        ;

    }

    //fibo numbers
    private static int getFiboNumberByNumber(int order) {
        if (order == 0) {
            return 0;
        }
        if (order == 1) {
            return 1;
        }
        return getFiboNumberByNumber(order-1)+getFiboNumberByNumber(order-2);

    }

    private static void printWithRecursion() {
        System.out.println("Hello recursion");
        printWithRecursion();

    }


}


