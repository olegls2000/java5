package model;
//TODO apply INCAPSULATION
public class Point {

    public int x;
    public int y;
    public int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // автогенерация кода ПКМ - generate - toString
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
