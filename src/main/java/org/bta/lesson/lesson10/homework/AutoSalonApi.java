package org.bta.lesson.lesson10.homework;

public interface AutoSalonApi<P extends AbstractVehicle> {
    int buyVehicle(P vehicle);

    double sellVehicle(int place) throws VehoAutoSalon.InvalidParkingPlaceException;

    void report();

    Number testMethod(P... o)throws Exception ;
}
