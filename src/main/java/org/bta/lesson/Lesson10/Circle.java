package org.bta.lesson.Lesson10;



import org.bta.lesson.Lesson10.Interfaces.WithArea;
import org.bta.lesson.Lesson10.Interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class Circle implements WithPerimeter, WithArea {

    private int radius;

    public Circle() {
        this.radius = BtaUtils.getRandom(3, 7);
    }

    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + " perimeter = " + getPerimeter();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius/2;
    }
}
