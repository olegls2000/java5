package lesson10.homework;

public interface AutoSalonApi {
	int buyVehicle(AbstractVehicle vehicle);

	double sellVehicle(int i) throws VehoAutoSalon.InvalidParkingPlaceException;

	void report();

	Number testMethod(Object o);
}
