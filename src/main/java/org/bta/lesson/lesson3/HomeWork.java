package org.bta.lesson.lesson3;

//TODO rename
public class HomeWork {
    // public static void printOnly5(int[] array) { //примерно так же, как деление на два
    // for (int i = 0; i < array.length; i++)
    // }
    //числа фибоначчи
    public static void main(String[] args) {
        int num0 = 1;
        int num1 = 1;
        int num2;
        System.out.println(num0 + " " + num1 + " ");
        for (int i = 3; i <= 21; i++) {
            num2 = num0 + num1;
            System.out.println(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();
    }
}

