package model;

public class AutoStore {
    private long balance;
    private Car[] parking = new Car[5];

    public AutoStore(long balance) {
        this.balance = balance;
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


    public Car sellAuto(int parkingPlace) {
        // TODO
        private long sellPrice;


        return null;

    }

    public Car buyAuto(Car auto) {
        // TODO


    }


    public stateOfAutoStore() {

        System.out.println(" Balance :" + balance + " EURO");
        System.out.println("Number of cars for sale : " + (parking.length - counter));
        System.out.println(" Number of free places on parking is : " + counter);
        System.out.println( "CAR          PRICE           WEIGHT            COLOUR");
        for (int i = 0; i < parking.length; i++) {
            if (parking[i]!= null ) {

                System.out.println("Car "+ i + "        " + "         "+ "         "+ );
            }
        }

    }


}
