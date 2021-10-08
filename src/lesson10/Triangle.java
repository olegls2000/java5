package lesson10;

import lesson10.interfaces.WithPerimeter;
import utils.BtaUtils;

public class Triangle implements WithPerimeter {

    private int side;

    public Triangle() {
        side = BtaUtils.getRandom(3, 8);
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
