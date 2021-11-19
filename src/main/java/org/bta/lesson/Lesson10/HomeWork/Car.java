package org.bta.lesson.Lesson10.HomeWork;

import org.bta.lesson.utils.BtaUtils;


public class Car extends AbstractVehicle {
    private int seats;

    public Car (){
        super();
        this.seats = BtaUtils.getRandom(4, 7);
    }

    public Car(Manufacturer bmw) {

    }
}
