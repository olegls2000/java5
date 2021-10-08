package model;

import java.util.Scanner;

public class AutoStore {
	private static final double INTEREST = 1.2;

	private long balance;
	private Car[] parking;

	public AutoStore() {
		final var scanner = new Scanner(System.in);
		System.out.println("Please input initial balance for Auto Store: ...");
		this.balance = scanner.nextInt();
		System.out.println("Please input initial parking slots amount for Auto Store: ...");
		parking = new Car[scanner.nextInt()];
	}

	public Car sellAuto(int parkingPlace) {
		int minValue = 0;
		int maxValue = parking.length - 1;
		if (parkingPlace < minValue || parkingPlace > maxValue) {
			System.out.println("Parking place: " + parkingPlace + " is invalid. " +
					"Must be in range: [" +
					minValue + ", " + maxValue + "]");
			return null;
		}
		Car carToSale = parking[parkingPlace];
		if (carToSale == null) {
			System.out.println("No Car has been found on Parking Place: " + parkingPlace);
			return null;
		}
		parking[parkingPlace] = null;
		double income = carToSale.getPrice() * INTEREST;
		balance += income;

		return carToSale;
	}

	public void buyAuto(Car auto) {
		if (balance < auto.getPrice()) {
			System.out.println("Not sufficient balance (" + balance + "). Required: " + auto.getPrice() + "EUR");
			return;
		}
		int freeParkingPlace = -1;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == null) {
				freeParkingPlace = 1;
				break;
			}
		}
		if (freeParkingPlace == -1) {
			System.out.println("Impossible to buy a Car. No free parking places");
		}
	}
	public void report() {
		System.out.println("Balance: " + balance);
	}
}
