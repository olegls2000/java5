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

        autoStore.sellAuto(0);
        autoStore.sellAuto(4);
        autoStore.sellAuto(1);

        autoStore.report();
        autoStore.sellAuto(0);
        autoStore.report();
        autoStore.sellAuto(4);
        autoStore.report();
        autoStore.sellAuto(1);

       /* AbstractWorker dir1 = new Director(200000, "TT", "TT");
        AbstractWorker dir2 = new Director(400000, "TT", "TT");
        AbstractWorker dir3 = new Director(300000, "TT", "TT");

        AbstractWorker slave1 = new Slave(700000, "S");
        AbstractWorker slave2 = new Slave(30000, "S");
        AbstractWorker slave3 = new Slave(30000, "S");

        AbstractWorker[] workers = {slave1, slave3, slave3, dir1, dir2, dir3};
        Object[] objects = {slave1, slave2, slave3, dir1, dir2, dir3};

       AbstractWorker maxSalaryWorker = workers[0];
       for (AbstractWorker worker : workers) {
           if (worker.getSalary() > maxSalaryWorker.getSalary()) {
               maxSalaryWorker = worker;
           }
       }
        System.out.println("Worker with max salary is: " + maxSalaryWorker);
        System.out.println("Worker type: " + maxSalaryWorker.getClass().getSimpleName());

        if(maxSalaryWorker instanceof Director) {
            System.out.println("Our rich guy is Director");
            Director rich = (Director) maxSalaryWorker;
            rich.getDepartment();
        } else if (maxSalaryWorker instanceof Slave) {
            System.out.println("Our rich guy is Slave");
            Slave rich = (Slave) maxSalaryWorker;
        } */

    }
}
