package lesson5;

public class Main5 {
    public static void main(String[] args) {
        Employee vasja = new Employee(); // new + конструктор = инициализация
        vasja.firstName = "Vasilij";
        vasja.lastName = "Vasiljev";
        vasja.salary = 5000;
        vasja.yearOfBirth = 1980;


        Employee petja = new Employee();
        petja.firstName = "Petja";
        petja.lastName = "Petrov";
        petja.salary = 5000;
        petja.yearOfBirth = 1980;
        // vasja = petja; // ссылка на один объект - не обязательно

        vasja.printInfo();
        petja.printInfo();

        Employee joe = new Employee(1987, 5000l, "Joe", "Biden");
        Employee vladimir = new Employee(1987, 4500l, "Vladimir", "Putin");

// печатаем имя и фамилию самого молодого сотрудника
        Employee[] years = {joe, vladimir};
        Employee minYear = years[0];
        for (Employee emp : years) {
            System.out.println("Name " + emp.firstName);
            System.out.println("Salary " + emp.yearOfBirth);
            if (emp.yearOfBirth > minYear.yearOfBirth) {
                minYear = emp;
            }
        }
        System.out.println("Самый молодой " + minYear.firstName + " " + minYear.lastName + " " + minYear.yearOfBirth);

// у кого самая большая зарплата

        Employee[] employees = {joe, vladimir}; // у кого самая большая зарплата
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            System.out.println("Name " + emp.firstName);
            System.out.println("Salary " + emp.salary);
            if (emp.salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = emp;
            }
        }
        System.out.println("Biggest Salary has " + maxSalaryEmployee.firstName);

// создаём круги из вкладки Circle

        Circle[] circles = new Circle[100];
        // System.out.println(circles);
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();
        }
        System.out.println(circles);

        // Найти круг, с самой большой длинной окружности

        double maxLength = 0d;
        for (Circle cr: circles) {
            if(cr.getLength() > maxLength) {
                maxLength = cr.getLength();
            }
        }
        System.out.println("Max length: " + maxLength);
    }
}
