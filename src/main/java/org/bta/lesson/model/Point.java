package org.bta.lesson.model;


import org.bta.lesson.annotation.BtaNumber;

public class Point {
	@BtaNumber(min = 0, max = 99)
	private int x;

	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
