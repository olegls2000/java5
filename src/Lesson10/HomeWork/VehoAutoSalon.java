package Lesson10.HomeWork;

public class VehoAutoSalon implements AutoSalon{

    private static final int PARKING_PLACES = 0;
    private long balance;
    private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];

    public VehoAutoSalon(long balance){

    }

    @Override
    public int buyVehicle(AbstractVehicle abstractVehicle) {
        int freeParkingPlace = -1;
        for (int i = 0; i < parking.length; i++) {
            if(parking[i] == null){
                freeParkingPlace =i;
                break;
            }
    }

    @Override
    public int sellCar(int i) {
        if (i >= PARKING_PLACES || i < 0){

        }
        return 0;
    }

    @Override
    public void report(){
        //TODO
    }
}
