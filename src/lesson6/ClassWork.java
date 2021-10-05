package lesson6;

import model.Point;
import model.Triangle;

public class ClassWork {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle triangle = new Triangle(a, b, c);
        double perim = triangle.calculatePerimeter();
        triangle.getA();
        triangle.setA(new Point(1, 2));

        System.out.println("Perim = " + perim);
    }
}
