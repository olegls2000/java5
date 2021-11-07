package Lesson16;

import exception.InvalidTriangleException;
import model.Triangle;
import model.Point;

public class ClassWork {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point(3,3);

        // Throwable Exception
        try {
            calculator.calculateExc(0, 3);
            calculator.calculateExc(3, 3);
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
        System.out.println("After exception!!!");

        try {
            calculator.method1();
            calculator.method2();
            calculator.calculateExc(1, 1);
        } catch (MyException myException) {
            System.out.println("Handler for Exception");
        } catch (Exception1 myException) {
            System.out.println("Handler for Exception");
        } catch (Exception2 myException) {
            System.out.println("Handler for Exception");
        } catch (Exception exception) {
            System.out.println("Handler for Exception");
        }

        try {
            Triangle triangle = new Triangle(new Point(1,1),new Point(2,2), new Point(3,3));
        } catch (InvalidTriangleException e) {
            System.out.println("Impossible Triangle!!");
        }
    }
}
