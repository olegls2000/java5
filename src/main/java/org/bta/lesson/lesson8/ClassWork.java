package org.bta.lesson.lesson8;


import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;


public class ClassWork {
	public static void main(String[] args) {
		Point a = new Point(1, 99);
		Point b = new Point(2, 2);
		Point c = new Point(3, 3);

		try {
			Triangle triangle = new Triangle(a, b, c);
			triangle.setA(new Point(-1, -1));
		} catch (InvalidTriangleException e) {
			System.out.println(e.getMessage());
		}

	}
}