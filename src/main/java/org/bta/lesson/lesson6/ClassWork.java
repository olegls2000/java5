package org.bta.lesson.lesson6;


import org.bta.lesson.model.Point;
import org.bta.lesson.model.Triangle;

public class ClassWork {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        double perim = 0;
        try {
            Triangle triangle = new Triangle(a, b, c);
            perim = triangle.calculatePerimeter();
            triangle.getA();
            triangle.setA(new Point(1, 2));
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println("Perim = " + perim);
    }
}
