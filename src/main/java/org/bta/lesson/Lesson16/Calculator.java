package org.bta.lesson.Lesson16;

public class Calculator {

    public int calculate(int a, int b) throws Exception {
        if (a == 0) {
            throw new Exception("Inappropriate parameters value!");
        }
        if (b == 0) {
            throw new MyException("Inappropriate parameters value!");
        }
        return a + a + 2 * b;
    }

    public int calculateExc(int a, int b) throws Exception{
        if (a == 0 || b == 0) {
            System.out.println("a = " + a + "b = " + b);
            throw new Exception("Inappropriate parameters value!");
        }
        return a + a + 2 * b;
    }

    public void method1() throws Exception1 {
        throw new Exception1();
    }

    public void method2() throws Exception2 {
        throw new Exception2();
    }
}
