package lesson10;

import lesson10.interfaces.WithPerimeter;
import utils.BtaUtils;

public class Square implements WithPerimeter {

    private int side;

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'  + "perimeter = " + getPerimeter();
    }

    public Square() {
        this.side = BtaUtils.getRandom(3, 6);
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
