package lesson10.homework;

public class HomeWorkMain {

    public static void main(String[] args) {
        lesson10.homework.Car car1 = new lesson10.homework.Car();
        //AbstractVehicle abstractVehicle = new AbstractVehicle();
        lesson10.homework.AutoSalonApi autoSalon = new VehoAutoSalon(600_000);
        autoSalon.buyVehicle(car1);
        autoSalon.report();
        autoSalon.sellVehicle(1);
        autoSalon.sellVehicle(0);
    }
}
