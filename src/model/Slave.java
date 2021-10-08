package model;

public class Slave extends AbstractWorker {
    private int salary;
    private String firstName;

    public Slave() {
    }

    public Slave(int salary, String firstName, int salary1, String firstName1) {
        super(salary, firstName);
        this.salary = salary1;
        this.firstName = firstName1;
    }
}