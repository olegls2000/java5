package lesson20;

import java.util.ArrayList;
import java.util.List;

// Параметризированный интерфейс
@FunctionalInterface
interface GenericInterface<T> {

    // параметризированный метод
    T func(T t);
}

public class HomeWork {

    // объявление списка
    static List<String> places = new ArrayList<>();

    // заполнение данными
    public static List<String> getPlaces() {

        // добавление страны и города
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        places.add("Estonia, Tallinn");

        return places;
    }

    public static void main( String[] args ) {

        var myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Фильтрация городов
        myPlaces.stream()
                .filter(p -> p.startsWith("Nepal"))
                .map(p -> p.toUpperCase())
                .sorted()
                .forEach(p -> System.out.println(p));

        // Объявление ссылки на параметризированный интерфейс
        // который принимает String
        // и присвоение ей лямбды
        GenericInterface<String> reverse = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("Lambda"));

        // Объявление ссылки на параметризированный интерфейс
        // который принимает Integer
        // и присвоение ей лямбды
        GenericInterface<Integer> factorial = n -> {

            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));
    }
}
