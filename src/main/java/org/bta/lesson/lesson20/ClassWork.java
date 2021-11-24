package org.bta.lesson.lesson20;

import org.bta.lesson.lesson10.Circle;
import org.bta.lesson.model.Director;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClassWork {
    public static void main(String[] args) {
        BtaLambda anonymClassObject = new BtaLambda() {
            @Override
            public String returnSomething(String i, float number) {
                return i + number;
            }
        };
        System.out.println(anonymClassObject.returnSomething("hello  ", 77f));
//zapisyvaem funkcional interfeis cherez Lambda
        BtaLambda lambdaObject = (String i, float f) -> {
            return i + "  ???  " + f;
        };
        // t.k. odin metod - Lambdu uproschaev
        BtaLambda lambdaObject1 = (String s, float f) -> s + "???" + f;
        // esche uproschaem
        BtaLambda lambdaObject2 = (s, f) -> s + "???" + f;
        System.out.println(lambdaObject2.returnSomething("Hi!! ", 777777f));
//Predicate

        //      Predicate<Director> directorSalaryPredicate = (Director d) -> {
        //          return d.getSalary() > 100000;
        //      };
        // sokraschaem

        Predicate<Director> directorSalaryPredicate = d -> d.getSalary() > 100000;


        List<Director> directorList = new ArrayList<>();
        directorList.add(new Director(90000, "Joe", "Support"));
        directorList.add(new Director(100000, "Alx", "Sales"));
        directorList.add(new Director(200000, "Alex", "IT"));


        List<Director> filtered = filterByPredicate(directorList,
                d -> d.getSalary() > 100000);
        System.out.println(filtered);

        List<Director> filteredByName = filterByPredicate(directorList,
                d -> d.getFirstName().startsWith("N"));
        System.out.println(filtered);


        List<Circle> circles = Arrays.asList(new Circle(), new Circle());
        //    List<Circle> filteredCircles = filterByPredicate(circles, c -> c.getPerimeter() > 30d);
        List<Circle> filteredCircles = circles.stream()
                .filter(circle -> circle.getPerimeter() > 20)
                .collect(Collectors.toList());

        System.out.println(filteredCircles);

        List<Circle> filteredCircles2 = filterByPredicate(circles, c -> {
                    System.out.println("Hello from predicate:  Lenght > 30d ");
                    return c.getPerimeter() > 30d;

                }
        );

//Function

        //      List<String> directorNames = mapByFunction(directorList, d -> d.getFirstName());
        List<String> directorDepartments = mapByFunction(directorList, d -> d.getDepartment());
        System.out.println("Names  :" + directorList.stream()
                .map(director -> director.getFirstName())
                .collect(Collectors.toList()));

        System.out.println("Departments :  " + directorDepartments);

        List<String> circleLengths = mapByFunction(circles,
                c -> String.valueOf(c.getPerimeter())
        );
        System.out.println(" Circle lengnh : " + circleLengths);

        List<String> idDirectorNames  = directorList.stream()
                .peek(director ->
                        System.out.println(" before filter  : " + director))
                .filter(director -> director.getDepartment().equals("IT"))
                .peek(director -> System.out.println(" after filter : " + director))
                .map(director -> director.getFirstName())
                .collect(Collectors.toList());

        System.out.println();


    }

    static <T, R> List<R> mapByFunction(List<T> elements, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : elements) {
            R mappedObject = function.apply(element);
            result.add(mappedObject);
        }
        return result;
    }


    static <T> List<T> filterByPredicate(List<T> directors,
                                         Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T director : directors) {
            if (predicate.test(director)) {
                filtered.add(director);
            }
        }
        return filtered;

    }

    static <T> List<T> streamFilter(List<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).collect(Collectors.toList());

    }


}


