package org.bta.lesson.Lesson10;



import org.bta.lesson.Lesson10.Interfaces.WithArea;
import org.bta.lesson.Lesson10.Interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class Square implements WithPerimeter, WithArea {
    private int side;

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + "perimeter = " + getPerimeter();
    }

    public Square() {
        this.side = BtaUtils.getRandom(3,8);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
