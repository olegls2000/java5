package model;

import utils.BtaUtils;

public class Rectangle {
    //TODO: incaps
    Point a;
    Point b;
    Point c;
    Point d;

    public Rectangle(Point a, Point b, Point C, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public double calculateArea(){
        double side1 = BtaUtils.calculateDistance(a, b);
        double side2 = BtaUtils.calculateDistance(a, c);
        return side1 * side2;

    }
}
