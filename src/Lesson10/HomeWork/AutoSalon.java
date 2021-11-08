package Lesson10.HomeWork;

public interface AutoSalon {
    void buyVehicle(AbstractVehicle abstractVehicle);

    double sellCar(int place) throws VehoAutoSalon.InvalidParkingPlaceException;

    void report();


}
