package lesson20;

import model.Circle;
import model.specific.Director;

import java.util.*;
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

        System.out.println(anonymClassObject.returnSomething("Hello ", 77f));

        BtaLambda lambdaObject = (s, f) -> s + " ??? " + f;
        String sout = lambdaObject.returnSomething("Hello ", 6666f);
        System.out.println(sout);

        List<Director> directorList = new ArrayList<>();
        directorList.add(new Director(90_000, "Joe", "Support"));
        directorList.add(new Director(120_000, "Nik", "Sales"));
        directorList.add(new Director(150_000, "Chuk", "IT"));

        List<Director> filtered = filterByPredicate(directorList,
                d -> d.getSalary() > 100_000);
        System.out.println(filtered);

        var filteredByName = filterByPredicate(directorList,
                d -> d.getFirstName().startsWith("N"));

        List<Circle> circles = Arrays.asList(new Circle(), new Circle());
        //List<Circle> filteredCircles = filterByPredicate(circles, c -> c.getLength() > 30d);
        List<Circle> filteredCircles = circles.stream()
                .filter(circle -> circle.getLength() > 20)
                .collect(toList());

        System.out.println(circles.stream()
                .filter(circle -> circle.getLength() > 20)
                .collect(toList()));

        List<Circle> filteredCircles2 = filterByPredicate(circles,
                c -> {
                    System.out.println("Hello from predicate: Length() > 30d");
                    return c.getLength() > 30d;
                }
        );

        //List<String> directorNames = mapByFunction(directorList, d -> d.getFirstName());
        List<String> directorDepartments = mapByFunction(directorList, d -> d.getDepartment());
        System.out.println("Names: " +
                directorList.stream()
                        .map(director -> director.getFirstName())
                        .collect(toList())
        );
        System.out.println("Departments: " + directorDepartments);
        List<Double> circleLengths = mapByFunction(circles,
                c -> c.getLength()
        );
        System.out.println("Circle Lengths: " + circleLengths);

        List<String> itDirectorNames = directorList.stream()
                .peek(director -> System.out.println("before filter: " + director))
                .filter(director -> director.getDepartment().equals("IT"))
                .peek(director -> System.out.println("after filter: " + director))
                .map(director -> director.getFirstName())
                .collect(toList());

        System.out.println(itDirectorNames);

    }

    static <T, R> List<R> mapByFunction(List<T> elements,
                                        Function<T, R> function) {
        final List<R> result = new ArrayList<>();
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
        return collection.stream()
                .filter(predicate)
                .peek(e -> System.out.println(e))
                .collect(toList());
    }
}
