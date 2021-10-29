package lesson10.homework;

import utils.BtaUtils;

import java.time.*;

public abstract class AbstractVehicle {

	private static final int MIN_TECH_STATE = 0;
	private static final int MAX_TECH_STATE = 100;
	private static final int MAX_SEATS = 7;
	private static final int MIN_SEATS = 4;
	private static final int MIN_PAYLOAD = 2500;
	private static final int MAX_PAYLOAD = 4500;
	//private LocalTime localTime = LocalTime.of(12, 55, 55);
	private LocalDate releaseDate = LocalDate.of(2009, 3, 20);
	//private LocalDateTime localDateTime = null;
	//private ZonedDateTime zonedDateTime = ZonedDateTime.of(releaseDate, localTime, ZoneId.of("UTC"));
	private int techState;
	private Manufacturer manufacturer;
	private int seats;

	public AbstractVehicle() {
		//TODO add random values
		this.releaseDate = LocalDate.of(2009, 3, 20);
		this.techState = BtaUtils.getRandom(MIN_TECH_STATE, MAX_TECH_STATE);

		Manufacturer[] allManufacturers = Manufacturer.values();
		int randomIndex = BtaUtils.getRandom(0, allManufacturers.length - 1);
		this.manufacturer = allManufacturers[randomIndex];

		this.seats = BtaUtils.getRandom(MIN_SEATS, MAX_SEATS);

	}

	//TODO getters and setters

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

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		seats = seats;
	}

	}

