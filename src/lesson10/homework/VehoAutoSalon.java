package lesson10.homework;

public class VehoAutoSalon implements AutoSalonApi {

    private static final int PARKING_PLACES = 8;
    private long balance;

    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];


    public VehoAutoSalon(long balance) {
        this.balance = balance;
    }

    @Override
    public int buyVehicle(AbstractVehicle vehicle) {
        return 0;
    }

    @Override
    public int sellVehicle(int i) {
        if (i >= PARKING_PLACES || i < 0) {
            //TODO ...
        }
        return 0;
    }

    @Override
    public void report() {

    }
}
