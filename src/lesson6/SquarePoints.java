package lesson6;
import model.Point;
import model.Square;
public class SquarePoints {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(2, 0);
        Point d = new Point(0, 0);

        Square square = new Square(a, b, c, d);
        double perim = square.calculatePerim();
        System.out.println("Perim = " + perim);
    }
}