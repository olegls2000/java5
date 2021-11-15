package lesson10.homework;

public interface AutoSalonApi {

    double buyVehicle (AbstractVehicle abstractVehicle);
    double sellVehicle( int ParkingPlace) throws VehoAutoSalon.InvalidParkingPlaceException;

void report();

Number testMethod(Object o);


}
