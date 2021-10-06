package utils;

import model.Gender;
import model.Human;
import model.Point;

public class BtaUtils {


    public static final int MY_LUCKY_NUMBER = 7;

    public static final Human JOE = new Human("Joe", "B", Gender.MAN);

    public static void printArray(int[] arrayToPrint) {
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i == arrayToPrint.length - 1) {
                continue;
            }
            System.out.print(",  ");
        }
        System.out.print("]");
        System.out.println();

    }
    /* Random */

    public static int getRandom(int from, int to) {
        int result = (int) (Math.random() * (to - from) + from);

        return result;
    }

    /* Max znachenie massiva */
    public static int getMaxValueIndex(int[] getArray) {
        int indexMax = 0;
        for (int i = 1; i < getArray.length; i++) {
            if (getArray[i] > getArray[indexMax]) {
                indexMax = i;
            }

        }
        System.out.println(" Maximalnoe znachenie : " + getArray[indexMax]);
        System.out.println(" Maximalnoe znachenie  index : " + indexMax);

        return indexMax;
    }


    /*  Minimalnoe znachenie massiva  */

    public static int getMinValueIndex(int[] getArray) {
        int indexMin = 0;
        for (int i = 1; i < getArray.length; i++) {
            if (getArray[i] < getArray[indexMin]) {
                indexMin = i;
            }

        }
        System.out.println(" Minimalnoe znachenie : " + getArray[indexMin]);
        System.out.println(" Minimalnoe znachenie index: " + indexMin);

        return indexMin;
    }

    /*  Sozdanie massiva */

    public static int[] generateArray(int from, int to, int lenght) {
        int[] result = new int[lenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRandom(from, to);
        }
        return result;
    }

    //Check array for free





    /* swap   */
    public static int[] swapElementsInArray(int index1, int index2, int[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static double calculateDistance(Point a, Point b) {
        double deltaXSqr = Math.pow(2, b.x - a.x);
        double deltaYSqr = Math.pow(2, b.y - a.y);
        return Math.sqrt(deltaXSqr + deltaYSqr);

    }
}



