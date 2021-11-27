package org.bta.lesson.lesson11;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter number: ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        long factor = 1;
        int i = 1;
        while (i <= num) {
            factor = factor * i;
            i++;

        }
        System.out.println("Factorial of number " + num + " is " + factor);
    }
}
