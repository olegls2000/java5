package lesson2;

public class homework_lesson_2 {
    public static void main(String[] args) {
        closestTo100(120, 105);


        countNumbers('0');
        countNumbers('1');

// нифига не пашет, не работают даже примеры с инета https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
        float amin = -10;
        float bmax = 9;
        float x = amin + (float) (Math.random() * ((bmax - amin) + 1));
        System.out.print("Случайное число : " + x);





    }

// числа ближайшие к 100
    public static void closestTo100(int m, int n) {
        int mDelta = Math.abs(100 - m);
        int nDelta = Math.abs(100 - n);
        String message = "m=" + m + ", n=" + n + ";";
        String messageEnd = " - is closer to 100";
        if (mDelta < nDelta) {
            message = message + m;
        } else {
            message = message + n;
        }
        System.out.println(message + messageEnd);
    }


// если остаток при делении 0, тогда это чётное число, если остаток отличный от 0, тогда это нечётное число

// чётное или не чётное
    public static void countNumbers(int aacount) {
        aacount = 19;
        if (aacount % 2 == 0)
            System.out.println("Число четное");
     else
            System.out.println("Число нечетное");
    }






}




