package Lesson10.HomeWork;

import utils.BtaUtils;


import java.time.LocalDate;

public abstract class AbstractVehicle {
    private LocalDate releaseDate = LocalDate.of(2009, 3 , 20);
    private int techState = BtaUtils.getRandom(0, 100);
    private Manufacturer manufacturer;
    private int minMaxPrice = BtaUtils.getRandom(1000,25000);

    private static final int MIN_PRICE = 1000;
    private static final int MAX_PRICE = 25000;

    private static final int MIN_TECH_STATE = 0;
    private static final int MAX_TECH_STATE = 100;



    public AbstractVehicle(){
        this.releaseDate = LocalDate.of(BtaUtils.getRandom(2000, 2021), 3 ,20);
        this.techState = BtaUtils.getRandom(MIN_TECH_STATE, MAX_TECH_STATE);
        this.manufacturer = Manufacturer.values()[Manufacturer.values().length-1];
        this.minMaxPrice = BtaUtils.getRandom(MIN_PRICE,MAX_PRICE);
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTechState() {
        return techState;
    }

    public void setTechState(int techState) {
        this.techState = techState;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMinMaxPrice() {
        return minMaxPrice;
    }

    public void setMinMaxPrice(int minMaxPrice) {
        this.minMaxPrice = minMaxPrice;
    }
}
