package model;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point one, Point two, Point three) {
		pointOneLineCheck(one, two, three);
		this.a = one;
		this.b = two;
		this.c = three;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		pointOneLineCheck(a, this.b, this.c);
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		pointOneLineCheck(this.a, b, this.c);
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		pointOneLineCheck(this.a, this.b, c);
		this.c = c;
	}

	private void pointOneLineCheck(Point a, Point b, Point c) {
	}

	public double calculatePerimeter() {

		return 0.0d;
	}
}
