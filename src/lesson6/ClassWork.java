package lesson6;

import model.Point;
import utils.BtaUtils;

public class ClassWork {
	public static void main(String[] args) {
		Human  ivan = new Human("Ivan", "Ivanov", Gender.MAN);
		Human  darja = new Human("Darja", "Petrova", Gender.WOMAN);

		//ivan.marriage(darja);
		darja.marriage(ivan);

		System.out.println();

		int i = 2;
		ClassWork.doSmth(i);
		ClassWork.doSmth(ivan);
		System.out.println("..");

		System.out.println(BtaUtils.MY_LUCKY_NUMBER);
		BtaUtils.JOE.firstName = "NewName";
		doSmth(BtaUtils.JOE);

		System.out.println(BtaUtils.JOE);

		int k = 0;
		k = 5 > 6 ? 1 : 2;
		System.out.println("K = " + k);
		Point a = new Point(1,2);
		Point b = new Point(3,4);
		double distance = BtaUtils.calculateDistance(a,b);
		System.out.println("Distance between point " + a + " and"
				+ b + " is: " +
				BtaUtils.calculateDistance(a, b));


	}

	public static void doSmth(int i) {
		//i += 2;
		i = i +2;
	}

	public static void doSmth(Human human) {
		human.lastName = "NewLastName";
		human = new Human();
	}
}