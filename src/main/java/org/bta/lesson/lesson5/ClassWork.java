package org.bta.lesson.lesson5;



import org.bta.lesson.model.Circle;
import org.bta.lesson.model.Employee;

import java.util.Arrays;

public class ClassWork {


        public static void main(String[] args) {
            Employee vasja = new Employee();
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
            vasja.printInfo(4);
            petja.printInfo();

            Employee joe = new Employee(1985, 4000l, "Joe",
                    "Biden");

            Employee vladimir = new Employee(1987, 4500l, "Vladimir",
                    "Putin");




            Employee[] employees = {joe, vladimir};

            Employee maxSalaryEmployee = employees[0];
            for (Employee emp : employees) {
                System.out.println("Name: " + emp.firstName);
                System.out.println("Lastname: " + emp.lastName);
                if (emp.salary > maxSalaryEmployee.salary) {
                    maxSalaryEmployee = emp;
                }
                System.out.println(" Max salary have  :" + maxSalaryEmployee.firstName);
            }
// ta ze zapis cherez stream
//TODO
//            Arrays.stream(employees)
//                   .max((emp1,emp2)-> (int) (emp1.salary - emp2.salary))
 //                   .ifPresent(  -> System.out.println("Max salary is: " + ));;





            Employee yangEmployee = employees[0];
            for (Employee emp : employees) {

                if (emp.yearOfBirth > yangEmployee.yearOfBirth) {
                    yangEmployee = emp;
                }
                System.out.println(" yang salary have  :" + yangEmployee.firstName);

                Circle[] circles = new Circle[100];
                for (int i = 0; i < circles.length; i++) {
                    circles[i] = new Circle();
                }
                System.out.println(circles);

                double maxLenght = 0d;
                for (Circle cr : circles) {
                    if (cr.getlenght() > maxLenght) {
                        maxLenght = cr.getlenght();
                    }
                }
                System.out.println("MAx lenght:  " + maxLenght);
            }


        }

    }









