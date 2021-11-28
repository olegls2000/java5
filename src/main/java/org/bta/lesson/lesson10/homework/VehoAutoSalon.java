package org.bta.lesson.lesson10.homework;

public class VehoAutoSalon implements AutoSalonApi {

    private static final int PARKING_PLACES = 8;
    private long balance;

    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];


    public VehoAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public int buyVehicle(AbstractVehicle vehicle) {
        final int carPrice = vehicle.getPrice();
        if (balance < carPrice) {
            System.out.println("Not sufficient balance!!!");
            return -1;
        }
        int freeParkingSpot = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freeParkingSpot = i;
                break;
            }
        }
        if (freeParkingSpot == -1) {
            System.out.println("No free parking places!!!");
            return -1;
        }
        balance -= carPrice;
        parking[freeParkingSpot] = vehicle;

        return freeParkingSpot;
    }

    @Override
    public int sellVehicle(int i) {
        if (i >= PARKING_PLACES || i < 0) {
            //TODO ...
        }
        return 0;
    }

    @Override
    public void report() {

    }
}
