package model;

public class Square {
    Point a;
    Point b;
    Point c;
    Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    Double calculatePerim() {
         double side1 = BtaUtils.calculateDistance(a, b);
         double side2 = BtaUtils.calculateDistance(b, c);
                return side1 * side2;


    }
}
