package org.bta.lesson.lesson3;


import org.bta.lesson.utils.BtaUtils;

public class ClassWork {


// import com.sun.management.HotSpotDiagnosticMXBean;


    public static void main(String[] args) {


        printFromZeroFori(99);
        printOddNumbers(30);
        System.out.println();
        printFrom90Till0();


        //WHILE
        int index = 0;
        while (index <= 3) {
            System.out.println("Print......");
            index++;

        }
//DO WHILE

        int index2 = 0;
        do {
            System.out.println("Print..." + index2);
            index2++;
        } while (index2 > 10);

        //ARRAY
        Integer[] array = new Integer[5];
        int arrayLenght = array.length;
        ;
        System.out.println("array lenght" + arrayLenght);
        array[0] = 1;
        array[1] = 9;
        array[2] = 18;
        System.out.println(array);
        for (int i = 0; i < arrayLenght; i++) {
            System.out.print(array[i] + " , ");
        }
        BtaUtils.printArray(array);

    }

    //print 1-44 to=44
    public static void printFromZero(int to) {
        int index3 = 0;
        while (index3 <= to) {
            System.out.println(index3);
            index3++;
        }
    }

    //FOR  ( int i=0 ; i > 5 ;  i--  )   {  calculation  }

    public static void printFromZeroFori(int to) {
        for (int i = 0; i <= to; i++) {
            System.out.println(i);
        }
    }

    public static void printOddNumbers(int count) {
        int m = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(m + ", ");
            m += 2;
        }
    }

    public static void printFrom90Till0() {
        int till = 90;
        while (till >= 0) {
            System.out.println(till);
            till -= 5;
        }
    }


}
















  /*  public static void charPrint(char charToPrint) {
        if (charToPrint == 'a') {
            System.out.println("You passed character A");
        } else if (charToPrint == 'b') {
            System.out.println("You passed character B");
        } else {
            System.out.println("Undefine passed character ");

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
                System.out.println("undefind character ");

        }
        System.out.println("Print smth...");
    }

*/





