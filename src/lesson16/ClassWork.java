package lesson16;

import exception.InvalidTriangleException;
import exception.UnsuffisientBalanceException;
import exception.UnsuffisientPlacesException;
import model.AutoStore;
import model.Point;
import model.Triangle;

public class ClassWork {

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        AutoStore autoStore = new AutoStore();

        try {
            autoStore.sellAuto(3);

        } catch (UnsuffisientPlacesException e) {
            System.out.println(e.getMessage());
        }

        try {
            autoStore.buyAuto(null);
        } catch (UnsuffisientBalanceException e) {
            System.out.println(e.getMessage());
        }

        //Error example
        calculator.calculateErr(1, 1);

        //Runtime example
        try {
            calculator.calculate(3, 4);
            calculator.calculate(3, 0);
            calculator.calculate(1, 4);

            //Exception example
            try {
                calculator.calculateExc(0, 0);
                calculator.calculateExc(3, 3);

            } catch (Exception e) {
                System.out.println("Exception caught!");
            }


        } catch (RuntimeException e) {
            System.out.println("We catch exception with message: " + e.getMessage());
        }
        System.out.println("After exception!");
        calculator.call(0, 0);

        try {
            calculator.method1();
            calculator.method2();
            calculator.calculateExc(1, 1);
            calculator.calculate(0, 0);
        } catch (MyException myException) {
            System.out.println("Handler for MyException!!!");
        } catch (Exception1 exception1) {
            System.out.println("Handler for Exception1!!!");
        } catch (Exception2 exception2) {
            System.out.println("Handler for Exception2!!!");
        } catch (Exception exception) {
            System.out.println("Handler for Exception!!!");
        }

        try {
            Triangle triangle = new Triangle(new Point(3, 4), new Point(5, 3), new Point(5, 7));
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
