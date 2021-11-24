package org.bta.lesson.model;

//Incapsulation !!!!

import org.bta.lesson.annotation.BtaNumber;

public class Point {

    @BtaNumber(min = 0, max = 99)
    private int x;

    @BtaNumber(min = -99, max = 0)
    private int y;

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


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
