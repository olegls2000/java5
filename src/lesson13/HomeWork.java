package lesson13;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        List<String> color = new ArrayList<String>();
        List<String> coloradd = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Black");
        coloradd.add("Ultramarine");
        coloradd.add("Rose");
        coloradd.add("Violet");
        color.add("Yellow");
        color.add("Purple");
        color.add("White");
        color.add("Orange");
        color.add("Dark blue");
        color.add(0, "Flash"); // ставим Flash первым в индексе
        boolean isAdded = color.addAll(coloradd);
        System.out.print(color); // как эту чёртову хрень замиксовать со всем списком?
        String element2 = color.get(7);
        System.out.println();
        System.out.println();
        System.out.println("Вытаскиваем рандомный 8-й элемент: " + element2);
        Collections.shuffle(color);
        Collections.shuffle(coloradd);
        color.remove("Flash"); // в *** Flash
        color.add(0, "Flash"); // ставим Flash первым в индексе
        System.out.println();
        System.out.println("Random:");
        System.out.println(color + "" + coloradd);
        System.out.println();
        String element = color.get(7);
        System.out.println("Вытаскиваем рандомный 8-й элемент из реверса: " + element);
        System.out.println();

        ArrayList<String> land = new ArrayList<String>(); // итератор. В чём отличия от предыдущего?
        land.add("Slovakia");
        land.add("Finland");
        land.add("Norway");
        land.add("Sweden");
        land.add("Russia");
        land.add("Latvia");
        land.add("Poland");
        Iterator<String> iter = land.iterator();
        while (iter.hasNext()) {
            System.out.println("Country: " + iter.next());
        }
        Iterator<String> iterReverse = land.iterator();
        while (iterReverse.hasNext()) {
            Collections.reverse(land);
            System.out.println("Reverse Country: " + iterReverse.next());
        }
        if (color.contains("Blue")) {
            System.out.println("Первый элемент найден");
        } else {
            System.out.println("Первый элемент НЕ найден");
        }
        if (coloradd.contains("Ultramarine")) {
            System.out.println("Второй элемент найден");
        } else {
            System.out.println("Второй элемент НЕ найден");
        }
        if (land.contains("Estonia")) {
            System.out.println("Страна найдена");
        } else {
            System.out.println("Страна НЕ найдена");
        }
    }
}
