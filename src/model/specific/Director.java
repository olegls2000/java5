package model.specific;

import annotation.BtaNumber;
import annotation.BtaStartWith;
import model.AbstractWorker;
import model.Circle;

public class Director extends AbstractWorker {

    @BtaStartWith(value = "A")
    private String department;

    @BtaNumber(min = 0, max = 99)
   private int employCount = -1;

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
