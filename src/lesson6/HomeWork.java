package lesson6;

import model.Point;
import model.Triangle;

public class HomeWork {

    public static void main(String[] args) {
        Point A = new Point(13, 34);
        Point B = new Point(22, 21);
        Point C = new Point(11, 19);

        System.out.println("Area of triangle: " + area(A, B, C));
        final float s = +area(A, B, C);
    }

    private static float area(Point A, Point B, Point C) {
        float area = (A.getX() * (B.getY() - C.getY())
                + B.getX() * (C.getY() - A.getY()) + C.getX() * (A.getY() - B.getY())) / 2.0f;
        return Math.abs(area);
    }
}