package lesson10;

import lesson10.interfaces.WithArea;
import lesson10.interfaces.WithPerimeter;
import utils.BtaUtils;

public class Circle implements WithPerimeter, WithArea {
    private int radius;

    @Override /// home work!!!!
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + "perimeter = " + getPerimeter();
    }

    public Circle() {
        this.radius = BtaUtils.getRandom(3, 7);
    }


    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

}
