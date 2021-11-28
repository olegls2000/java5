package org.bta.lesson.lesson5;

import org.bta.lesson.model.Circle;
import org.bta.lesson.model.Employee;

import java.util.Arrays;

//TODO rename
public class ClassWork {
    public static void main(String[] args) {
        Employee vasja = new Employee(); // new + конструктор = инициализация
        vasja.setLastName("Vasilij");
        vasja.setLastName("Vasiljev");
        vasja.setSalary(5000);
        vasja.setYearOfBirth(1980);


        Employee petja = new Employee();
        petja.setFirstName("Petja");
        petja.setLastName("Petrov");
        petja.setSalary(5000);
        petja.setYearOfBirth(1980);
        // vasja = petja; // ссылка на один объект - не обязательно

        vasja.printInfo();
        petja.printInfo();

        Employee joe = new Employee(1987, 5000l, "Joe", "Biden");
        Employee vladimir = new Employee(1987, 4500l, "Vladimir", "Putin");

// печатаем имя и фамилию самого молодого сотрудника
        Employee[] years = {joe, vladimir};
        Employee minYear = years[0];
        for (Employee emp : years) {
            System.out.println("Name " + emp.getFirstName());
            System.out.println("Salary " + emp.getYearOfBirth());
            if (emp.getYearOfBirth() > minYear.getYearOfBirth()) {
                minYear = emp;
            }
        }
        System.out.println("Самый молодой " + minYear.getFirstName() + " " + minYear.getLastName() + " " + minYear.getYearOfBirth());

// у кого самая большая зарплата







        Employee[] employees = {joe, vladimir}; // у кого самая большая зарплата
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            System.out.println("Name " + emp.getFirstName());
            System.out.println("Salary " + emp.getSalary());
            if (emp.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println("Biggest Salary has " + maxSalaryEmployee.getFirstName());


        Arrays.stream(employees)
                .max((employee1, employee2) -> (int) (joe.getSalary() - vladimir.getSalary()))
                .ifPresent(mse -> System.out.println("Max salary is: " + mse));




// создаём круги из вкладки Circle

        Circle[] circles = new Circle[100];
        // System.out.println(circles);
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
        System.out.println(circles);


        // Найти круг, с самой большой длинной окружности

        double maxLength = 0d;
        for (Circle cr : circles) {
            if (cr.getLength() > maxLength) {
                maxLength = cr.getLength();
            }
        }
        System.out.println("Max length: " + maxLength);
    }
}
