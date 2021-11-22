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
				return i + " | " + number;
			}
		};
		System.out.println(anonymClassObject.returnSomething("Hello", 77f));

		// nize uproshaem BtaLambda lambdaObject = (String i, float f) -> {return i + "???" + f;};
		BtaLambda lambdaObject = (i, f) -> i + "???" + f;
		System.out.println(lambdaObject.returnSomething("Hello", 6666f));

		//nize uproshaem
		// Predicate<Director> directorSalaryPredicate = (Director d) -> {
		//return d.getSalary()>100_000;
		Predicate<Director> directorSalaryPredicate = d -> d.getSalary() > 100_000;

		List<Director> directorList = new ArrayList<>();
		directorList.add(new Director(90_000, "Joe","Support"));
		directorList.add(new Director(120_000, "Nik","Sales"));
		directorList.add(new Director(150_000, "Chuk","IT"));

		List<Director> filtered = filterByPredicate(directorList, directorSalaryPredicate);
		System.out.println(filtered);

		// uproshaem nize
		var filteredByName = filterByPredicate(directorList,
				d -> d.getFirstName().startsWith("N"));
		List<Circle> circles = Arrays.asList(new Circle(), new Circle());
		//List<Circle> filteredCircles = filterByPredicate(circles, c -> c.getLength() > 30d);
		List<Circle> filteredCircles = circles.stream()
						.filter(circle -> circle.getLength() > 20)
								.collect(Collectors.toList());

		System.out.println(filteredCircles);
		List<Circle> filteredCircles2 = filterByPredicate(circles,
		c -> {
			System.out.println("Hello from predicate: Lenght() > 30d");
			return c.getLength() > 30d;
		}
		);

		// uproshaem Function<Director, String> mapToName = (Director d) -> {return d.getFirstName(); };
		Function<Director, String> mapToName =  d -> d.getFirstName();
		//List<String> directorNames = mapByFunction(directorList, d -> d.getFirstName());
		List<String> directorDepartments = mapByFunction(directorList, d -> d.getDepartment());
		System.out.println("Names: " +
				directorList.stream()
						.map(director -> director.getFirstName())
						.collect(Collectors.toList())
		);
		System.out.println("Departments: "+ directorDepartments);
		List<String> circleLenghts = mapByFunction(circles,
				circle -> String.valueOf(circle.getLength())
		);
		System.out.println("Circle Lenghts: " + circleLenghts);

		List<String> itDirectorNames = directorList.stream()
				.peek(director -> System.out.println("before filter: " + director))
				.filter(director -> director.getDepartment().equals("IT"))
				.peek(director -> System.out.println("after filter: " + director))
				.map(director -> director.getFirstName())
				.collect(toList());

		System.out.println(itDirectorNames);
	}

	static<T, R> List<R> mapByFunction(List<T> elements,
									   Function<T, R> function) {
		final List<R> result = new ArrayList<>();
		for(T element : elements) {
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

	// Stream nize
	static <T> List<T> streamFileter(List<T> collection, Predicate<T> predicate) {
		return collection.stream().filter(predicate).collect(Collectors.toList());
	}
}


