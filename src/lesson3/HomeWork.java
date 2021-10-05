package lesson3;

public class HomeWork {
    public static void main(String[] args) {
        // * * Create a Method which:   takes in the parameter
        // array of numbers and print of
        // only elements that multiplied by 5; use while loop.
    }

    public static void printOnly5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
        int i = 0;
        while (i < array.length) {
            if (array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
            i++;
        }
    }

    /**
     * Создать массив из первых 20 ти чисел Фибоначи,
     * вывести его на экран встолбик.
     */
    public static int[] getFiboArray(int count) {
        int[] fiboArray = new int[count];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        for (int i = 2; i < fiboArray.length; i++) {
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray;

    }
}
