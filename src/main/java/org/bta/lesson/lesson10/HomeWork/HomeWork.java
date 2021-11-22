package org.bta.lesson.lesson10.HomeWork;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

         int number;
         System.out.println("Enter the number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        long factorial = 1;
        int i = 1;
         while(i <= number) {
             factorial = factorial * i;
             i++;
         }
        System.out.println("Factorial of number " + number + " is " + factorial);

        }
    }

