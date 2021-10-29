package lesson10.homework;

import utils.BtaUtils;

import java.time.*;

public abstract class AbstractVehicle {
    private static final int MIN_TECH_STATE = 0;
    private static final int MAX_TECH_STATE = 100;

    private LocalTime localTime = LocalTime.of(22, 10, 23);
    private LocalDate releaseDate = LocalDate.of(2009, 10, 20);
    //private LocalDateTime LocalDateTime = null;
    //private ZonedDateTime zonedDateTime = ZonedDateTime.of(releaseDate, localTime, ZoneId.of("UTC"));
    private int techState;
    private Manufacturer manufacturer;

    public AbstractVehicle() {
        //TODO add random values
        this.releaseDate = LocalDate.of(2009,3,20);
        this.techState = BtaUtils.getRandom(MIN_TECH_STATE,MAX_TECH_STATE);
        this.manufacturer = Manufacturer.values()[Manufacturer.values().length-1];
    }

    //TODO getter setter


}
