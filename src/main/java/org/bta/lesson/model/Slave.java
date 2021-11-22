package org.bta.lesson.model;

public class Slave extends AbstractWorker {

    public Slave(int salary, String firstName) {
        super(salary, firstName);
    }

    public Slave() {
        super.setFirstName("Joe");
        System.out.println("Slace constr");
    }

    @Override
    public String toString() {
        return "Slave{} " + super.toString();
    }

    private void someSecretMessage() {
        System.out.println(super.getFirstName() + "Heeelp me");
    }

    private void greatMethod(){
        System.out.println(super.getFirstName() + " - I am Great!!!");
    }

}


