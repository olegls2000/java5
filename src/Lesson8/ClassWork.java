package Lesson8;
import exception.InvalidTriangleException;
import model.*;
public class ClassWork {
    public static void main(String[] args) {


        try {
            Point a = new Point(1,1);
            Point b = new Point(2,2);
            Point c = new Point (3,3);

            Triangle triangle = new Triangle(a,b,c);
        } catch (InvalidTriangleException e) {
            System.out.println("Triangle impossible");
        }
    }

    public double calculatePerimeter(){

        return 0.0d;
    }
}
