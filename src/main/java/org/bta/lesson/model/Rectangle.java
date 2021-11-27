package org.bta.lesson.model;

import org.bta.lesson.utils.BtaUtils;

public class Rectangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;


    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public double calculateArea() {
        double side1 = BtaUtils.calculateDistance(a, b);
        double side2 = BtaUtils.calculateDistance(a, c);
        return side1 * side2;
    }
}
