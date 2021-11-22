package org.bta.lesson.lesson4;

public class HomeWork {
    public static void main(String[] args) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("average" + result / nums.length);

        int[][] array2d = new int[2][2];
        int[] array1 = {1, 2, 3, 6};
        int[] array2 = {5, 7, 9, 0};
        array2d[0] = array1;
        array2d[1] = array2;

        for (int i = 0; i < array2d.length; i++) {
            int sum = 0;
            System.out.print(array2d[i].length);

            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
                //System.out.println(array2d "sum" i + j / array2d.length);
            }
        }
        //public static void main(String[] args) {
        int[][] array = {{3, 4}, {6, 0}, {-6, 10}};

        //int min = array[0][0];
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //System.out.println(innerArray[j]);
                if (array[i][j] > array[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("Max value: " + array[iMax][jMax]);
    }
}
