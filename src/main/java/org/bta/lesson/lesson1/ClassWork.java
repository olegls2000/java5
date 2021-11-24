package org.bta.lesson.lesson1;

public class ClassWork {


        public static void main(String[] args) {
            System.out.println("_______");
            System.out.println("!     !");
            System.out.println("!     !");
            System.out.println("!     !");
            System.out.println("-------");
            int i = 999999999;
            float f = 10.001f;
            double d = 10.3333333333333d;
            long l = 99999999999999999l;
            // i = (int) l ;
            i = (int) d;
            System.out.println("i = " + i);

            int result = 0;
            result = 3 + 8;
            result = result + i;
            System.out.println("result= " + result);
            char ch = 'c';
            //String = " sdfsdfsdfsdf";
            double a = 0;
            a = (121 / 3 + 388 * 388 * 388);

            System.out.println("Itogo =  " + a);

            boolean b1 = 4 > 8;
            System.out.println(" 4>8    = " + b1);

            int rate = 121;
            double result2 = rate * (1 / 3) + Math.pow(388, 3) + rate * 2;
            String report;
            report = rate + "* (1/3) + Math.pow(388, 3) + " + rate + " * 2   = " + result2;
            System.out.println(report);


            int y = 5;
            //y++;    y--
            //++y;     --y
            //y+= 1;
            // y=y+1 ;

            long mult = 2;
            mult = mult * 3;
            mult *= 3;

            double div =50;
            div /=2;


        }

    }






