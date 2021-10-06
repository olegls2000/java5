package model;

public class AbstractWorker {
    private int salary;
    private String firstName;

    public AbstractWorker(int salary, String firstName) {
        this.salary = salary;
        this.firstName = firstName;
    }

    public AbstractWorker() {
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
