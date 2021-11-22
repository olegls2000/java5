package org.bta.lesson.lesson5;

import org.bta.lesson.model.Circle;
import org.bta.lesson.model.Employee;

public class Main5 {
    public static void main(String[] args) {
        Employee vasja = new Employee();
        vasja.setFirstName("Vasilij");
        vasja.setLastName("Vasiljev");
        vasja.setSalary(5000);
        vasja.setYearOfBirth(1980);
        Employee petja = new Employee();
        petja.setFirstName("Petja");
        petja.setLastName("Petrov");
        petja.setSalary(7000);
        petja.setYearOfBirth(1970);

        vasja.printInfo();
        vasja.printInfo(4);
        petja.printInfo();

        Employee joe = new Employee(
                1985,
                4800l,
                "Joe", "Biden");

        Employee vladimir = new Employee(
                1987,
                4500l,
                "Vladimir", "Putin");


        Employee[] employees = {joe, vladimir};
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            System.out.println("Name: " + emp.getFirstName());
            System.out.println("Salary: " + emp.getSalary());
            if (emp.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println("Biggest salary has " + maxSalaryEmployee.getFirstName());



        Circle[] circles = new Circle[100];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
        System.out.println(circles);

        double maxLength = 0d;
        for (Circle cr: circles){
            if(cr.getLength() > maxLength) {
                maxLength = cr.getLength();
            }
        }
        System.out.println("Max Length: " + maxLength);
    }
}
