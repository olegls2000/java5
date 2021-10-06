package lesson9;

import model.*;

public class ClassWork<maxSalaryWorker> {
	public static void main(String[] args) {
		Car bmw = new Car(100, 1500);
		Car toyota = new Car(5000, 1500);
		Car honda = new Car(6000, 1500);
		AutoStore autoStore = new AutoStore(5_000);
		autoStore.addCar(bmw, 0);
		autoStore.addCar(toyota, 1);
		autoStore.addCar(honda, 2);

		autoStore.sellAuto(0);
		autoStore.sellAuto(6);
		autoStore.sellAuto(1);

		Director dir1 = new Director(200_000, "TT", "TT");
		Director dir2 = new Director(400_000, "TT", "TT");
		Director dir3 = new Director(300_000, "TT", "TT");

		Slave slave1 = new Slave(30_000, "S");
		Slave slave2 = new Slave(60_000, "S");
		Slave slave3 = new Slave(70_000, "S");
	}
	AbstractWorker maxSalaryWorker = workers[0];
       for (AbstractWorker worker : workers) {
		if (worker.getSalary() > maxSalaryWorker.getSalary()) {
			maxSalaryWorker = worker;
		}
	}
        System.out.println("Worker with max salary is: " + maxSalaryWorker);
        System.out.println("Worker type: " + maxSalaryWorker.getClass().getSimpleName());
	}
	}
}
