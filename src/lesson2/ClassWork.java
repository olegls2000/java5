package lesson2;

import utils.BtaUtils;

public class ClassWork {

    public static void main(String[] args) {
        if (55 != 66) {
            System.out.println("5");
        } else {
            System.out.println("6");
        }
        boolean bo = true;
        boolean b1 = !bo;
        if (b1) {
            System.out.println("b = True");
        } else {
            System.out.println("b = False");
        }
        int a = 3;
        int b = 3;
        int c = 30;
        if (a + b > c) {
            if (b + c > a) {
                if (a + c > b) {
                    System.out.println("Triangle is Possible");
                } else {
                    System.out.println("Triangle impossible");
                }
            } else {
                System.out.println("Triangle impossible");
            }
        } else {
            System.out.println("Triangle impossible");
        }

        checkTriangle(a, b, c);
        checkTriangle(44, 54, 39);
        checkTriangle(44, 54, 39);

        checkTriangle(7, 7, 7);
        checkTriangle(7, 80, 7);
        checkTriangle(7, 7, 70);

/*        System.out.println(" Sales were : 5000 EURO");
        System.out.println(" Profit was : 600 EURO");

        System.out.println(" Sales were : 6000 EURO");
        System.out.println(" Profit was : 600 EURO");

        System.out.println(" Sales were : 7000 EURO");
        System.out.println(" Profit was : 600 EURO");

        System.out.println(" Sales were : 5000 EURO");
        System.out.println(" Profit was : 600 EURO");
        */
        printReport(5000, 600);
        printReport(6000, 600);
        printReport(7000, 600);
        long sum = calculateSum(7, 9);
        int var = 4;
        if (true) {
            System.out.println(var);
            int varInner = 9;
        }
        //System.out.println(varInner);

        System.out.println("Random: " + (int) (Math.random() * 2));
        System.out.println("Random: " + BtaUtils.getRandom(900, 960));
        System.out.println("Random: " + BtaUtils.getRandom(900, 960));
        System.out.println("Random: " + BtaUtils.getRandom(900, 960));
        System.out.println("Random: " + BtaUtils.getRandom(900, 960));
        System.out.println("Random: " + BtaUtils.getRandom(900, 960));
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
        System.out.println("Sales were : " + sales + " EURO!");
        System.out.println("Profit was : " + profit + " EURO!");
    }

    public static long calculateSum(int a, int b) {
        int sum = a + b;
        System.out.println("log: sum = " + sum);
        return sum;
    }
}
