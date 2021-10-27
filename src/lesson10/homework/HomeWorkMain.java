package lesson10.homework;

public class HomeWorkMain {

    public static void main(String[] args) {
        Car car1 = new Car();
        //AbstractVehicle abstractVehicle = new AbstractVehicle();
        AutoSalonApi autoSalon = new VehoAutoSalon(600_000);
        autoSalon.buyVehicle(car1);
        autoSalon.report();
        autoSalon.sellVehicle(1);
        autoSalon.sellVehicle(0);
    }
}
