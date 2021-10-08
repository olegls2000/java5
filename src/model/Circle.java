package model;

import utils.BtaUtils;

public class Circle {

	private int radius;

	public Circle() {
		System.out.println("Random radius ..");
		radius = BtaUtils.getRandom(20, 30);
	}

	public double getLength() {
		return Math.PI * this.radius;
	}
}

