package org.bta.lesson.lesson10;

import org.bta.lesson.lesson10.homework.AbstractVehicle;

import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

import java.io.Serializable;

public class Triangle implements WithPerimeter {

    private int side;

    public Triangle() {
        side = BtaUtils.getRandom(3, 8);
    }

    public Triangle(int side) {
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 3 * side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}' + "perimeter = " + getPerimeter();
    }
}
