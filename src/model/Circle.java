package model;

import utils.BtaUtils;package ;



public class Circle {
    int radius;
    public Circle(){
        System.out.println("Random radius...");
        radius = BtaUtils.getRandom(20,30);
    }

    public  double getlenght(){
        return Math.PI * this.radius;

    }
}
