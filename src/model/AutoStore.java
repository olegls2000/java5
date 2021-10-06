package model;

public class AutoStore {
    private static final double INTEREST = 1.2;
    private long balance;
    private Car[] parking = new Car[5];

    public AutoStore(long balance) {
        this.balance = balance;
    }

    public void addCar(Car car, int place) {
        parking[place] = car;
    }

    public Car sellAuto(int parkingPlace) {
        int minValue = 0;
        int maxValue = parking.length - 1;
        if (parkingPlace < minValue || parkingPlace > maxValue) {
            System.out.println("Parking place is " + parkingPlace + " is invalid. Must be range: [" + minValue + ", " + maxValue + "]");
        return null;
        }
    }


    public Car sellAuto(int parkingPlace) {
        Car carToSale = parking[parkingPlace];
        parking[parkingPlace] = null;
        double income = carToSale.getPrice() * INTEREST;
        balance += income;
        return carToSale;
    }

    public void buyAuto(Car auto) {
        // TODO
    }
}
