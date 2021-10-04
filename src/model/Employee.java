package model;

public class Employee {
	int yearOfBirth;
	long salary;
	String firstName;
	String lastName;

	public Employee() {
		System.out.println("Default Constructor");
	}

	public Employee(int yearOfBirth) {
		this(yearOfBirth, 0l, null, null);
	}

	public Employee(int yearOfBirth,
					long salary,
					String firstName) {
		this(yearOfBirth, salary, firstName, null);

	}

	public Employee(int yearOfBirth, long salary, String firstName, String lastName) {
		System.out.println("All properties Constructor");
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;
		this.firstName = firstName;
		this. lastName = lastName;

	}

	void printInfo() {
		System.out.println("My name is: " + this.firstName);
	}

	//overload
	void printInfo(int time) {
		System.out.println("My name is: " + this.firstName);
	}

}