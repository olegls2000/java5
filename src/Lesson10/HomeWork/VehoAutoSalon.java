package Lesson10.HomeWork;

public class VehoAutoSalon implements AutoSalon {

    private static final int PARKING_PLACES = 0;
    private long balance;
    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];
    public static final double INTEREST = 1.2;

    public VehoAutoSalon(long balance) {

    }

    @Override
    public void buyVehicle(AbstractVehicle abstractVehicle) {
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == null) {
                freeParkingPlace = i;
                break;
            }
        }
    }

    @Override
    public double sellCar(int i) throws InvalidParkingPlaceException {
        if (i >= PARKING_PLACES || i < 0) {
            throw new InvalidParkingPlaceException("Invalid parking place: " + i + "! must be: 0 .." + PARKING_PLACES);
        }

        final AbstractVehicle vehicleForSale = parking[i];
        if (vehicleForSale == null) {
            throw new InvalidParkingPlaceException("No vehicle on place:  " + i);
        }
        parking[i] = null;
        double salesPrice = vehicleForSale.getMinMaxPrice() * INTEREST;
        balance = balance + (long) salesPrice;
        return salesPrice;
    }

    @Override
    public void report() {
        System.out.println("Balance " + balance);
        //TODO....
    }


    public static class InvalidParkingPlaceException extends Exception {
        public InvalidParkingPlaceException(String message) {
            super(message);
        }
    }
}