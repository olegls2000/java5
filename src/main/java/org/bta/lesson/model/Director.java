package org.bta.lesson.model;

public class Director extends AbstractWorker{
 /*   private int salary;
    private String firstname;  */
    private String department;

    public Director(int salary, String firstname, String department) {
       /* this.salary = salary;
        this.firstname = firstname;*/
        super(salary,firstname);
        this.department = department;
    }

    public Director() {
        System.out.println("Director constructor");

    }

    @Override
    public String toString() {
        return "Director{" +
                "department='" + department + '\'' +
                "} " + super.toString();
    }

    /*   public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }   */

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
