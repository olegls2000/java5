package model;

import utils.BtaUtils;

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
        return this.a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public double calculatePerim() {
        return BtaUtils.calculateDistance(a, b);

    }


}

}
