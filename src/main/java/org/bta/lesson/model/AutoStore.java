package org.bta.lesson.model;

import org.bta.lesson.exception.UnsuffisientBalanceException;
import org.bta.lesson.exception.UnsuffisientPlacesException;

import java.util.Scanner;

public class AutoStore {
    private static final double INTEREST = 1.2;
    private long balance;
    private Car[] parking = new Car[5];

    public AutoStore() {
        final var scaner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input initial balance for Auto store....");
        this.balance = scanner.nextInt();
        System.out.println("Please input initial parking places Auto store....");
        parking = new Car[scaner.nextInt()];
    }

    private int checkStore() {
        int counter = 0;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                counter++;
            }
            System.out.println("Number of free places is : " + counter);
        }
        return counter;
    }

    @Deprecated
    public void addCar(Car car, int place) {
        parking[place] = car;
    }


    public Car sellAuto(int parkingPlace) throws UnsuffisientPlacesException {

        int minValue = 0;
        int maxValue = parking.length - 1;
        if (parkingPlace < minValue || parkingPlace > maxValue) {
            System.out.println("Parking place: " + parkingPlace + " is invalid. " +
                    "Must be in range: [" +
                    minValue + ", " + maxValue + "]");
            return null;
        }
        Car carToSale = parking[parkingPlace];
        if (carToSale == null) {
    //        System.out.println("No Car has been found on Parking Place: " + parkingPlace);
            throw new UnsuffisientPlacesException("No places!!");
            //           return null;
        }
        parking[parkingPlace] = null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;

        System.out.println("Successfully sold out!!!");
        return carToSale;
    }

    public void buyAuto(Car auto) throws UnsuffisientBalanceException, UnsuffisientPlacesException {
        if (balance < auto.getPrice()) {
            System.out.println("Impossible to buy a Car. Not sufficient balance (" + balance + "). Required: " + auto.getPrice() + "EUR");
            throw new UnsuffisientBalanceException("No Money!");
            //           return;
        }
        int freeParkingPlace = getFreeParkingPlace();
        if (freeParkingPlace == 10) {
            System.out.println("Impossible to buy a Car. No free parking places");
            throw new UnsuffisientPlacesException("No Places!");
            //           return;
        }
        parking[freeParkingPlace] = auto;
        balance -= auto.getPrice();
    }

    private int getFreeParkingPlace() {
        int freeParkingPlace = 10000;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freeParkingPlace = i;
                break;
            }
        }
        return freeParkingPlace;
    }


    public void stateOfAutoStore() {
//toString to Car class
        System.out.println(" Balance :" + balance + " EURO");
        System.out.println("Number of cars for sale : " + (parking.length));
        System.out.println(" Number of free places on parking is : ");
        System.out.println("CAR          PRICE           WEIGHT            COLOUR");
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] != null) {

                System.out.println("Car " + i + "        " + "         " + "         ");
            }
        }

    }

    public void report() {
        System.out.println("Balance: " + balance);
        //TODO add parking state
        // add toString to Car class
    }

}

