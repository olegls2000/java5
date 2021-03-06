package org.bta.lesson.model;


import org.bta.lesson.annotation.BtaNumber;

public abstract class AbstractWorker {
    @BtaNumber(min = 0, max = 50_000)
    private int salary;

    private String firstName;

    public AbstractWorker(int salary, String firstName) {
        this.salary = salary;
        this.firstName = firstName;
    }

    public AbstractWorker() {
        System.out.println("Abstract constr");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "AbstractWorker{" +
                "salary=" + salary +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
