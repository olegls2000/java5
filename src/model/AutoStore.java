package model;
import model.Car;
import java.util.Scanner;

public class AutoStore {
    private static final double INTEREST = 1.2;

    private static long balance = 500000;
    public Car[] parking = new Car[5];

    public AutoStore() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input initial balance for Auto Store...");
        this.balance = balance;
        System.out.println("Please input initial parking slots amount for Auto Store...");
        parking = new Car[scanner.nextInt()];

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

    public void buyAuto(Car auto) {
        // TODO
        // check free place, balance, auto not null
        if (balance < auto.getPrice()) {
            System.out.println("Impossible to buy a Car. Not sufficient balance (" + balance + "). Required: " + auto.getPrice() + "EUR");
            return;
        }

        int freeParkingPlace = getFreeParkingPlace();
        if (freeParkingPlace < 0) {
            System.out.println("Impossible to buy a Car. No free parking places");
        }
        parking[freeParkingPlace] = auto;
        balance -= auto.getPrice();
    }

    private int getFreeParkingPlace() {
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freeParkingPlace = 1;
                break;
            }
        }
        return freeParkingPlace;
    }

    public void report() {
        //TODO add parking state
        // add toString to Car class


        System.out.println(" Balance :" + balance + " EURO");
        System.out.println("Number of cars for sale : " + (parking.length));
        System.out.println(" Number of free places on parking is : " + parking.length);
    }
}
