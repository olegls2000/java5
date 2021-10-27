package lesson4;

import utils.BtaUtils;

//TODO rename
public class ClassWork {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5};

        int[] arrayGenerated = BtaUtils.generateArray(1, 1000, 5); // рандомный массив, и выводит самое большое число из пяти
        BtaUtils.printArray(arrayGenerated);

        // принтуем макс. и минимальное значение в массиве и затем
        BtaUtils.printMax(arrayGenerated);
        BtaUtils.printMin(arrayGenerated);
        BtaUtils.getMaxValueIndex(arrayGenerated);
        BtaUtils.getMinValueIndex(arrayGenerated);
        // BtaUtils.swapIn2dArray();


        // переворачиваем в массиве минимальное и максимальное значение
        // меняем местами числа в ячейках
        int maxIndex = BtaUtils.getMaxValueIndex(arrayGenerated);
        int minIndex = BtaUtils.getMinValueIndex(arrayGenerated);
        //int temp = arrayGenerated[maxIndex];
        //arrayGenerated[maxIndex] = arrayGenerated[minIndex];
        //arrayGenerated[minIndex] = temp;
        //  System.out.println("after min-max swap: ");
        arrayGenerated = BtaUtils.swapElements(maxIndex, minIndex, arrayGenerated);
        BtaUtils.printArray(arrayGenerated);
        int[] test = {1, 2, 3, 4};
        test = BtaUtils.swapElements(0, 3, test);
        BtaUtils.printArray(test);


        int[][] array2d = new int[2][2];
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        array2d[0] = array1;
        array2d[1] = array2;

        for (int i = 0; i < array2d.length; i++) {
            System.out.println(array2d[i].length);
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(array2d[i][j]);
            }
        }


    }
}
