package org.bta.lesson.lesson1;

public class HomeWork {
    public static void main(String[] args) {
        int count1 = 69;
        double resultcount = count1 / 100 + 18 * (count1 - Math.pow(13, 2) + count1 / 3.14); // как ставить знак степени? - math.pow
        System.out.println(count1 + "/ 100 + 18 *(" + "(count1 - Math.pow(13, 2)" + count1 + "/ 3.14) =)" + resultcount);

        ///System.out.println(count1 + "100 + 18 * " + (count1 - Math.pow(13, 2)) + (count1 / 3.14)); // string?
// 69/100+18*(69-13^2+69/3.14)=...
        //double result3 = rate * (1/3) + Math.pow(388, 3) + rate * 2;
        //System.out.println(rate + " * (1/3)" + " + Math.pow(388, 3) + " + rate + " * 2 = " + result3);


        int acount = 6;
        int bcount = 2;
        int abcount = acount + bcount;
        System.out.println(+abcount);

        // если остаток от деления 0, то это чётное число, если нет, то false - нечётное
        int aacount = 17;
        int bbcount = 8;
        int aabbcount = aacount % bbcount; // показывает остаток от деления
        int aabbcount2 = aacount / bbcount; // показывает целое число от деления
        System.out.print(aabbcount2 + " остаток: ");
        System.out.print(aabbcount);
    }
}