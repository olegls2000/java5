package lesson3;
import utils.BtaUtils;
//TODO rename
public class ClassWork {
    public static void main(String[] args) {
        charPrint('a');
        charPrint('g');
        charPrint('z');

        //while loop

        int index = 0;
        while (index <= 3) {
            System.out.println("Print smth..." + index);
            index++;
        }

        // Do while loop

        int index2 = 10;
        do {
            System.out.println("Print do while " + index2);
            index2--; // если изначальное значение равно 0
        } while (index2 > 10);

//while loop
        printFromZero(44);

        //while
        printFrom90Till0();

        // массивы

        int[] array = new int[5];
        //int[] array2 = new int[6];
        int arrayLength = array.length; //не обязательно, но для дальнейшего использования
        System.out.println(); //перенос строки вывода
        System.out.println("array leight =" + array.length);
        array[0] = 6;
        array[1] = 9;
        array[2] = 18;
        System.out.println(array); //адрес в памяти
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        BtaUtils.printArray(array);
    }


    public static void printFromZero(int to) {
        int i = 0;
        while (i <= to) {
            System.out.println(i);
            i++;
        }
        //for i loop
        printFromZeroFori(99);


        //первые n элементов последовательности 1, 3, 5, 7, 9 цикл for
        printOddNumbers(350);

    }


    // for i loop

    public static void printFromZeroFori(int to) {
        for (int i = 0; i <= to; i++) {
            System.out.println(i);
        }

    }

    public static void printOddNumbers(int count) {
        int k = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(k + ", ");
            k += 2;
        }


    }


    // метод выводящий на экран все неотрицательные элементы последовательности
    // 90 85 80 75

    public static void printFrom90Till0() {
        System.out.println(); //перенос вывода на новую строчку
        int n = 90;
        while (n >= 0) {
            System.out.print(n + ", "); //печатаем в строчку
            n -= 5;
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
                break;
            case 'b':
                System.out.println("You passed character B");
                break;
            default:
                System.out.println("You passed character unhandled character");
                // break фиксирует и выкидывает выполненную задачу
                // return - выходим вообще из метода
        }
    }

}
