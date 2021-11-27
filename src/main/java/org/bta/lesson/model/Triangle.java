package org.bta.lesson.model;

import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.utils.BtaUtils;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point one, Point two, Point three) throws Exception {
        pointOneLineCheck(one, two, three);
        this.a = one;
        this.b = two;
        this.c = three;
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
    private void pointOneLineCheck(Point one, Point two, Point three) throws Exception {
        double lefPart = (three.getY() - one.getY()) / (two.getY() - one.getY());
        double rightPart = (three.getX() - one.getX()) / (two.getX() - one.getX());
        if (lefPart == rightPart) {
            throw new InvalidTriangleException("Triangle impossible");
        }
    }
}