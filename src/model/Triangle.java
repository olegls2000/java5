package model;

import exception.InvalidTriangleException;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (Point one, Point two, Point three) throws InvalidTriangleException {

        pointOnelineCheck(one, two, three);

        this.a = one;
        this.b = two;
        this.c = three;
    }

    public double calculatePerimeter() {
        return 0.0d;

    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) throws InvalidTriangleException {
        pointOnelineCheck(a, this.b, this.c);
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) throws InvalidTriangleException {

        pointOnelineCheck(this.a, b, this.c);

        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) throws InvalidTriangleException {

        pointOnelineCheck(this.a, this.b, c);
    }

    private void pointOnelineCheck(Point one, Point two, Point three) throws InvalidTriangleException{

        double leftPart = (three.getY() - one.getY()) / (two.getY() - one.getY());
        double rightPart = (three.getX() - one.getX()) / (two.getX() - one.getX());

        if (leftPart == rightPart) {
            throw new InvalidTriangleException("Triangle impossible!");
        }

        this.a = one;
        this.b = two;
        this.c = three;

    }
}

