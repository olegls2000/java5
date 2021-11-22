package org.bta.lesson.lesson2;

public class HomeWork {
    public static void main(String[] args) {
        //Create a program that define and print out
        // one from two numbers n and m which  is closer to 100.
        // Output example: "m=5, n=90; 90 is closer to 100"
        closestTo100(120, 105);
    }

    public static void closestTo100(int m, int n) {
        int mDelta = Math.abs(100 - m);
        int nDelta = Math.abs(100 - n);
        String message = "m = " + m + ", n = " + n + "; ";
        String messageEnd = " - is closer to 100";
        if (mDelta < nDelta) {
            message = message + m;
        } else {
            message = message + n;
        }
        System.out.println(message + messageEnd);
    }
}
