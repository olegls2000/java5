package org.bta.lesson.model;

//TODO add incapsulation
public class Employee {
	private int yearOfBirth;
	private long salary;
	private String firstName;
	private String lastName;

	public int getYearOfBirth(){
		return yearOfBirth;
	}
	public long getSalary() {
		return salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setYearOfBirth(int newYearOfBirth) {
		yearOfBirth = newYearOfBirth;
	}
	public void setSalary(long newSalary) {
		salary = newSalary;
	}
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

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

	public void printInfo() {
		System.out.println("My name is: " + this.firstName);
	}

	//overload
	public void printInfo(int time) {
		System.out.println("My name is: " + this.firstName);
	}

}