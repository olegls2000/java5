package org.bta.lesson.model;

import org.bta.lesson.annotation.BtaNumber;

public class Point {
    @BtaNumber(min = 0, max = 99)
    private int x;
    @BtaNumber(min = -99, max = 0)
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // автогенерация кода ПКМ - generate - toString, делает строку читабельной для человека. Для 6го урока.
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
