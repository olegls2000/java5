package org.bta.lesson.Lesson10.HomeWork;

import org.bta.lesson.utils.BtaUtils;

public class Truck extends AbstractVehicle{
    private int payload;

    public Truck(){
        super();
        this.payload = BtaUtils.getRandom(4000, 10000);
    }
}
