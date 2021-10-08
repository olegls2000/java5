package model;
import java.util.*;

public class AutoStore {
    private long balance;
    private Car[] parking = new Car[5];
    private static final double INTEREST = 1.2;

    public AutoStore() {
        this.balance = balance;
        final var scanner = new Scanner(System.in);
        System.out.println("Please input initial balance for Auto Store");
        this.balance = scanner.nextInt();
        System.out.println("please input initial parking slots amount for Auto Store");
        parking = new Car[scanner.nextInt()];
    }



    public void addCar(Car car, int place){
        parking[place] = car;
    }

    public Car sellAuto (int parkingPlace){
        int minValue = 0;
        int maxValue = parking.length-1;

        if (parkingPlace < minValue || parkingPlace > maxValue){
            System.out.println("Parking place: " +
                    parkingPlace + "is invalid. Must be in range: [" +
                    minValue + " - " + maxValue + "]");
            return null;
        }
        Car checkCarToSale = parking[parkingPlace];
        if(checkCarToSale == null){
            System.out.println("No Car has been found on parking place: " +  parkingPlace);
        }


        Car carToSale = parking[parkingPlace];
        parking[parkingPlace]=null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;
        return carToSale;
    }

    public void report (){
        System.out.println("Balance: " + balance);
        //TODO add parking state
    }

    public void buyAuto (Car auto){
        if(balance < auto.getPrice()){
            System.out.println("No sufficient balance (" + balance+ "). Required: " + auto.getPrice());
        }

        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if(parking[i] == null){
                freeParkingPlace =i;
                break;
            }
        }
        if(freeParkingPlace == -1){
            System.out.println("Impossible to buy a car. No free parking places");
        }

        parking[freeParkingPlace]= auto;
        balance -= - auto.getPrice();

    }

    private int getFreeParkingPlace(){
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null){
                freeParkingPlace = i;
            }
        }
        return freeParkingPlace;
    }

    }
