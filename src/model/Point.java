
package model;

import annotation.BtaNumber;


public class Point {
    @BtaNumber(min = 0, max = 99)
    private int x;

    @BtaNumber(min = -99, max = 0)
    private int y;

    public Point() {
        System.out.println("asd");
    }

    public boolean equalsdX(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (getX() != point.getX()) return false;
        return getY() == point.getY();
    }

    @Override
    public int hashCode() {
        int result = getX();
        result = 31 * result + getY();
        return result;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
