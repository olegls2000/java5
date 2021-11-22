package org.bta.lesson.lesson1;

public class ClassWork {

    public static void main(String[] args) {
        System.out.println("_____________");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("|             |");
        System.out.println("_____________");
        int i = 999999999;
        float f = 10.001f;
        double d = 16.33333333333d;
        long l = 999999999999999999l;
        long resLong = i + l;
        //i = (int) l;
        i = (int) d;
        System.out.println("i = " + i + ";");
        d = i;
        int result = 0;
        result = 3 + 8 * 7;
        result = result + i;
        System.out.println("result = " + result);

        //Create a program that calculate and print out next state:
        // 121 * ⅓ +388^3
        // Output example: 121 * ⅓ +388^3 = ...
        double dd = 121 * 1 / 3 + 388 * 388 * 388;
        System.out.println("121 * 1/3 +388^3 = " + dd);

        char ch = 'c';
        String str = "aSFDDASFSADffsad";
        int t = 50 % 7;
        //t=2

        boolean b1 = 4 >= 8 / 2 - 5;
        System.out.println("4 >= 8/2 = " + b1);
        boolean b2 = 4 != 5; // true
        boolean b3 = 4 == 5; // false

        int rate = 125;
        double result2 = rate * (1 / 3)
                + Math.pow(49, 2)
                + rate * 2;
        String report = rate
                + " * (1 / 3)"
                + " + Math.pow(388, 3) + "
                + rate
                + " * 2 = "
                + result2;

        System.out.println(report);

        int y = 5;
        //y = y + 1; //6
        //y += 1; //6
        y++; //6
        ++y;
        int z = 9;
        int xyy = z++;// > int x = 9 >> 9+1
        //int x = ++z;
        System.out.println("xyy = " + xyy);
        System.out.println("z = " + z);

        double dec = 5.88;
        dec = dec - 1; //  4.88
        dec -= 1; //  3.88
        dec--; //  2.88
        --dec; //  1.88
        System.out.println("dec = " + dec);

        long mult = 2;
        mult = mult * 3; // 6
        mult *= 3; // 18

        double div = 50;
        //div /= 2; //25
        div = div / 2;
        //div /= 3; //8
        div = div / 3;
        System.out.println("div = " + div);

    }
}
