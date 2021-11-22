package org.bta.lesson.lesson10.HomeWork;

import java.io.IOException;

public class VehoAutoSalon implements AutoSalonApi<Car>{

    private static final double INTEREST = 1.2;
    private static final int PARKING_PLACES = 8;
    private long balance;

    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];

    public VehoAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public int bayVehicle(Car vehicle) {
        return 0;
    }

    @Override
    public double sellVehicle(int i) throws InvalidParkingPlaceException {
        if (i >= PARKING_PLACES || i < 0) {
            throw new InvalidParkingPlaceException("Invalid parking place: " + i +
                    "! Must be: 0.." + PARKING_PLACES);
        }
        final AbstractVehicle vehicleForSale = parking[i];
        if (vehicleForSale == null) {
            throw new InvalidParkingPlaceException("No vehicle on place : " + i);
        }

        parking[i] = null;
        double salesPrice = vehicleForSale.getPrice() * INTEREST;
        balance = balance + (long) salesPrice;

        return salesPrice;
    }

    @Override
    public void report() {

    }

    @Override
    public Number testMethod(Car... o) throws IOException {

        int argsLenght = o.length;
        Car car = o[0];
        return null;
    }

    public static class InvalidParkingPlaceException extends Exception {
        public InvalidParkingPlaceException(String message) {
            super(message);
        }
    }
}
