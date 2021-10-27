package Lesson10;

import Lesson10.Interfaces.WithPerimeter;
import utils.BtaUtils;

public class Triangle implements WithPerimeter {
    private int side;

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                '}' + " perimeter " + getPerimeter();
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    public Triangle (){
        side = BtaUtils.getRandom(3,8);
    }
}
