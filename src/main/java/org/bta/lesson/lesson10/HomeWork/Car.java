package org.bta.lesson.lesson10.HomeWork;

public class Car extends AbstractVehicle {
    private int seats;

    public Car(int seats) {
        super();
        //TODO add random value
        this.seats = getSeats();
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    int testMethod() {
        return 0;
    }

    public Car(Manufacturer manufacturer) {
        super(manufacturer);
        this.seats = 4;
    }

}
