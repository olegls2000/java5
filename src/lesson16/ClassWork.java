package lesson16;

import model.Point;
import model.Triangle;

public class ClassWork {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        //Error example
        calculator.calculateErr(1, 1);

        //Runtime Exception example
        calculator.calculate(3, 1);
        calculator.calculate(3, 1);
        calculator.calculate(1, 4);

        //Exception example
        try {
            calculator.calculateExc(0, 0);
            calculator.calculateExc(3, 3);
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
        System.out.println("After exception!!!");
        //calculator.call(0, 0);

        try {
            calculator.method1();
            calculator.method2();
            calculator.calculateExc(1, 1);
            calculator.calculate(0, 0);
        } catch (MyException myException) {
            System.out.println("Handler for MyException!!!");
        } catch (Exception1 myException) {
            System.out.println("Handler for Exception1!!!");
        } catch (Exception2 myException) {
            System.out.println("Handler for Exception2!!!");
        } catch (Exception exception) {
            System.out.println("Handler for Exception!!!");
        }

        try {
            Triangle triangle = new Triangle(new Point(3,3), new Point(4,4), new Point(5,5));
        } catch (Triangle.InvalidTriangleException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } finally {
            System.out.println("Finally block");
        }

    }
}
