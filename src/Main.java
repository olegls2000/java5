public class Main {

    public static void main(String[] args){
        //System.out.println("Hello W..");
        //System.out.print("Hello W..");
        //System.out.print("Hello W..");
        //System.out.println();
        //System.out.print("Hello W..");

        System.out.println("__________________");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("__________________");
        int i = 10;
        float f = 10.001f;
        double d = 10.33333333333d;

        //i = (int) l; так не корректно, даункастинг
        i = (int) d;
        System.out.println("i=" + i + ";");

        d = i;
        int result = 0;
        result = 3 + 8;
        result = result + i;
        System.out.println("result = " + result);
        //121 * 1/3 + 388^3
        char ch = 'c';
        String str = "ASHKjsjfsfjh23124";
        // % - это остаток от деления
        int t = 50 % 7;

        int resultat = 0;
        resultat = 121 * 1 % 3 + 388^3;
        System.out.println("resultat = " + resultat);

        int dd = 121 * 1/3 + 388 * 388 * 388;
        System.out.println("121 * 1/3 + 388^3 = " + dd);


        boolean b1 = 4 > 8;
        System.out.println("4 > 8 = " + b1);

        boolean b2 = 4 > 8 / 2;
        System.out.println("4 > 8 / 2 = " + b2);

        boolean b3 = 4 > 8 / 2 - 5;
        System.out.println("4 > 8 / 2 - 5 = " + b3);

        boolean b4 = 4 != 5;
        System.out.println("4 != 5 = " + b4);

        boolean b5 = 4 == 5;
        System.out.println("4 == 5 = " + b5);

        boolean b6 = 4 != 5;
        System.out.println("4 != 5 = " + b6);

        double result2 = 121 * (1/3) + Math.pow(388, 3) + 121 * 2;
        System.out.println("121* (1/3)" + " + Math.pow(388, 3) + 121 * 2 = " + result2);


        int rate = 121;
        double result3 = rate * (1/3) + Math.pow(388, 3) + rate * 2;
        System.out.println(rate + " * (1/3)" + " + Math.pow(388, 3) + " + rate + " * 2 = " + result3);

        int y = 5;
        //  y = y +1; //6
        // y += 1; //6
        // y++; //6
        ++y; //6

        int z = 9;
        int x = z++; //9
        //int x = ++z; //10
        System.out.println("x = " + x); //9
        System.out.println("x = " + z); //10



        double decrem = 5.88; // декрементация
        decrem = decrem - 1; //4.88
        decrem -= 1; //3.88
        decrem--; //2.88
        --decrem; //1.88
        System.out.println("decrem " + decrem);


        long mult = 2;
        mult = mult * 3; //6
        mult *= 3; //18

        long div = 50; // если тип double то будет  8.3
        div /= 2; //25
        div /=3; //8
        System.out.println("div = " + div);


        // homework nr1

        int count1 = 69;
        double resultcount = count1 / 100 + 18 * ( count1 - Math.pow(13, 2) + count1 / 3.14); // как ставить знак степени? - math.pow
        System.out.println(count1 + "/ 100 + 18 *(" + "(count1 - Math.pow(13, 2)" + count1 + "/ 3.14) =)" + resultcount);

        ///System.out.println(count1 + "100 + 18 * " + (count1 - Math.pow(13, 2)) + (count1 / 3.14)); // string?
// 69/100+18*(69-13^2+69/3.14)=...
        //double result3 = rate * (1/3) + Math.pow(388, 3) + rate * 2;
        //System.out.println(rate + " * (1/3)" + " + Math.pow(388, 3) + " + rate + " * 2 = " + result3);


        int acount = 6;
        int bcount = 2;
        int abcount = acount + bcount;
        System.out.println( + abcount);

// если остаток от деления 0, то это чётное число, если нет, то false - нечётное
        int aacount = 17;
        int bbcount = 8;
        int aabbcount = aacount % bbcount; // показывает остаток от деления
        int aabbcount2 = aacount / bbcount; // показывает целое число от деления
        System.out.print(aabbcount2 + " остаток: ");
        System.out.print(aabbcount);


    }
}