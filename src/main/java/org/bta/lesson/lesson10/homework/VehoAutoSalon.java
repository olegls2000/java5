package org.bta.lesson.lesson10.homework;

public class VehoAutoSalon implements AutoSalonApi {
    private static final double INTEREST = 1.2;
    private static final int PARKING_PLACES = 8;
    private long balance;
    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];

    public VehoAutoSalon(long balance) {
        this.balance = 100;
    }


    @Override
    public double buyVehicle(AbstractVehicle abstractVehicle) {
        return 0;
    }

    @Override
    public double sellVehicle(int i) throws InvalidParkingPlaceException {
        if (i >= PARKING_PLACES || i < 0) {
            throw new InvalidParkingPlaceException(" Invalid parking places " + i);
        }
        final AbstractVehicle vehicleForSale = parking[i];
        if (vehicleForSale == null) {
            throw new InvalidParkingPlaceException(" No vehicle on place : " + i);
        }
//prodaga mashiny
        parking[i] = null;
        double salesPrice=vehicleForSale.getPrice()*INTEREST;
        balance = balance + (long) salesPrice;


        return salesPrice;
    }

    @Override
    public Long testMethod(Object o) {
        return null;
    }

    public void report() {
        //TODO

    }


    public static class InvalidParkingPlaceException extends Exception {
        public InvalidParkingPlaceException(String message) {
            super(message);
        }
    }


}
