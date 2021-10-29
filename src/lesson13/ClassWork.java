package lesson13;

import utils.BtaStringUtils;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        String sentence = "Hi Joe. I Am Joe too! Hi joe, them.";
        BtaStringUtils.printDuplicates(sentence);

        List<String> myList = new ArrayList();
        System.out.println(myList.size());
        myList.add("One");
        myList.add("6");
        myList.add("6.99");
        System.out.println(myList.size());
        String element = myList.get(0);
        boolean wasDeleted = myList.remove("6");
        boolean con = myList.containsAll(Arrays.asList("One", "6"));
    }
}
