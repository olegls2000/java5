package lesson10.HomeWork;

public class Car extends AbstractVehicle {
    private int seats;

    public Car(int seats) {
        super();
        //TODO add random value
        this.seats = getSeats();
    }
}
