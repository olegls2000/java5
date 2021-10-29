package lesson9;

import model.*;

public class ClassWork {

    public static void main(String[] args) {

        Car bmw = new Car(100, 1500);
        Car toyota = new Car(5000, 1500);
        Car honda = new Car(6600, 1500);
        AutoStore autostore = new AutoStore();
        autostore.addCar(bmw, 0);
        autostore.addCar(toyota, 1);
        autostore.addCar(honda, 2);


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
