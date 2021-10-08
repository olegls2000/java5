package model;

public class AutoStore {
    private static final double INTEREST = 1.2;

    private long balance;
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

    public void buyAuto(Car auto) {
        // TODO
        // check free place, balance, auto not null
        if (parking == null) {

        }
    }

    public void report(){
        System.out.println("Balance: " + balance);
        //TODO add parking state
        // add toString to Car class
    }

}
