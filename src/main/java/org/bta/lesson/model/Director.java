package org.bta.lesson.model;
import org.bta.lesson.annotation.StartWith;
import org.bta.lesson.model.AbstractWorker;

public class Director extends AbstractWorker {

    @StartWith(value = "A")
    private String department;

    //Constructor
    public Director (int salary, String firstName, String department) {
        this.department = department;
    }

    public Director() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
