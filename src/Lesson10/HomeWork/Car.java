package Lesson10.HomeWork;

import utils.BtaUtils;

public class Car extends AbstractVehicle {
    private int seats;

    public Car (){
        super();
        this.seats = BtaUtils.getRandom(4, 7);
    }

    public Car(Manufacturer bmw) {

    }
}
