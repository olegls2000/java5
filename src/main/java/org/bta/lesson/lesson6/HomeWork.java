package org.bta.lesson.lesson6;


import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

public class HomeWork {

	public static void main(String [] args) throws Exception {
		Point a = new Point(0,0);
		Point b = new Point(0, 2);
		Point c = new Point(2, 0);

		Triangle triangle = new Triangle(a,b,c);
		double perim = triangle.calculatePerimeter();
		triangle.getA();
		triangle.setA(new Point(1,2));



		System.out.println("Perim = " + perim);





	}
}
