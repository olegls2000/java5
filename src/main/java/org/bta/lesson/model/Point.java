package org.bta.lesson.model;

import org.bta.lesson.annotation.BtaNumber;

public class Point {
    private Long id;

    @BtaNumber(min = 0, max = 99)
    private int x;

    @BtaNumber(min = -99, max = 0)
    private int y;

    public Point() {
    }

    @Override
    public String toString() {
        return "Point{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


