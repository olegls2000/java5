package org.bta.lesson.lesson10;


import org.bta.lesson.lesson10.interfaces.WithArea;
import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class Circle implements WithPerimeter, WithArea {
    private int radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "perimeter = " + getPerimeter();
    }

    public Circle() {
        this.radius = BtaUtils.getRandom(3, 7);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
