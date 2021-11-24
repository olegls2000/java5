package org.bta.lesson.utils;

import org.bta.lesson.model.Gender;
import org.bta.lesson.model.Human;
import org.bta.lesson.model.Point;

import java.util.Arrays;

public class BtaUtils {


    public static final int MY_LUCKY_NUMBER = 7;

    public static final Human JOE = new Human("Joe", "B", Gender.MAN);

    public static <T> void printArray(T[] arrayToPrint) {
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
    public static int getMaxValueIndex(Integer[] getArray) {
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

    public static int getMinValueIndex(Integer[] getArray) {
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

    public static Integer[] generateArray(int from, int to, int lenght) {
        Integer[] result = new Integer[lenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRandom(from, to);
        }
        return result;
    }

    //Check array for free


    /* swap   */
    public static Integer[] swapElementsInArray(int index1, int index2, Integer[] array) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public static double calculateDistance(Point a, Point b) {
        double deltaXSqr = Math.pow(2, b.getX() - a.getX());
        double deltaYSqr = Math.pow(2, b.getY() - a.getY());
        return Math.sqrt(deltaXSqr + deltaYSqr);

    }


    public static int getSumm(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }

    //to  ze samoe


    public static int getSumm1(int[] array) {
        return Arrays.stream(array).sum();
    }


}



