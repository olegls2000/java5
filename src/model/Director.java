package model;

public class Director {
    private int salary;
    private String firstName;
    private String department;

    public Director(int salary, String firstName, String department) {
        this.salary = salary;
        this.firstName = firstName;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
