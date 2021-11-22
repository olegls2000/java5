package org.bta.lesson.lesson16;

public class Calculator {
	public int calculate(int a, int b) {
		System.out.println("a = " + a + ", b = " + b);
		if (a == 0 || b == 0) {
			throw new RuntimeException("Inappropriate parameters value!");
		}
		return a + a + 2 * b;
	}

	public int calculateExc(int a, int b) throws Exception {
		System.out.println("a = " + a + ", b = " + b);
		if (a == 0) {
			throw new Exception("Inappropriate parameter a value!");
		}
		if (b == 0) {
			throw new MyException("Inappropriate parameter b value!");
		}
		return a + a + 2 * b;
	}

	public int calculateErr(int a, int b) {
		System.out.println("a = " + a + ", b = " + b);
		if (a == 0 || b == 0) {
			throw new Error("Inappropriate parameters value!");
		}

		return a + a + 2 * b;
	}

	public void call(int a, int b) {
		calculate(a, b);
		try {
			calculateExc(a, b);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public void method1() throws Exception1 {
		throw new Exception1();
	}

	public void method2() throws Exception2 {
		throw new Exception2();
	}
}