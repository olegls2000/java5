package lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class HomeWork {
    public static void main(String[] args) {
        List<String> colors1 = new ArrayList<String>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Orange");
        colors1.add("White");
        colors1.add("Black");
        colors1.add("Baklazhan");
        colors1.add("Yellow");
        System.out.println("First edition: " + colors1);

        List<String> colors2 = new ArrayList<String>();
        colors2.add("Smetana");
        colors2.add("Margarin");
        colors2.add("Kopengagen");
        colors2.add("Alfabet");
        colors2.add("BBBBBB");
        colors2.add("4567FFA");
        colors2.add("U72");
        System.out.println("Second edition: " + colors2);

        Collections.copy(colors1, colors2);
        System.out.println("Copy First edition to seconf edition,\nAfter copy:");
        System.out.println("Edition 1: " + colors1);
        System.out.println("Edition 2: " + colors2);

        // Перемешать компоненты
        Collections.shuffle(colors2);
        System.out.println("List after shuffling:\n" + colors2);

        // Запустить в обратном порядке компоненты
        Collections.reverse(colors2);
        System.out.println("After Reversing");
        System.out.println(colors2);

        colors1.add("Zagar");
        System.out.println(colors1);

        // Добавление цвета на первую позицию
        colors1.add(0, "Arbuz");

        // Вытащить элемент
        String element = colors1.get(3);
        System.out.println("Third element is: " + element);

        // Изменение  конкретного элемента
        colors1.set(2, "Cosmos");
        System.out.println(colors1);

        // Удаление элемента
        colors1.remove(3);
        System.out.println(colors1);

        // Поиск конкретного элемента
        // Search the value Red

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color of an required element in arraylist");
        String Elementcolor = Scanner.nextLine(); */

        if (colors1.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

       /* System.out.println("Ща будет мясо nr 1");
        for (int i = 0; i < colors1.size(); i++) {
            System.out.print(colors1.get(i));
            System.out.print(", ");

            System.out.println("For-each loop");
            for (String color : colors1) {
                System.out.println(colors1);
                System.out.println(", ");
            } */

            ListIterator<String> iterate = colors1.listIterator();
            System.out.println("Iterating over ArrayList:");
            while(iterate.hasNext()) {
                System.out.println(iterate.next() + ", ");
            }
        }
    }




