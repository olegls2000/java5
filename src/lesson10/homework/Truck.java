package lesson10.homework;

public class Truck extends AbstractVehicle  {

    private int carrying;

    @Override
    public int getPrice() {
        return 0;
    }

    public Truck() {
        super();
        //TODO add random value
        this.carrying = 10000;
    }
}