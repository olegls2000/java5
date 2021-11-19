package org.bta.lesson.Lesson20;

import org.bta.lesson.model.Circle;
import org.bta.lesson.model.Director;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ClassWork {
    public static void main(String[] args) {

        BtaLambda anonymClassObject = new BtaLambda() {
            @Override
            public String returnSomething(String i, float number) {
                return i + " | " + number;
            }
        };

        System.out.println(anonymClassObject.returnSomething("Hello", 77f));
        BtaLambda lambdaObject = (i, f) -> i + "???" + f;

        Predicate<Director> directorSalaryPredicate = d -> d.getSalary() > 100_000;
        List<Director> directorList = new ArrayList<>();

        directorList.add(new Director(90_000, "Joe", "Support"));
        directorList.add(new Director(120_000, "Nik", "Sales"));
        directorList.add(new Director(150_000, "Chuk", "IT"));

        List<Director> filtered = filterByPreicate(directorList, d -> d.getSalary() > 100_000);
        System.out.println(filtered);

        List<Director> filteredByName = filterByPreicate(directorList, d -> d.getFirstName().startsWith("N"));

        List<Circle> circles = Arrays.asList(new Circle(), new Circle());
        // List<Circle> filteredCircles = filterByPreicate(circles, c -> c.getLenght() > 30d);
        List<Circle> filteredCircles = circles.stream()
                .filter(circle -> circle.getLenght() > 20)
                .collect(toList());

        List<Circle> filteredCircles2 = filterByPreicate(circles, c -> {
                    System.out.println("Hello from predicate");
                    return c.getLenght() > 30d;
                }
        );

        Function<Director, String> mapToName = d -> d.getFirstName();
        List<String> directorNames = mapByFunction(directorList, d -> d.getFirstName());
        System.out.println("Names: " +
                directorList.stream()
                        .map(director -> director.getFirstName())
                        .collect(toList())
        );
                List<String> directorDepartment = mapByFunction(directorList, d -> d.getDepartment());

        List<Double> circleLength = mapByFunction(circles,
                c -> (c.getLenght())
        );
        System.out.println("Circle Lengths: " + circleLength);
    }

    static <T, R> List<R> mapByFunction(List<T> elements, Function<T, R> function) {
        final List<R> result = new ArrayList<>();
        for (T element : elements) {
            R mappedObject = function.apply(element);
            result.add(mappedObject);
        }
        return result;
    }

    static <T> List<T> filterByPreicate(List<T> directors, Predicate<T> predicate) {

        List<T> filtered = new ArrayList<>();
        for (T director : directors) {
            if (predicate.test(director)) {
                filtered.add(director);
            }
        }
        return filtered;
    }

    static <T> List<T> streamFilter(List<T> collection, Predicate<T> predicate) {

        return collection.stream()
                .filter(predicate)
                .peek(e -> System.out.println(e))
                .collect(Collectors.toList());
    }
}
