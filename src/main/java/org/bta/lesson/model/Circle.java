package org.bta.lesson.model;

import org.bta.lesson.utils.BtaUtils;

public class Circle {
	int radius;
	public Circle(){
		System.out.println("Random radius ..");
		radius = BtaUtils.getRandom(20,30);
	}
	public double getLenght(){
		return Math.PI * this.radius;
	}
}

