package lesson16;

public class Calculator {
    public int calculator(int a, int b) {
        System.out.println("a = " + a + "b = " + b);
        if (a == 0 || b == 0) {
            throw new RuntimeException("Inappropriate parameters value!");
        }
        return a + a + 2 * b;
    }

    // к MyException вкладке
    public int MyCalculateException(int a, int b) throws Exception {
        System.out.println("a = " + a + "b = " + b);
        if (a == 0) {
            throw new MyException("Inappropriate parameters a value!");
        }
        if (b == 0) {
            throw new MyException("Inappropriate parameters b value!");
        }
        return a + a + 2 * b;
    }
    // к MyException вкладке конец

    public int calculateExc(int a, int b) throws Exception {
        System.out.println("a = " + a + "b = " + b);
        if (a == 0 || b == 0) {
            throw new Exception("Inappropriate parameters value!");
        }
        return a + a + 2 * b;
    }


    public int calculateErr(int a, int b) throws Exception {
        System.out.println("a = " + a + "b = " + b);
        if (a == 0 || b == 0) {
            throw new Exception("Inappropriate parameters value!");
        }
        return a + a + 2 * b;
    }

    public void call(int a, int b) {
        calculator(a, b);
        try {
            calculateExc(a, b);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
