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

    // разграничение дрступов
    public Point getA() {
        return this.a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    Double calculatePerim() {
        return BtaUtils.calculateDistance(a, b) +
                BtaUtils.calculateDistance(b, c) +
                BtaUtils.calculateDistance(a, c);
    }
}