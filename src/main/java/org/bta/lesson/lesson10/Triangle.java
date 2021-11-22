package org.bta.lesson.lesson10;

import org.bta.lesson.lesson10.interfaces.WithArea;
import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class Triangle implements WithPerimeter, WithArea {

    private int side;

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}' + "perimeter = " + getPerimeter();
    }

    public Triangle() {
        side = BtaUtils.getRandom(3, 8);
    }

    @Override
    public int getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return (side * side) / 2;
    }
}
