package org.bta.lesson.model;

public abstract class AbstractWorker {
    private int salary;
    private String firstName;

    public AbstractWorker(){

    }

    public AbstractWorker(int salary, String firstName) {
        salary = salary;
        this.firstName = firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
