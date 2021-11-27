package org.bta.lesson.model.specific;

import org.bta.lesson.model.AbstractWorker;

public class Director extends AbstractWorker {
    private String department;

    public Director(int salary, String firstName, String department) {
        super(salary, firstName);
        this.department = department;
    }

    public Director() {
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
