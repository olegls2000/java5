package org.bta.lesson.model.specific;

import org.bta.lesson.annotation.BtaNumber;
import org.bta.lesson.annotation.BtaStartWith;
import org.bta.lesson.model.AbstractWorker;
public class Director extends AbstractWorker {
    //@BtaStartwith(value = "A")
    @BtaStartWith("A")
    private String department;

    //@BtaStartWith("A")
    @BtaNumber(min = 0, max = 99)
    private int employCount;



    private String department1;

    public Director(int salary, String firstName, String department) {
        super(salary, firstName);
        this.department = department;
    }

    public Director() {
        System.out.println("Director constructor");
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

