package org.bta.lesson.lesson10.homework;

public class VehoAutoSalon implements AutoSalonApi {

	private static final double INTEREST = 1.2;
	private static final int PARKING_PLACES = 8;
	private long balance;

	private AbstractVehicle[] parking = new AbstractVehicle[PARKING_PLACES];


	public VehoAutoSalon(long balance) {
		this.balance = balance;
	}

	@Override
	public int buyVehicle(AbstractVehicle vehicle) {
		final int carPrice = vehicle.getPrice();
		if (balance < carPrice) {
			System.out.println("Not sufficient balance!!!");
			return -1;
		}
		int freeParkingSpot = -1;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i] == null) {
				freeParkingSpot = i;
				break;
			}
		}
		if (freeParkingSpot == -1) {
			System.out.println("No free parking places!!!");
			return -1;
		}
		balance -= carPrice;
		parking[freeParkingSpot] = vehicle;
		return freeParkingSpot;
	}


	@Override
	public double sellVehicle(int i) throws InvalidParkingPlaceException {
		if (i >= PARKING_PLACES || i < 0) {
			throw new InvalidParkingPlaceException("Invalid parking place: " + i +
					"! Must be : 0 .." + PARKING_PLACES);
		}
		final AbstractVehicle vehicleForSale = parking[i];
		if (vehicleForSale == null) {
			throw new InvalidParkingPlaceException("No vehicle on place: " + i);
		}
		parking[i] = null;
		double salesPrice = vehicleForSale.getPrice() * INTEREST;
		balance = balance + (long) salesPrice;

		return 0;
	}


	@Override
	public void report() {
		//TODO
	}

	@Override
	public Integer testMethod(Object o) {
		return null;

	}

	public static class InvalidParkingPlaceException extends Exception {
		public InvalidParkingPlaceException(String message) {
			super(message);
		}
	}
}
