package model;

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
        parking=new Car[scaner.nextInt()];
    }

    private int chechStore() {
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


    public Car sellAuto(int parkingPlace) {
        // TODO
        int minValue = 0;
        int maxValue = parking.length - 1;
        if (parkingPlace < minValue || parkingPlace > maxValue) {
            System.out.println("Parking place :" + parkingPlace + "is invalid. Must be in range :[" +
                    maxValue + " - " + maxValue);
            return null;
        }


        Car carToSale = parking[parkingPlace];
        if (carToSale == null) {
            System.out.println("No Car has been found on Parking Place :" + parkingPlace);
        }

        parking[parkingPlace] = null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;

        return carToSale;

    }

    public Car buyAuto(Car auto) {

        if (balance < auto.getPrice()) {
            System.out.println(" Impossible to buy Car . Not enought money ");
   //         return;
        }
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freeParkingPlace = i;
                break;
            }
            if (freeParkingPlace == -1) {
                System.out.println("Impossible to buy Car. No free parking places");
            }
        }

        return null;
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


}

