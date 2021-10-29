package lesson10;

import utils.BtaUtils;

public class Circle implements WithPerimeter, WithArea {
    private int radius;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "perimeter" + getPerimeter() +
                '}';
    }

    public Circle() {
        this.radius = BtaUtils.getRandom(3, 7);
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
