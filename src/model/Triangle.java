package model;

import utils.BtaUtils;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point one, Point two, Point three) {
        pointOneLineCheck(one, two, three);
        this.a = one;
        this.b = two;
        this.c = three;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        pointOneLineCheck(a, this.b, this.c);
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        pointOneLineCheck(this.a, b, this.c);
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        pointOneLineCheck(this.a, this.b, c);
        this.c = c;
    }

    public double calculatePerimeter() {
        return BtaUtils.calculateDistance(a, b) +
                BtaUtils.calculateDistance(b, c) +
                BtaUtils.calculateDistance(a, c);
    }

    private void pointOneLineCheck(Point one, Point two, Point three) {
        double lefPart = (three.getY() - one.getY()) / (two.getY() - one.getY());
        double rightPart = (three.getX() - one.getX()) / (two.getX() - one.getX());
        if (lefPart == rightPart) {
            System.out.println("Triangle impossible!!");
            throw new RuntimeException();
        }
    }
}
