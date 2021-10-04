package model;

//TODO apply incapsulation

public class Employee {
    public int yearOfBirth;
    public long salary;
    public String firstName;
   public String lastName;

    public Employee() {
        System.out.println("Default Constructor");
    }


    public Employee(int yearOfBirth, long salary, String firstName) {
        this(yearOfBirth, salary, firstName, null); // что бы небыло у joe null во вкладке Main5
    }


    public Employee(int yearOfBirth, long salary, String firstName, String lastName) {
        System.out.println("All properties Constructor");
        this.yearOfBirth = yearOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    //public Employee(String firstName) {
      //  System.out.println("Custom Constructor");
        // this.firstName = firstName;


    public void printInfo() {
        System.out.println("My name is " + this.firstName + " " + this.lastName);
    }
// overload!!!!!
    // void printInfo(int time) { //метод может так же называться,только если разные параметры
       // System.out.println("My name is " + this.firstName + " " + this.lastName);
    //}
}
