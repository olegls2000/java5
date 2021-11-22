package org.bta.lesson.lesson16;


import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

public class ClassWork {
	public static void main(String[] args) throws Exception {
		var calculator = new Calculator();
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

	private static class Calculator {
		public void calculateErr(int i, int i1) {
		}

		public void calculate(int i, int i1) {
		}

		public void calculateExc(int i, int i1) {
		}

		public void call(int i, int i1) {
		}

		public void method1() {
		}

		public void method2() {
		}
	}
}
