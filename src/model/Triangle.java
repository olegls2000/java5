package model;

import utils.BtaUtils;

//TODO apply INCAPSULATION - ok
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    Double calculatePerim() {
        return BtaUtils.calculateDistance(a, b) +
                BtaUtils.calculateDistance(b, c) +
                BtaUtils.calculateDistance(a, c);
    }
}