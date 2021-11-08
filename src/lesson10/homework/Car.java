package lesson10.homework;

import java.time.LocalDate;

public class Car extends AbstractVehicle {
    private int seats;

    //Легкового: ПассажироМестаКоэфПассажиромест - возрастАвтомобиляКоэфВозраста+техничСостояние*КоэфТехнСостояния
    @Override
    public int getPrice() {
        int result = this.seats * 150;
        int age = LocalDate.now().getYear() - getReleaseDate().getYear();
        result += age * 8;
        result += getTechState() * 100;
        return result;
    }

    @Override
    public int testMethod() {
        return 0;
    }

    public Car() {
        //super();
        this.seats = 4;
    }
    public Car(Manufacturer manufacturer) {
        super(manufacturer);
        this.seats = 4;
    }

}
