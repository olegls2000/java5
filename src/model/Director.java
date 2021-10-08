package model;
import model.AbstractWorker;

public class Director extends AbstractWorker {
    private String department;

    //Constructor
    public Director (int salary, String firstName, String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
