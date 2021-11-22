package org.bta.lesson.utils;



import org.bta.lesson.model.Gender;
import org.bta.lesson.model.Human;
import org.bta.lesson.model.Point;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BtaUtils {


	public static final int MY_LUCKY_NUMBER = 7;
	//public static final int JOE = ;
	public static final Human JOE = new Human("Joe", "B", Gender.MAN);

	public static <T> void printArray(Integer[] arrayToPrint) {
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
		int length1 = length;
		Integer[] result = new Integer[length];
		for (int i = 0; i < result.length; i++) {
			result[i] = getRandom(from, to);
		}
		return result;
	}

	public static Integer getMaxValueIndex(Integer[] array) {
		int iMax = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[iMax]) {
				iMax = i;
			}
		}
		System.out.println("Max value: " + array[iMax]);
		System.out.println("Max value Index: " + iMax);
		return iMax;
	}

	public static int getMinValueIndex(Integer[] array) {
		Integer iMin = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[iMin]) {
				iMin = i;
			}
		}
		System.out.println("Min value: " + array[iMin]);
		System.out.println("Min value Index: " + iMin);
		return iMin;
	}

	public static Integer[] swapElementsInaArray(Integer index1, Integer index2, Integer[] array) {
		int vremennaja = array[index1];
		array[index1] = array[index2];
		array[index2] = vremennaja;
		return array;
	}

	public static int[][] swapIn2dArray(int indI1, int indJ1,
										int indI2, int indJ2,
										int[][] array) {
		int temp = array[indI1][indJ1];
		array[indI1][indJ1] = array[indI2][indJ2];
		array[indI2][indJ2] = temp;
		return array;
	}


	/*public static int getSumm(int[] array) {
		int summ = 0;
		for (int i = 0; i < array.length; i++) {
			summ += array[i];
		}
		return summ;  nize uproshenie*/

		public static int getSumm(int[] array) {
			return Arrays.stream(array).sum();
	}

	public static double calculateDistance(Point a, Point b) {
		double deltaXSqr = Math.pow(2, b.getX() - a.getX());
		double deltaYSqr = Math.pow(2, b.getY() - a.getY());

		return Math.sqrt(deltaXSqr + deltaYSqr);
	}

	public static void printArray(Method[] declaredMethods) {
	}
}
