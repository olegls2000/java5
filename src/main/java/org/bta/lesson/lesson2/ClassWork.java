package org.bta.lesson.lesson2;

import org.bta.lesson.utils.BtaUtils;

//TODO rename
public class ClassWork {
    public static void main(String[] args) {
        if (5 > 6) {
            System.out.println("5"); // false
        } else {
            System.out.println("6"); // true
        }
        boolean bo = true;
        boolean b1 = !bo;
        if (b1) {
            System.out.println("b = True");
        } else {
            System.out.println("b = False");
        }
        System.out.println("Random " + (int) (Math.random() * 2)); // рандом между 0 и 1
        System.out.println("Random " + BtaUtils.getRandom(00, 330));
        int a = 3;
        int b = 3;
        int c = 3;
        if (a + b > c) {
            if (b + c > a) {
                if (a + c > b) {
                    System.out.println("possible");
                } else {
                    System.out.println("Triangle impossible");
                }
            } else {
                System.out.println("Triangle impossible");
            }
        } else {
            System.out.println("Triangle impossible");
        }
        boolean cond1 = a + b > c;
        boolean cond2 = b + c > a;
        boolean cond3 = a + c > b;
        if (cond1 & cond2 & cond3) {
            System.out.println("Triangle possible");
        } else {
            System.out.println("Triangle impossible");
        }

        checkTriangle(a, b, c);
        checkTriangle(44, 54, 39);
        checkTriangle(440, 540, 390);
        checkTriangle(404, 504, 309);

        printReport(6000, 700); // относится к массиву ниже
        printReport(9000, 800);
        printReport(5000, 600);
        long sum = calculateSum(7, 9);

        // homework 2
        int m1 = 5;
        int m2 = 90;
        int m3 = 100;
        boolean b10 = m1 > m2;
        //System.out.println(m1 > m2) (+ b10);
    }

    public static void checkTriangle(int sideA, int sideB, int sideC) {
        boolean cond1 = sideA + sideB > sideC;
        boolean cond2 = sideB + sideC > sideA;
        boolean cond3 = sideA + sideC > sideB;
        if (cond1 & cond2 & cond3) {
            System.out.println("Triangle possible");
        } else {
            System.out.println("Triangle impossible");
        }

    }


    public static void printReport(int sales, int profit) {
        System.out.println("Sales were: " + sales + "Euro!");
        System.out.println("Profit were: " + profit + "Euro!");
    }


    public static long calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("log: sum = " + sum);
        return sum;
    }


}