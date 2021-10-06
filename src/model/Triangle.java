package model;

import utils.BtaUtils;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        pointOneLineCheck(a, b, c);
    }

        this.a =a;
        this.b =b;
        this.c =c;
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


    private void pointOneLineCheck(Point one, Point two, Point three) {
        //proverka treugolnika chto tochki ne na odnoi priamoi
        double leftPart = (three.getY() - one.getY()) / two.getY() - one.getY())
        double rightPart = (three.getX() - one.getX()) / (two.getX() - one.getX())

        if (leftPart == rightPart) {

            System.out.println("  Triangle impossible ");
            throw new RuntimeException();

        }


        public double calculatePerimetr () {


            return 0.0D;
        }


        public double calculatePerim () {
            return BtaUtils.calculateDistance(a, b);

        }


    }


