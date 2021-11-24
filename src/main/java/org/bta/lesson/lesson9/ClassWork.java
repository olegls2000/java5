package org.bta.lesson.lesson9;


import org.bta.lesson.exception.UnsuffisientBalanceException;
import org.bta.lesson.exception.UnsuffisientPlacesException;
import org.bta.lesson.model.*;
import org.bta.lesson.model.Car;

public class ClassWork {

    public static void main(String[] args) throws UnsuffisientPlacesException, UnsuffisientBalanceException {
        Car bmw = new Car(3000, 1500);
        Car toyota = new Car(5000, 1500);
        Car honda = new Car(6000, 1500);
        final var autoStore = new AutoStore();
        autoStore.buyAuto(bmw) ;
        autoStore.buyAuto(toyota);
        autoStore.buyAuto(honda);

        try {
            autoStore.report();
            autoStore.sellAuto(0);
            autoStore.report();
            autoStore.sellAuto(4);
            autoStore.report();
            autoStore.sellAuto(1);
            autoStore.report();
        } catch (UnsuffisientPlacesException e) {
            e.printStackTrace();
        }


  /*      Director dir1 = new Director(200000, "TTT", "TTT");
        Director dir2 = new Director(300000, "TTT", "TTT");
        Director dir3 = new Director(400000, "TTT", "TTT");

        Slave slave1 = new Slave(3000, "AAA");
        Slave slave2 = new Slave(4000, "AAA");
        Slave slave3 = new Slave(5000, "AAA");   */

        AbstractWorker dir1 = new Director(200000, "TTT", "TTT");
        AbstractWorker dir2 = new Director(300000, "TTT", "TTT");
        AbstractWorker dir3 = new Director(400000, "TTT", "TTT");

        AbstractWorker slave1 = new Slave(3000, "AAA");
        AbstractWorker slave2 = new Slave(4000, "AAA");
        AbstractWorker slave3 = new Slave(5000, "AAA");

        AbstractWorker[] workers = {slave1, slave2, slave3, dir1, dir2, dir3};
        AbstractWorker maxSalaryWorker = workers[0];
  //TODO

        //      for (AbstractWorker worker : workers[0]) ;
   //     if (worker.getSalary() > maxSalaryWorker.getSalary()) ;
  //      maxSalaryWorker = worker;


 //       Director newDirector = new Director();
// instanceof  -
        //  наследование  . множественное наследование от нескольких объектов запрещено
        // комманда extends


    }
}
