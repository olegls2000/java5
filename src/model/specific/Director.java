package model.specific;

import model.AbstractWorker;
import model.Circle;

public class Director extends AbstractWorker {

    private String department;

    public Director(int salary, String firstName, String department) {
        super(salary, firstName);
        this.department = department;
    }

    public Director() {
        //super();
        System.out.println("Director constr");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Director{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }
}
