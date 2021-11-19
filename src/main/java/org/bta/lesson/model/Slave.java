package org.bta.lesson.model;

public class Slave extends AbstractWorker {
    private int salary;
    private String firstName;

    public Slave() {
        super.setFirstName("Joe");
        System.out.println("Slave constr");
    }

    public Slave(int salary, String firstName){
        super(salary, firstName);
    }

    public Slave(int salary, String firstName, int salary1, String firstName1) {
        super(salary, firstName);
        this.salary = salary1;
        this.firstName = firstName1;
    }

    private void secretMethod(){
        System.out.println("Heeeelp me!");
    }

    private void greatMethod(){
        System.out.println("I am great!");
    }
}