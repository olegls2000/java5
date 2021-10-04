package lesson3;

public class Homework {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 6;
        array[1] = 9;
        array[2] = -18;
        array[3] = -18;
        array[4] = 15;

        System.out.println("Array: " + array);
        System.out.println("Only positive values: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + ",");
            }
        }
        int arraySize = array.length;
        int i = 0;
        System.out.println("Only values % 5 == 0: ");
        while (i < arraySize) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + ",");
            }
            i++;
        }
        System.out.println("Only values % n == 0: ");
        printOnlyNDevidable(3, array);
    }

    public static void printOnlyNDevidable(int n, int[] array) {
        int arraySize = array.length;
        int i = 0;
        System.out.print("Only values % 5 == 0: ");
        while (i < arraySize) {
            if (array[i] % n == 0) {
                System.out.print(array[i] + ",");
            }
            i++;
        }
    }

    // Fibonaci
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
