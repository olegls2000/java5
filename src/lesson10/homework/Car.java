package lesson10.homework;

import utils.BtaUtils;

public class Car extends AbstractVehicle{
	private int seats;

	public Car() {
		super();
		//TODO add random value
		this.seats = BtaUtils.getRandom(0, 4);
	}
}
