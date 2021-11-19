package org.bta.lesson.lesson1;

public class ClassWork {

    public static void main(String[] args) {
        System.out.println(" ______ ");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println(" ______ ");
        int i = 4;
        float f = 10.001F;
        double d = 10.33333333333D;
        long l = 999999999999999999L;
        i = (int) d;
        System.out.println("i =" + i + ";");
        d = (double) i;
        int result = 9;
        result = 11;
        result = result + i;
        System.out.println("result = " + result);
        double dd = 5.8411112E7D;
        System.out.println("result = 121 * 1/3 + 388^3 = " + dd);
        boolean b1 = false;
        System.out.println("4 > 8/2 = " + b1);
        boolean b2 = true;
        boolean b3 = false;
        int y = 5;
        int var32 = y + 1;
        ++var32;
        double dec = 5.88D;
        --dec;
        --dec;
        --dec;
        --dec;
        System.out.println("dec = " + dec);
        long mult = 2L;
        mult *= 3L;
        mult *= 3L;
        long div = 50L;
        div /= 2L;
        div /= 3L;
        int a = 6;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        int rate = 69;
        double result2 = (double) (rate / 100) + 18.0D * ((double) (rate - 169) + (double) rate / 3.14D);
        System.out.println("result = " + result2);
        int n = 25;
        int k = 12;
        int m = n % k;
        System.out.println("division: " + n / k + ", remaining: " + m);
    }
}

