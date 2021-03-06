package org.bta.lesson.lesson3;


import org.bta.lesson.utils.BtaUtils;

public class ClassWork {
    public static void main(String... args) {
        char zz = 'z';
        charPrintSwitchCase('d');
        charPrintSwitchCase('y');
        charPrintSwitchCase(zz);
        //WHILE LOOP
        int index = 0;
        while (index <= 300) {
            System.out.println("Print smth..." + index);
            index++;
        }
        //DO WHILE LOOP
        int index2 = 0;
        do {
            System.out.println("Print do while:  " + index2);
            index2++;
        } while (index2 > 10);
        printFromZero(74);
        //FOR i LOOP

        printFromZeroFori(99);

        System.out.println();
        System.out.println();
        //Создайте метод, выводящий на экран
        // первые n элементов последовательности
        // 1 3 5 7 9 11 13 15 17 …. Цикл FOR
        printOddNumbers(6);

        //Создайте метод, выводящий на экран все
        // неотрицательные элементы последовательности
        // 90 85 80 75 70 65 60 …. WHILE
        printFrom90Till0();

        Integer[] array = new Integer[5];
        int[] array1 = new int[6];
        int arrayLength = array.length;
        int arrayLength1 = array1.length;
        System.out.println("array length = " + arrayLength);
        array[0] = 6;
        array[1] = 9;
        array[2] = 18;
        System.out.println(array);
        BtaUtils.printArray(array);
        BtaUtils.printArray(array);
        BtaUtils.printArray(array);

        int a = 1;
        for (int i = 0; i >= 0; i++) {
            if (a == 5) {
                continue;
            }
            a = a + 2;
        }
    }

    public static void printFrom90Till0() {
        System.out.println();

        int n = 90;
        while (n >= 0) {
            System.out.print(n + ", ");
            n -= 5;
        }
    }

    public static void printOddNumbers(int count) {
        int k = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(k + ", ");
            k += 2;
        }
    }

    //44->0,1,2,...XX;
    public static void printFromZero(int to) {
        int i = 0;
        while (i <= to) {
            System.out.print(i + ", ");
            i++;
        }
    }

    public static void printFromZeroFori(int to) {
        for (int i = 0; i <= to; i++) {
            System.out.print(i);
            System.out.print(",");
        }
    }

    public static void charPrint(char charToPrint) {
        if (charToPrint == 'a') {
            System.out.println("You passed character A");
        } else if (charToPrint == 'b') {
            System.out.println("You passed character B");
        } else {
            System.out.println("You passed character unhandled character");
        }
    }

    public static void charPrintSwitchCase(char charToPrint) {
        switch (charToPrint) {
            case 'a':
                System.out.println("You passed character A");
                //break;
            case 'b':
                System.out.println("You passed character B");
                break;
            default:
                System.out.println("You passed character unhandled character");
                return;
        }
        System.out.println("Print smth...");
    }
}
