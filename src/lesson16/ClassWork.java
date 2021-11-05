package lesson16;

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
        calculator.call(0,0);
    }
}
