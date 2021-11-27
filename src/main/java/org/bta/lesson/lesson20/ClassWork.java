package org.bta.lesson.lesson20;

import org.bta.lesson.model.Circle;
import org.bta.lesson.model.specific.Director;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ClassWork {
    public static void main(String[] args) {
        BtaLambda anonymClassObject = new BtaLambda() {
            @Override
            public String returnSomething(String i, float number) {
                return i + number;
            }
        };
        System.out.println(anonymClassObject.returnSomething("Hello ", 77f));

        BtaLambda lambdaObject = (s, f) -> s + "???" + f;
        System.out.println(lambdaObject.returnSomething("Hello ", 77f));


        Predicate<Director> directorAgePredicate = d -> d.getSalary() > 100_000;

        List<Director> directorList = new ArrayList<>();
        directorList.add(new Director(90_000, "Joe", "Support"));
        directorList.add(new Director(120_000, "Nik", "Sales"));
        directorList.add(new Director(150_000, "Chuk", "IT"));

        List<Director> filtered = filterByPredicate(directorList, d -> d.getSalary() > 100_000);
        List<Director> filteredByName = filterByPredicate(directorList, d -> d.getFirstName().startsWith("N"));

        List<Circle> circles = Arrays.asList(new Circle(), new Circle());
        List<Circle> filteredCircles = filterByPredicate(circles, c -> c.getLength() > 30d);
        System.out.println(filteredCircles);

//        List<Circle> filteredCircles2 = filterByPredicate(circles,
//                c ->{
//
//            System.out.println("Hello from predicate: Length() > 30d");
//            return c.getLength() > 30d;
//        }

        Function<Director, String> mapToName = d -> d.getFirstName();
        List<String> directorNames = mapByFunction(directorList, d -> d.getFirstName());
        List<String> directorDepartments = mapByFunction(directorList, d -> d.getDepartment());
        System.out.println("Names: " + directorNames);
        System.out.println("Departments: " + directorDepartments);
    }

    static <T, R> List<R> mapByFunction(List<T> elements, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : elements) {
            R mappedObject = function.apply(element);
            result.add(mappedObject);
        }
        return result;
    }

    static <T> List<T> filterByPredicate(List<T> directors, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T director : directors) {
            if (predicate.test(director)) {
                filtered.add(director);
            }
        }
        return filtered;
    }

    static <T> List<T> streamFilter(List<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).collect(toList());
    }
}

