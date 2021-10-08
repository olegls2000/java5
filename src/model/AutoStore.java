package model;
import model.Car;

public class AutoStore {
    private static final double INTEREST = 1.2;

    private static long balance = 500000;
    public Car[] parking = new Car[5];

    public AutoStore(long balance) {
        this.balance = balance;

    }

    @Deprecated
    public void addCar(Car car, int place) {
        parking[place] = car;

    }

    public Car sellAuto(int parkingPlace) {
        int minValue = 0;
        int maxValue = parking.length - 1;

        if (parkingPlace < minValue || parkingPlace >= maxValue) {
            System.out.println("Parking place: " + parkingPlace + " is invalid. " +
                    "Must be in range: [" +
                    minValue + ", " + maxValue + "]");
            return null;
        }

        Car carToSale = parking[parkingPlace];
        if (carToSale == null) {
            System.out.println("No car has been found in parking place: " + parkingPlace);
            return null;
        }

        parking[parkingPlace] = null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;
        return carToSale;

    }

    public int buyAuto(Car auto) {
        // TODO
        // check free place, balance, auto not null
        int counter = 0;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                counter++;
                counter = parking.length; ;
            }
            System.out.println("Number of free places is : " + counter);
        }
        return counter;

    }

    public void report() {
        //TODO add parking state
        // add toString to Car class


        System.out.println(" Balance :" + balance + " EURO");
        System.out.println("Number of cars for sale : " + (parking.length));
        System.out.println(" Number of free places on parking is : " + parking.length);
    }
}
