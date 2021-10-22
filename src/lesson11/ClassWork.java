package lesson11;

public class ClassWork {
    public static void main(String[] args) {
        // 1 .. n
        printInLoopTillZero(2);
        printWithRecursion();
    }
        // n .. 0

    private static void printInLoopTillZero(int n){
        System.out.println(n);
        if(n <= 0) {
            return;
        }
        n--;
        printInLoopTillZero(n);
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
