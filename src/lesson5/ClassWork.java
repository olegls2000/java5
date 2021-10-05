package lesson5;

import model.Circle;
import model.Employee;

public class ClassWork {
    public static void main(String[] args) {
        Employee vasja = new Employee();
        //TODO setter
        vasja.firstName = "Vasilij";
        vasja.lastName = "Vasiljev";
        vasja.salary = 5000;
        vasja.yearOfBirth = 1980;

        Employee petja = new Employee();
        petja.firstName = "Petja";
        petja.lastName = "Petrov";
        petja.salary = 7000;
        petja.yearOfBirth = 1970;


        vasja.printInfo();
        petja.printInfo(4);
        petja.printInfo();

        Employee joe = new Employee(1985,
                4000l,
                "Joe",
                "Biden");

        Employee vladimir = new Employee(1987,
                4500l,
                "Vladimir",
                "Drozdov");


        Employee[] employees = {joe, vladimir};
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            //TODO Getter
            System.out.println("Name: " + emp.firstName);
            System.out.println("Salary: " + emp.salary);
            if (emp.salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println("Biggest salary has: " + maxSalaryEmployee.firstName);

        Employee yongestEmployee = employees[0];
        for (Employee emp : employees) {
            System.out.println("Name: " + emp.firstName);
            System.out.println("Last Name: " + emp.lastName);
            System.out.println("Age: " + emp.yearOfBirth);
            if (emp.yearOfBirth > yongestEmployee.yearOfBirth) {
                yongestEmployee = emp;
            }
        }
        Circle[] circles = new Circle[100];
        System.out.println(circles);
        for (int i = 0; i < circles.length; i++) {

            circles[i] = new Circle();
        }

        System.out.println(circles);

        double maxLength = 0d;
        for (Circle cr : circles) {
            if (cr.getLenght() > maxLength) {
                maxLength = cr.getLenght();
            }
        }

    }
}



