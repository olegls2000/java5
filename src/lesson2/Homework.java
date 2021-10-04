package lesson2;

public class Homework {
    public static void main(String[] args) {
        //L2.4
double c;
c = ((Math.random() * (0.9 + 0.5)) - 0.5);// - [-0.5,0.9)
        System.out.println("random range: " + c);

        //L2.2
        int k;
        k = 10;
        if(k%2==0) {
            System.out.println(k + "even");
        } else {
            System.out.println(k + "odd");

        }

        int max = 100;
        int aNum = 20;
        int bNum = -45;

        int deltaA = 100 - aNum;
        int deltaB = 100 - bNum;

        if (deltaA < deltaB) {
            System.out.println("A is closer to 100 then B");
        } else {
            System.out.println("B is closer to 100 then A");
        }

        // l2.3
        double randomA = Math.random();
        double randomB = Math.random();
        double randomC = Math.random();

        System.out.println("Numbers: " + "a: " + randomA + ", b: " + randomB + ", c: " + randomC + ". Max: " + getMaxInt(randomA, randomB,randomC));

    }

    public static double getMaxInt(double a, double b, double c) {
        double result;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }

        if (c > result) {
            result = c;
        }

        return result;
    }


}
