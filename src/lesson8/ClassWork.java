package lesson8;

import model.Point;
import model.Triangle;

public class ClassWork {
    public static void main(String[] args) {

        Point a = new Point(1, 0);
        Point b = new Point(1, 0);
        Point c = new Point(1, 0);

        Triangle triangle = new Triangle(a, b, c);
        triangle.setA(new Point(-1,-1));
    //    triangle.setB(new Point(-1,-1));
    //    triangle.setC(new Point(-1,-1));



    }


}
