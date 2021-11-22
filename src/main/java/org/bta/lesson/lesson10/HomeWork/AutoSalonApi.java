package org.bta.lesson.lesson10.HomeWork;

public interface AutoSalonApi <P extends AbstractVehicle>{
    int bayVehicle(P vehicle);

    double sellVehicle(int place) throws VehoAutoSalon.InvalidParkingPlaceException;

    void report();

    Number testMethod(P... o) throws Exception;
}
