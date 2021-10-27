package model;

import utils.BtaUtils;

//TODO apply INCAPSULATION
public class Square {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Double calculatePerim() {
        double side1 = BtaUtils.calculateDistance(a, b);
        double side2 = BtaUtils.calculateDistance(b, c);
        return side1 * side2;
    }
}