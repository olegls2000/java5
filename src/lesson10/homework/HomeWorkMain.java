package lesson10.homework;

public class HomeWorkMain {

    public static void main(String[] args) throws Exception{
        Car car1 = new Car();
        //AbstractVehicle abstractVehicle = new AbstractVehicle();
        AutoSalonApi autoSalon = new VehoAutoSalon(600_000);
        autoSalon.buyVehicle(car1);
        autoSalon.report();
        try {
            autoSalon.sellVehicle(1);
            autoSalon.sellVehicle(0);
        } catch (VehoAutoSalon.InvalidParkingPlaceException e) {
            e.printStackTrace();
        }

        autoSalon.testMethod(car1, new Car(), new Car(), car1);
    }
}
