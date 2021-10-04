package model;

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
        pointOneLineCheck(this.a, b, this.c);
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        pointOneLineCheck(this.a, this.b, c);
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public double calculatePerimer() {

        return 0.0d;
    }

    private void pointOneLineCheck(Point one, Point two, Point three) {
        double lefPart = (c.getY() - a.getY()) / (two.getY() - one.getY());
        double rightPart = (c.getX() - a.getX()) / (two.getX() - one.getX());
        if (lefPart == rightPart) {
            System.out.println("Triangle impossible!");
            throw new RuntimeException();
        }
    }
}
