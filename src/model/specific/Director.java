package model.specific;

import model.AbstractWorker;

    public class Director extends AbstractWorker {

    private String department;

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

