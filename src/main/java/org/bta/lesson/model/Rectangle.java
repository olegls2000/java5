package org.bta.lesson.model;


import org.bta.lesson.utils.BtaUtils;

public class Rectangle {
	Point a;
	Point b;
	Point c;
	Point d;

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	public Rectangle(Point a, Point b, Point C, Point d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public double calculateArea(){
		double side1 = BtaUtils.calculateDistance(a, b);
		double side2 = BtaUtils.calculateDistance(a, c);
				return side1 * side2;

	}
	public double calculatePerimetr(){
		double side1 = BtaUtils.calculateDistance(a, b);
		double side2 = BtaUtils.calculateDistance(a, c);
		return 2 * (side1 + side2);
		}
	}

