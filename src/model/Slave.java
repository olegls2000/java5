package model;

public class Slave extends AbstractWorker {
    public Slave(int salary, String firstName) {
        super(salary, firstName);
    }

    public Slave() {
        System.out.println("Slave constr");
    }

}
