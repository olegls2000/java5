package model;
import utils.BtaUtils;

public class Circle {
    int radius;
    public Circle() {
        radius = BtaUtils.getRandom(20, 30);
        System.out.println("Random radius .. " + radius);
    }


    // Найти круг, с самой большой длинной окружности

    public double getLength() {
        return Math.PI * this.radius;
    }

}
