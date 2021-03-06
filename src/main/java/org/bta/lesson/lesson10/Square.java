package org.bta.lesson.lesson10;


import org.bta.lesson.lesson10.interfaces.WithPerimeter;
import org.bta.lesson.utils.BtaUtils;

public class Square implements WithPerimeter {

    private int side;

    public Square() {
        this.side = BtaUtils.getRandom(3, 6);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + "perimeter = " + getPerimeter();
    }
}
