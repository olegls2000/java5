package model;

public class Employee {
    private int yearOfBirth;
    private long salary;
    private String firstName;
    private String lastName;

    public Employee() {
        System.out.println("Default Constructor");
    }

    public Employee(int yearOfBirth) {
        this(yearOfBirth, 0l,
                null,
                null);
    }

    public Employee(int yearOfBirth,
                    long salary,
                    String firstName) {
        this(yearOfBirth, salary, firstName,
                null);
    }

    public Employee(int yearOfBirth, long salary,
                    String firstName, String lastName) {
        System.out.println("All properties Constructor");
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void printInfo() {
        System.out.println("My name is: " + this.firstName);
    }

    // overload!!!!
    public void printInfo(int time) {
        System.out.println("My name is: " + this.firstName);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
