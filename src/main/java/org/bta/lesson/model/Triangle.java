package org.bta.lesson.model;

import org.bta.lesson.exception.InvalidTriangleException;
import org.bta.lesson.utils.BtaUtils;

public class Triangle {

    private Long id;
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point one, Point two, Point three) throws InvalidTriangleException {

        pointOneLineCheck(one, two, three);

        this.a = one;
        this.b = two;
        this.c = three;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) throws InvalidTriangleException {
        pointOneLineCheck(a, this.b, this.c);
        this.a = a;
    }

    public Point getB() throws InvalidTriangleException {
        pointOneLineCheck(this.a, b, this.c);
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() throws InvalidTriangleException {
        pointOneLineCheck(this.a, this.b, c);
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double calculatePerimeter() {

        return BtaUtils.calculateDistance(a, b) +
                BtaUtils.calculateDistance(b, c) +
                BtaUtils.calculateDistance(a, c);
    }

    private void pointOneLineCheck(Point one, Point two, Point three) throws InvalidTriangleException {
        double lefPart = (c.getY() - a.getY()) / (two.getY() - one.getY());
        double rightPart = (c.getX() - a.getX()) / (two.getX() - one.getX());
        if (lefPart == rightPart) {
            System.out.println("Triangle impossible!");
            throw new InvalidTriangleException("Triangle impossible!");
        }

    }
}

