package lesson11;

public class ClassWork {
    public static void main(String[] args) {
        // 1 .. n
       printInLoopTillZero(6);
        // printWithRecursion();
        printReverseInRecursionTillN(6);
// находим числа фибоначчи по ордеру 5 = 5, 6 = 8
        int fiboN = getFiboByNumber(6);
        System.out.println(fiboN);

        TestInterface instance = new TestInterface() {
            @Override
            public void testMethod() {
                System.out.println("Test method execution...");

            }
        };
                instance.testMethod();
    }


    // Fibo Numbers фибоначчи
private static int getFiboByNumber(int order) {
        if(order == 0) {
            return 0;
        }
        if(order == 1) {
            return 1;
        }
        return getFiboByNumber(order - 1) + getFiboByNumber(order -2);
}


    private static void printInLoopTillZero(int n){
        System.out.println(n);
        if(n <= 0) {
            return;
        }
        n--;
        printInLoopTillZero(n);
    }
    // n .. 0
    private static void printReverseInRecursionTillN(final int n){
        if (n == 0) {
            System.out.println(n);
            return;
        }
        int m = n-1;
        printReverseInRecursionTillN(m);
        System.out.println(n);
    }
/*    private static void printInLoopTillZero(int n){

    while (n>0){
        System.out.println(n);
        n--;
    }
    }*/
    private static void printWithRecursion() {
        System.out.println("Hello From Recursion!!");
        printWithRecursion();
    }
}
