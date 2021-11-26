package utils;

import model.Human;
import model.Gender;
import model.Point;

import java.util.Arrays;

public class BtaUtils {

    // КОНСТАНТЫ
    public static final int MY_LUCKY_NUMBER = 7;
    public static final Human JOE = new Human("Joe", "B", Gender.MAN);


    public static Integer[] swapElements(Integer index1, Integer index2, Integer[] array) {

        Integer vremennaja = array[index1];
        array[index1] = array[index2];
        array[index2] = vremennaja;
        return array;
    }

    //двумерный массив минимум и максимум поменяем местами

    public static int[][] swapIn2dArray(int indI1, int indJ1, int indI2, int indJ2, int[][] array) {

        int temp = array[indI1][indJ1];
        array[indI1][indJ1] = array[indI2][indJ2];
        array[indI2][indJ2] = temp;
        return array;
    }

    public static int getMaxValueIndex(Integer[] array) { // ищем самое высокое значение в массиве
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Index max value: " + indexMax);
        return indexMax;
    }


    public static int getMinValueIndex(Integer[] array) { // ищем самое низкое значение в массиве
        int indexMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("Index min value: " + indexMin);
        return indexMin;
    }


    public static void printMax(Integer[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value: " + max);
    }


    public static void printMin(Integer[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value: " + min);
    }


    public static <T> void printArray(T[] arrayToPrint) {
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
            if (i == arrayToPrint.length - 1) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static int getRandom(int from, int to) {
        int result = (int) (Math.random() * (to - from) + from);

        return result;
    }

    public static Integer[] generateArray(int from, int to, int length) {
        Integer[] result = new Integer[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = getRandom(from, to);
        }
        return result;
    }

    public static int getSumm(int[] array) {
    return Arrays.stream(array).sum();
    }

    public static double calculateDistance(Point a, Point b) {
        double deltaXSqr = Math.pow(2, b.getX() - a.getX()); // возводим в квадрат
        double deltaYSqr = Math.pow(2, b.getY() - a.getY()); // возводим в квадрат

        return Math.sqrt(deltaXSqr + deltaYSqr); // берём корень из суммы

    }

}
