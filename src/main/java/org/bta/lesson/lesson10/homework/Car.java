package org.bta.lesson.lesson10.homework;

import org.bta.lesson.utils.BtaUtils;


public class Car extends AbstractVehicle{
	private int seats;

	public Car(Manufacturer toyota) {
		//super();
		//TODO add random value
		this.seats = BtaUtils.getRandom(0, 4);
	}

	public Car(int i, int i1) {

	}

	@Override
	public int getPrice() {
		return 0;
	}
}
