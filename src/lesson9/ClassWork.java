package lesson9;

import model.AbstractWorker;
import model.AutoStore;
import model.Car;
import model.specific.Director;
import model.Slave;

public class ClassWork {
    public static void main(String[] args) {
        Car bmw = new Car(3000, 1500);
        Car toyota = new Car(5000, 1500);
        Car honda = new Car(6000, 1500);
        final var autoStore = new AutoStore();
        autoStore.buyAuto(bmw);
        autoStore.buyAuto(toyota);
        autoStore.buyAuto(honda);

        autoStore.report();
        autoStore.sellAuto(0);
        autoStore.report();
        autoStore.sellAuto(4);
        autoStore.report();
        autoStore.sellAuto(1);
        autoStore.report();

        AbstractWorker dir1 = new Director(200_000, "TT", "TT");
        AbstractWorker dir2 = new Director(400_000, "TT", "TT");
        Director dir3 = new Director(300_000, "TT", "TT");
        //Director[] directors = {dir1, dir2, dir3};

        AbstractWorker slave1 = new Slave(700_000, "S");
        Slave slave2 = new Slave(60_000, "S");
        Slave slave3 = new Slave(70_000, "S");
        //Slave[] slaves = {slave1, slave2, slave3};
        Object obj = new Object();
        AbstractWorker[] workers = {slave1, slave2, slave3, dir1, dir2, dir3/*, obj*/};
        Object[] objects = {slave1, slave2, slave3, dir1, dir2, dir3};

        AbstractWorker maxSalaryWorker = workers[0];
        for (AbstractWorker worker : workers) {
            if (worker.getSalary() > maxSalaryWorker.getSalary()) {
                maxSalaryWorker = worker;
            }
        }
        Class classReference = maxSalaryWorker.getClass();
        String simpleName = classReference.getSimpleName();
        String fullName = classReference.getName();

        System.out.println("Worker with max salary is: " + maxSalaryWorker);
        System.out.println("Worker Type: " + classReference.getSimpleName());

        if (maxSalaryWorker instanceof Director) {
            System.out.println("Our rich guy is Director");
            Director rich = (Director) maxSalaryWorker;
            rich.getDepartment();
            //maxSalaryWorker.getDepartment();
        } else if (maxSalaryWorker instanceof Slave) {
            System.out.println("Our rich guy is Slave");
            Slave rich = (Slave) maxSalaryWorker;
        }
    }
}
