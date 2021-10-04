package lesson4;

import utils.BtaUtils;

public class ClassWork {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};

        int[] arrayGenerated = BtaUtils.generateArray(1,1000,5);
        BtaUtils.printArray(arrayGenerated);

        //int maxIndex = BtaUtils.printMaxValue(arrayGenerated);
        int minIndex = BtaUtils.getMinValueIndex(arrayGenerated);

        //int temp = arrayGenerated[maxIndex];
        //arrayGenerated[maxIndex] = arrayGenerated[minIndex];
        //arrayGenerated[minIndex] = temp;
        System.out.println("after min-max swap: ");
        BtaUtils.printArray(arrayGenerated);

        int[][] array2d = new int[2][2];
        int[] array1 = {1,2};
        int[] array2 = {3,4};
        array2d[0] = array1;
        array2d[1] = array2;

        for (int i = 0; i < array2d.length; i++) {
            System.out.println(array2d[i].length);

            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(array2d[i][j]);
            }
        }
        //[[1,2,3,6], [5,7,9,0]]

    }
}
