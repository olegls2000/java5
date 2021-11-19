package org.bta.lesson.Lesson8;
import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.model.*;
public class ClassWork {
    public static void main(String[] args) throws InvalidTriangleException {


        Point a = new Point(1,1);
        Point b = new Point(2,2);
        Point c = new Point (3,3);

        Triangle triangle = new Triangle(a,b,c);
    }

    public double calculatePerimeter(){

        return 0.0d;
    }
}
