package lesson16;

import exception.InvalidTriangleException;
import model.Point;
import model.Triangle;

public class ClassWork {
	public static void main(String[] args) throws Exception {
		lesson16.Calculator calculator = new lesson16.Calculator();
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

		try {
			calculator.method1();
			calculator.method2();
			calculator.calculateExc(1,1);
		} catch (MyException MyException) {
			System.out.println("Handler for Exception!!!");
		} catch (Exception exception) {
			System.out.println("Handler for Exception!!!");
		}
		try {
			Triangle triangle = new Triangle(new Point(3, 4),null, null);
		} catch (InvalidTriangleException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block");
		}
	}
}
