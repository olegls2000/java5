package org.bta.lesson.lesson16;

import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

//EXEPTIONS
public class ClassWork {
    public static void main(String[] args) throws InvalidTriangleException {

        Calculator calculator = new Calculator();

        //Error example
        calculator.calculateErr(1, 1);

        //Runtime Exception example
        //      try {
        calculator.calculate(3, 4);
        calculator.calculate(3, 1);
        calculator.calculate(5, 4);
        //      } catch (RuntimeException e) {
        //          System.out.println(" We catch exception with message :  " + e.getMessage());
        //       }
        try {

            calculator.calculateExc(3, 3);
        } catch (Exception e) {
            System.out.println("Exception caught!!");
        }

        System.out.println("After exception!!!");


        try {
            calculator.method1();
            calculator.method2();
            calculator.calculateExc(1,1);

        } catch (MyException myException) {
            System.out.println("Handler for MyException!!!");
        } catch (Exception1 exception1) {
            System.out.println("Handler for MyException!!!");

        } catch (Exception2 exception2) {
            System.out.println("Handler for MyException!!!");
        } catch (Exception exception) {
            System.out.println("Handler for Exception!!!");
        }



        try {
            Point a = new Point(3,3);
            Point b = new Point(4,4);
            Point c = new Point(5,5);
            Triangle triangle = new Triangle(a,b,c);
        } catch (InvalidTriangleException invalidTriangleException) {
            System.out.println(invalidTriangleException.getMessage());
        }finally {
            System.out.println("Finally block ");
        }


    }


}
