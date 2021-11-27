package org.bta.lesson.lesson16;

// то что закомментировано = первый метод

import org.bta.lesson.model.Triangle;

public class ClassWork {
    public static void main(String[] args) throws Exception { // добавлено throws Exception
        Calculator calculator = new Calculator();
        //Error example
        calculator.calculateErr(0, 3);
        // Runtime exception example
        /* try {*/
        calculator.calculator(2, 4); // если 0, то ловим ошибку
        calculator.calculator(0, 4); // если 0, то ловим ошибку
        calculator.calculator(3, 4); // если 0, то ловим ошибку
/*        } catch (RuntimeException e) {
            System.out.println("We catch exception with message: " + e.getMessage());
        }*/
        // Exception example
        try {
            calculator.calculateExc(3, 3);
        } catch (Exception e) {
            System.out.println("Exception caught!");
        }
        /*System.out.println("After exception!!!");*/
        calculator.call(0, 0);

        try {
            calculator.method1();
            calculator.method2();
            calculator.calculateExc(1, 2);
        } catch (Exception1 myException) {
            System.out.println("Handler for Exception1 !!!");
        } catch (Exception2 myException) {
            System.out.println("Handler for Exception2 !!!");
        } catch (Exception exception) {
            System.out.println("Handler exception!!!");
        }

        try {
            Triangle triangle = new Triangle(null, null, null);
        } catch (Exception InvalidTriangleException) {
            System.out.println("Handler for Exception Triangle !!!");
        }
    }
}
