package org.bta.lesson.lesson4;

public class HomeWork {
    public static void main(String[] args) {

        int[][] array = {{5, 4}, {6, 0}, {-6, 10, 6}};

        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("Max value: " + array[iMax][jMax]);
    }
}
