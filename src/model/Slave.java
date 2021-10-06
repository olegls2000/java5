package model;

public class Slave {
    private int salary;
    private String firstName;

    public Slave(int salary, String firstName) {
        this.salary = salary;
        this.firstName = firstName;
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
}
