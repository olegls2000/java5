package model;

public class Slave extends AbstractWorker{

    public Slave(int salary, String firstName) {
        super(salary, firstName);
    }

    /*   private int salary;
    private String firstname;
*/

    public Slave() {
        System.out.println( " Slave constructor");

    }

    @Override
    public String toString() {
        return "Slave{} " + super.toString();
    }



    /*   public Slave(int salary, String firstname) {
        this.salary = salary;
        this.firstname = firstname;
    }

    public int getSalary() {
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
}
