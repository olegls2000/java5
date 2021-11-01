package lesson10.homework;

import utils.BtaUtils;

public class Truck extends AbstractVehicle {
	private static final int MIN_PAYLOAD = 2500;
	private static final int MAX_PAYLOAD = 4500;

	private int payload;

	public Truck(int payload) {
		super();
		this.payload = BtaUtils.getRandom(MIN_PAYLOAD, MAX_PAYLOAD);
	}

	public int getPayload() {
		return payload;
	}

	public void setPayload(int payload) {
		this.payload = payload;
	}

	@Override
	public int getPrice() {
		return 0;
	}
}

