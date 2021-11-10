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

	public Car sellAuto(int parkingPlace) throws UnsuffisientPlacesException {

		int minValue = 0;
		int maxValue = parking.length - 1;
		try {
			if (parkingPlace < minValue || parkingPlace > maxValue) {
				throw new UnsuffisientPlacesException("Parking place: " +
						parkingPlace + " is invalid. " +
						"Must be in range: [" +
						minValue + ", " + maxValue + "]");
			}
			Car carToSale = parking[parkingPlace];
			if (carToSale == null) {
				throw new UnsuffisientPlacesException("No Car has been found on Parking Place: " + parkingPlace);
			}
		} catch (UnsuffisientPlacesException e) {
			System.out.println("No Car has been found on parking place: " + parkingPlace);

		}
		Car carToSale = parking[parkingPlace];
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
	public void buyAuto (Car auto) throws UnsuffisientPlacesException, UnsuffisientBalanceExeption {
		try {
			if(balance < auto.getPrice()){
				throw new UnsuffisientBalanceExeption ("No sufficient balance (" + balance+ "). Required: " + auto.getPrice());
			}
		} catch (Exception e) {
			System.out.println("No sufficient balance (" + balance+ "). Required: " + auto.getPrice());;
		}

		int freeParkingPlace = -1;
		for (int i = 0; i < parking.length; i++) {
			if(parking[i] == null){
				freeParkingPlace =i;
				break;
			}
		}
		try {
			if(freeParkingPlace == -1){
				throw new UnsuffisientPlacesException("Impossible to buy a car. No free parking places");
			}
		} catch (UnsuffisientPlacesException e) {
			System.out.println("Impossible to buy a car. No free parking places");
		}

		parking[freeParkingPlace]= auto;
		balance -= - auto.getPrice();

	}

	private int getFreeParkingPlace(){
		int freeParkingPlace = -1;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == null){
				freeParkingPlace = i;
			}
		}
		return freeParkingPlace;
	}

}

