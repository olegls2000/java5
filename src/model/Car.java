package model;

import java.util.Map;

public class Car {
	private static final int MIN_PRICE = 80_000;
	private static final int MAX_PRICE = 400_000;
	private static final int MIN_WEIGHT = 1200;
	private static final int MAX_WEIGHT = 2500;

	private int price;
	private int weight;

	public Car(int price, int weight) {
		priceCheck(price);
		this.price = price;
		this.weight = weight;
	}

	public Car() {

	}

	private void priceCheck(int price) {
		if (price < MIN_PRICE || price > MAX_PRICE) {
			System.out.println("Car price (" + price + " EURO) is invalid! " +
					"Must be in a range [" + MIN_PRICE + "," + MAX_PRICE + "]");
			throw new RuntimeException();
		}
	}

	public void setPrice(int price) {
		priceCheck(price);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setWeight(int weight) {
		weightCheck(weight);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	private void weightCheck(int weight) {
		if (weight < MIN_WEIGHT || weight > MAX_WEIGHT) {
			System.out.println("Car weight (" + weight + "Kg) is invalid !" +
					"Weight must be in range [" + MIN_WEIGHT + " - " + MAX_WEIGHT + "]");
			throw new RuntimeException();
		}
	}
}

