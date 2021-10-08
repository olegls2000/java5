package model;
import java.util.Scanner; //!!!!!!///

public class AutoStore {
    private static final double INTEREST = 1.2;

    private long balance;
    private Car[] parking;

    public AutoStore() {
        final var scanner = new Scanner(System.in);
        System.out.println("Please input initial balance for Auto Store");
        this.balance = scanner.nextInt();
        System.out.println("Please input initial parking slots amount for Auto Store");
        parking = new Car[scanner.nextInt()];
    }


    public Car sellAuto(int parkingPlace) {
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
            System.out.println("No Car has been found on Parking Place: " + parkingPlace);
            return null;
        }
        parking[parkingPlace] = null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;

        System.out.println("Successfully sold out!!!");
        return carToSale;
    }

    public void buyAuto(Car auto) {
        // TODO
        //check free place, balance, auto not null
        if (balance < auto.getPrice()) {
            System.out.println("Impossible to buy a Car. Not sufficient balance: (" + balance + "). Required: " + auto.getPrice() + "EUR");
            return;
        }
        int freeParkingPlace = getFreeParkingPlace();
        if(freeParkingPlace < 0) {
            System.out.println("Impossible to buy a Car. No free parking places.");
            return;
        }
        parking[freeParkingPlace] = auto;
        balance -= auto.getPrice();
    }

    private int getFreeParkingPlace() {
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if(parking[i] == null) {
                freeParkingPlace = i;
                break;
            }
        }
        return freeParkingPlace;
    }

    public void report(){
        System.out.println("Balance: " + balance);
        //TODO add parking state
        // add toString to Car class
    }
}
