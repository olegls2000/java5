package lesson10.homework;

public class VehoAutoSalon implements AutoSalonApi{
    private static final int PARKING_PLACES = 8;
    private long balance;
    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];

    public VehoAutoSalon(long balance){
        this.balance = 100;
    }


    @Override
    public int buyVehicle(AbstractVehicle abstractVehicle) {
        return 0;
    }

    @Override
    public int sellVehicle(int i) {
      //  if(i>=)
        return 0;
    }
}
